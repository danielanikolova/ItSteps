package multithreading;

public class SecondThread implements Runnable{
	
	private Synchronizator sync;
	
	public SecondThread(Synchronizator sync) {
		this.sync = sync;
		Thread.currentThread().setPriority(1);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " +"My second thread is in running state."); 
		sync.print(150, 300);
		System.out.println(Thread.currentThread().getName());
		
	}

}
