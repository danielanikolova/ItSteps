package transferDirectoryTask;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

	private static final String sourceFile = "\\com.seeburger.simpleTasks\\FromDirectory";
	
	public static void main(String[] args) throws IOException {
	
		
		long startTime = System.currentTimeMillis();
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		
		
		
			
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
