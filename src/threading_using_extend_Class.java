
/*
 
 Creating thread by extending the 'Thread' class (in built).
 
Threads allots some time for the all functions, if the function not completing its work with in the time and takes more time , the next function gets to work.
This continues until the task is completed.


*/

class My_thread1 extends Thread{
	
	public void run() { // inbuilt function in Thread class
		int i=1;
		while(i<=10) {
		System.out.println("Time alloted for me, Mythread 1 is running");
		i++;
		}
	}
}

class My_thread2 extends Thread{
	
	public void run() {
		int i=0;
		while(i<=10) {
		System.out.println("Time alloted for me now, Mytheread2 is running");
		i++;
		}
	}
}

public class threading_using_extend_Class {

	public static void main(String[] args) {
		
		My_thread1 t1 = new My_thread1();
		My_thread2 t2 = new My_thread2();
		
		t1.start();  // to start a thread we use object_name.start() function which is in built inside Thread class.
		t2.start();

	}

}
