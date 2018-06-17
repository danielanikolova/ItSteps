package copyFilesTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayDeque;

public class CopyManager {

	private File source;
	private File destination;
	
	/**
	 * copies files between source and destinatiln Throws illegal argument exception
	 * if sourec or destination is null
	 * 
	 * @parm source
	 */
	public CopyManager(String source, String destination) {
		if (source == null)
			throw new IllegalArgumentException("File name cannot be null.");
		this.source = new File(source);
		this.destination = new File(destination);
	}

	/**
	 * Check whether there are files in the source directory, return true if
	 * directory is empty
	 */
	public boolean checkEmptyDirectory() {

		return source.listFiles().length == 0;

	}

	/*
	 * This method copies files according to the disc of the source and destination file. Throws 
	 * FileLockException if one of the directories is locked by another process.
	 */
	public void copyFiles() throws IOException {

		if (getDriveLetterFromFile(source).equals(getDriveLetterFromFile(destination))) {
			try {
				checkLockedDirectory(source);
				checkLockedDirectory(destination);
			} catch (FileLockedException e) {
				e.getMessage();
				return;
			}			
			copyFilesToCurrentDisc();
		} else {
			
			try {
				checkLockedDirectory(source);
			} catch (FileLockedException e) {
				e.getMessage();
				return;
			}				
			copyFilesToOtherDisc(source, destination);
		}

	}

	/*
	 * Here we check of the directory is locked. The method throws FileLockException if the file is 
	 * locked by another process.
	 */
	private void checkLockedDirectory(File file) throws FileLockedException {
		if (!file.canWrite()) {
				throw new FileLockedException();			
		}
		
	}

	private String getDriveLetterFromFile(File file) {
		String filePath = file.getPath();
		Path path = Paths.get(filePath);
		Path driveLetter = path.getRoot();
		return driveLetter.toString();
	}

	private void copyFilesToCurrentDisc() throws IOException {

		ArrayDeque<File> files = new ArrayDeque<>();
		
		for (File file : source.listFiles()) {
			files.add(file);
		}

		File currentFile = null;

		Path sourcePath;
		Path destinationPath;

		while (!files.isEmpty()) {

			currentFile = files.pop();

			sourcePath = Paths.get(currentFile.getPath());
			destinationPath = Paths.get(destination.getPath() + File.separator + currentFile.getName());

			Files.move(sourcePath, destinationPath, StandardCopyOption.ATOMIC_MOVE);

		}
	}

	private void copyFilesToOtherDisc(File sourceFile, File destinationFile) throws IOException {
		
		for (File currentFile : sourceFile.listFiles()) {

			FileChannel sourceChannel = null;
			FileChannel destChannel = null;
			File newDestinationFile = null;
			if (currentFile.isDirectory()) {
				
				newDestinationFile = new File(destinationFile.getPath() 
						+ File.separator + currentFile.getName());
				
				if (!newDestinationFile.exists()) {
					destinationFile.mkdir();
				}
				copyFilesToOtherDisc(currentFile, newDestinationFile);
				
			}else {
				sourceChannel = new FileInputStream(currentFile).getChannel();
				newDestinationFile = new File(destinationFile.getPath() 
						+ File.separator + currentFile.getName());
				
				if (!newDestinationFile.exists()) {
					destinationFile.mkdir();
				}
				
				destChannel = new FileOutputStream(newDestinationFile).getChannel();
			}
			
			if (destChannel == null || sourceChannel == null) {
				continue;
			}
						
			destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
			sourceChannel.close();
			destChannel.close();
			
		}
		
	}

	public void removeFiles() throws IOException {
		
		for (File file : source.listFiles()) 
		{
			if (file.isDirectory()) {
				checkAndDelete(file);
				Files.delete(Paths.get(file.getPath()));
			}else {
				Files.delete(Paths.get(file.getPath()));
			}
		}
		
	}

	private void checkAndDelete(File file) throws IOException {
		
		ArrayDeque<File> files = new ArrayDeque<>();
		
		for (File currentFile : file.listFiles()) {
			files.add(currentFile);
		}
		
		File fileToDelete = null;
		
		while (!files.isEmpty()) 
		{
			fileToDelete = files.pop();
			
			if (fileToDelete.isDirectory()) {
				checkAndDelete(fileToDelete);
				Files.delete(Paths.get(fileToDelete.getPath()));
			}else {
				Files.delete(Paths.get(fileToDelete.getPath()));
			}
			
			
		}
		
	}

}
