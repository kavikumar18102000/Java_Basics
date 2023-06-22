
/*

Two or more functions can have same name but different parameters. Such methods are called overloaded methods.


NOTE : overloaded functions cannot be performed by changing the return-type of the methods. 

*/


public class Method_Overloading {
	
	static int add(int a,int b) {
		return a+b;
	}
	
	static void add() {
		float b=88.3f;
		float a=55.5f;
		System.out.println(a+b);
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition of two integers are "+Method_Overloading.add(10,20));
		Method_Overloading.add();
		System.out.println("Addition of three intgers are "+Method_Overloading.add(20,70,40));
		
		
	}

}
