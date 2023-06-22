

class mythread extends Thread{
	
	public mythread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("Thank you..... "+this.getName());
	}
}

public class common_thread_constructors {

	public static void main(String[] args) {
		
		mythread m = new mythread("Arya");
		m.start();
		System.out.println("ID of the thread is "+m.getId());  // return the id of the thread......
		System.out.println("Name of the thread is "+m.getName());

	}

}
