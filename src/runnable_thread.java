
// Creating a runnable thread.....


class Mythread1 implements Runnable{
		
	int i=0;
	@Override
	public void run() {
//		while(i<50) {
//		System.out.println("I am thread 1.....");
//		i++;
//		}
		
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		System.out.println("I am thread 1.....");
		
		
	}
	
}

class Mythread2 implements Runnable{

		int i=0;
	@Override
	public void run() {
//		while(i<50) {
//		System.out.println("I am thread 2.....");
//		i++;
//		}
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
		System.out.println("I am thread 2.....");
	}
	
}


public class runnable_thread {

	public static void main(String[] args) {
		
		Mythread1 bullet1 = new Mythread1();
		Thread gun1 = new Thread(bullet1); // we must create an object for an Thread class to start the thread and pass the class object as an parameter to the constructor.
		
		Mythread2 bullet2 = new Mythread2();
		Thread gun2 = new Thread(bullet2);
		
//		bullet1.start(); // we cannot use like this as we did in Thread class
//		bullet2.start();
		
		gun1.start();  // to start the thread......
		gun2.start();

		
	}

}
