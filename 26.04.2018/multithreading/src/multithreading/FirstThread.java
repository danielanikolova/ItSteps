package multithreading;

public class FirstThread implements Runnable{
	
	private Synchronizator sync;
	
	public FirstThread(Synchronizator sync) {
		this.sync = sync;
		Thread.currentThread().setPriority(10);
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " " + "My first thread is in running state."); 
		sync.print(1, 150);
		System.out.println(Thread.currentThread().getName());
	}

}
