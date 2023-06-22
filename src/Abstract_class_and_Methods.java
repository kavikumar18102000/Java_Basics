
/*

Abstract method : A method declared without an implementation...
					example : abstract void move_to(double x, double y) ---> method without implementation....

Abstract class : If a class includes abstract methods, then the class must be declared itself as abstract...

						example : public abstract class Phone_model{
										abstract void switch_off();
										//more code....
								  }


Abstract class provides a standard format of a class that the sub-class must use the methods available in abstract class.
An instance cannot be create for a abstract class. But can be created for a sub-class of abstract class...


NOTE : * It is possible to create reference of an abstract class...
	   * It not to possible to create an object of an abstract class....
	   
*/

abstract class Parent{
	public Parent() {
		System.out.println("I am an Parent....");
	}
	
	abstract public void greet();
}

class child_1 extends Parent{
	public void greet() {
		System.out.println("I am a child_1 of abstract class parent.....");
	}
	public void good() {
		System.out.println("hi,,i am good....");
	}
}

class child_2 extends Parent{
	 public void greet() {
		System.out.println("I am a child-2 of Parent");
	 }
	 
	 public void th() {
		 System.out.println("hello, greeting from child2");
	 }
}

public class Abstract_class_and_Methods {

	public static void main(String[] args) {
//		Parent p = new Parent(); //--> not allowed.....
		
		Parent q = new child_1(); // --> allowed....
		
		child_1 c1= new child_1(); //-->allowed !!!...
		
		child_2 c2=new child_2(); //-->allowed !!!...
		c1.greet();
		System.out.println();
		c2.th();
		q.greet();

	}

}
