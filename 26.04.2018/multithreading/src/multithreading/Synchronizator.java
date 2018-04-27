package multithreading;

public class Synchronizator 
{
	//method not synchronized  
	public void  print(int n, int m)
	{   
		   for(int i=n;i<=m;i++)
		   {  
		     System.out.println(i + " " + Thread.currentThread().getName());  
		    
		     try
		     {  
		     Thread.sleep(400);  
		     }catch(InterruptedException e){System.out.println(e);}  
		     
		   }  

	}
}
