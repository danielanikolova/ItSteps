package transferDirectoryTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.management.Query;

public class Run {

	private static final String sourceFile = "\\com.seeburger.simpleTasks\\FromDirectory\\";
	
	public static void main(String[] args) throws IOException {
	
		
		long startTime = System.currentTimeMillis();
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		
		BufferedReader br = new BufferedReader(new FileReader("\\com.seeburger.simpleTasks\\FromDirectory\\studentsInfo.txt"));
		
		 File directory = new File("\\com.seeburger.simpleTasks\\FromDirectory\\studentsInfoCopy.txt");
		 
		 Queue<String> filePaths = new ArrayDeque<>();

		if (directory.isDirectory()) {
			for (File file : directory.listFiles()) {
				filePaths.add(file.getAbsolutePath());
			}
		}
		
		String path = "\\com.seeburger.simpleTasks\\FromDirectory\\studentsInfo";
		
		int counter = 1;
		
		for (String string : filePaths) {
			File f = new File(path + counter + ".txt");
			
		}
		
			
		long endTime = System.currentTimeMillis();
		System.out.println("Total time: " + (endTime - startTime));

//			 if (sourceFile.isDirectory())
//			    {
//			        for (File file : sourceFile.listFiles())
//			        {
//			        	Files.move(new File("//com.seeburger.simpleTasks//FromDirectory").toPath(),
//			        			new File("//com.seeburger.simpleTasks//ToDirectory").toPath(), 
//			        			StandardCopyOption.REPLACE_EXISTING);
//			        }
//			    }
			   
		
	}

}
