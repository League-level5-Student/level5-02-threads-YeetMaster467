package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	
	int id;
	
	@Override
	public void run() {
		System.out.println("Greetings from thread number " + id + "!");
		if (id < 50) {
			Thread t = new Thread (() -> {
				new ThreadedGreeter(id + 1).run();
			});
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	ThreadedGreeter(int id){
		this.id = id;
	}
	
}
