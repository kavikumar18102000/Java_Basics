
/*

 Constructor in Inheritance :
    		when a derived class is extended from the base class, the constructor of the base class is executed first followed by the 
     		constructor of the derived class.

If two constructor are present in the base class, the derived class calls first constructor default which doesn't take any arguments....

To call the constructor with the overloading we use 'super(arguments)' keyword to passing the arguments..
	then it calls the constructor matching the number of arguments with constructor.

*/

class Base1{
	private int x;
	
	public Base1(){
		System.out.println("I am base1 constructor...");
	}
	
	Base1(int a){
		System.out.println("Base1 constructor overlaoding : "+a);
	}
	
	Base1(int x,int y){
		System.out.printf("Base1 constructor having two arguments %d and %d :",x,y);
	}
}

class Derived1 extends Base1{
	 Derived1() {
		System.out.println("I am a Derived1 constructor");
	}
	
	 Derived1(int m){
		 super(m); //invoking the constructor which takes only one argument by passing the argument
		 System.out.println("I am a Derieved1 constructor overloading : "+m);
	 }
	 
	 Derived1(int x,int y){
		 super(99,70);
		 System.out.printf("\nI am constructor taking two arguments %d and %d... :\n",x,y);
	 }
}

class Derived2 extends Derived1{
	public Derived2() {
		super(20);
		System.out.println("I am a Constructor Derived2 class...");
	}
	
}

public class Constructor_Inheritance {

	public static void main(String[] args) {
		 Base1 b1 = new Base1();
		 System.out.println();
		 
		 Derived1 d1=new Derived1(10); 
		 System.out.println();
		 
		 Derived1 d3=new Derived1(30,40);
		 System.out.println();
		 
		 Derived2 d2=new Derived2();
		 

	}

}
