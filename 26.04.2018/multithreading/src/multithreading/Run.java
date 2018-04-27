package multithreading;

public class Run {

	public static void main(String[] args) {
		
		Synchronizator sync = new Synchronizator();
	
		FirstThread firstThread = new FirstThread(sync);
		SecondThread secondThread = new SecondThread(sync);
		
		Thread threadObject =new Thread(firstThread);
		Thread threadObject2 = new Thread(secondThread);
		
		
		threadObject.start();
		threadObject2.start();
		
		

	}

}
