


class thread extends Thread{
	public thread(String name) {
		super(name);
	}
	
	public void run() {
		int i=0;
		while(i<15) {
		System.out.println("I am thread "+this.getName());
		i++;
		}
	}
}
public class thread_priorites {

	public static void main(String[] args) {
		
		thread t1 = new thread("thread 1");
		thread t2 = new thread("thread 2");
		thread t3 = new thread("thread 3");
		thread t4 = new thread("thread 4");
		thread t5 = new thread("thread 5 (most important)");
		
		t5.setPriority(Thread.MAX_PRIORITY); // max = 10
		t1.setPriority(Thread.MIN_PRIORITY); // min = 1;
		t2.setPriority(Thread.NORM_PRIORITY); // normal = 5;
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
