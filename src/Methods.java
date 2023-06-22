
/*

A method is a function written inside a class. Since Java is an oop language, we need to write the method inside some class.

Syntax to define a method or a function:

		data-type function_name(){
			function body...
		}
Calling a method :
		A method can be called by creating an object of that class in which the method exists followed by the method call.
		
		Calc obj = new Calc(); ---> object creation
		obj.add(a,b); ---> method call upon on object
		
		Syntax for creating an object of a class :
					
					class_name object_name = new Class_name();
					object_name.fuction_name();
					
Static keyword is used to associate a method of a given class with the class rather than the object. Static method in a class is shared by all the objects.


*/

import java.util.Scanner;

public class Methods {
	
	 static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
		
//		System.out.println(add(a,b)); --> normal way of calling a function
		
		
		// calling a function by creating an object of that class
		
		Methods obj=new Methods(); // creating an object
//		int c=obj.add(a, b);
//		System.out.println(c);
		System.out.println(obj.add(a, b));
		System.out.println(Methods.add(a,b)); // when a function uses a static keyword, we can access the class and its function without creating an object.

	}

}
