package task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayDeque;

public class CopyManager {
    
    BufferedReader br;
    BufferedWriter bw;
    File source;
    File destination;
    ArrayDeque<File>files = new ArrayDeque<>();
    
    public CopyManager(String source, String destination) {
	this.source = new File(source);
	this.destination = new File(destination);
    }
    
    public boolean checkEmptyDirectory() {
	
	if (this.source.listFiles().length<=0) 
	{
	    return true;
	}else {
	    for (File file : this.source.listFiles()) 
	    {
		    files.add(file);
		}
	    
	    return false;
	}
	
    }
    
    public void copyFiles() throws IOException {
	
	
	
	File currentFile = null;
	
	while (!files.isEmpty()) {
	    
	    currentFile = files.pop();
	    
	    br = new BufferedReader(new FileReader(currentFile));
	    bw = new BufferedWriter(new FileWriter(new File(destination + File.separator + currentFile.getName())));
	    
	    String line = br.readLine();

            while(line !=null){
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
	    	
            bw.flush();
            br.close();
            bw.close();	    
	    
            Files.deleteIfExists(currentFile.toPath());
            
	}
    }
    
    
    
    
    

}
