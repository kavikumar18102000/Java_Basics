
/* To inherit the property we use 'extends' keyword following with the base class name in Java.
 * If we change something in Base class it reflects in the derived class also...
 * If we change in derived class it will not reflect in the Base class....
 * 
 *  when a class inherits from a superclass it inherits parts of superclass methods and fields.
 *  Java doesn't support multiple inheritance i.e two classes cannot be super-classes for a subclass.
 *  
 *  Does all the parts of superclass inherits the base class ? -> It depends on the access specifier of the methods and attributes..
 *  			Like if you use a private specifier for a method, it cannot be inherited by the sub-class....
 *  
 *  
 *  Constructor in Inheritance :
 *  		when a derived class is extended from the base class, the constructor of the base class is executed first followed by the constructor of the derived class.
 *  
 *  
 *  */


class Base{
	 int x;
	int y;
	public Base() {
		x=10; 
		
	}
	
	public int getY() {
		return y;
	}
	
}

class Derived extends Base{   // creating a derived class from the Base class.......
	void print() {
		System.out.println(x);
	}
	
	int setY(int n) {
		this.y=n;  // 'this' it is a reference of an object of the class which is being created/referenced....
		return y;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Derived d1=new Derived();
		Base b=new Base();
		System.out.println("The value of Y in base is : "+b.getY());
		d1.print();
		System.out.println("Setting the value of Y and the value is : "+d1.setY(20));
		System.out.println("The value of Y in base after changing the value in derived is : "+b.getY());

	}

}
