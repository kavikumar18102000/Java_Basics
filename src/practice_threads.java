
class pr_threads extends Thread{
	public void run() {
	while (true) {
		
		try {
			Thread.sleep(200);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Good morning....");		
	}
	}
}

class pr_threads2 extends Thread{
	public void run() {
		while(true) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Welcome.....");
		}
	}
}

public class practice_threads { 
	public static void main(String[] args) {
		
		pr_threads p = new pr_threads();
		pr_threads2 q = new pr_threads2();
		
		p.setPriority(6);
		q.setPriority(10);
		
		System.out.println(p.getPriority());
		System.out.println(q.getPriority());
		
		System.out.println(p.getState());
		System.out.println(q.getState());
		
//		p.start();
		q.start();
		System.out.println(q.getState());
		System.out.println(Thread.currentThread().getState()); // returns reference to the current thread.....
	}

}
