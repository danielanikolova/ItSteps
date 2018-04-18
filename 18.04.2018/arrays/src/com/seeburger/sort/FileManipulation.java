package com.seeburger.sort;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileManipulation {
	
	private List<String> arrFiles = new ArrayList<>();
	
	
	/*
	 * Finds all the files in concrete directory
	 */
	public void findFiles(File directory) 
	{

		File[] lists = directory.listFiles();
		
		for (File f:lists) 
		{
			if (f.isDirectory()) 
			{			
				this.arrFiles.add("* This is directory: "+ f.getAbsolutePath());
				findFiles(f);
			} 
			else 
			{
				this.arrFiles.add(f.getPath());
			}
			
		}
		
	}
	
	/*
	 * Here we print the files in concrete directory
	 */
	
	public void printFilesInDirectory() 
	{
		for (int i = 0; i < this.arrFiles.size(); i++) 
		{
			System.out.println(this.arrFiles.get(i));
		}
		
	}

}
