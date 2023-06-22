package src;
/*

Method overriding (redefining the method of super-class by the sub-class) : is nothing but derived class used the base class method with the same name. 
																			It can also be modified like giving parameters etc....

when an object of a sub-class is created and the over-rided method is called, the method implemented in the sub-class is called and its code is executed....


If the arguments are the parameters of the derived class method and the base class method are different, but the name is same, then it is not known as overriding..
Overriding means the sub-class and the base-class should have the same method with same parameters....

The access level of sub-class methods must not be restrictive.....

For example  :
		In the below given code, class A has meth1(), class B inherits the class A. So the class B can access the meth1() function.
		But also it can change the values and the parameters of that function, but it will not reflect in the Base class.


*/


class A{
	public int a;
	
	public void meth1() {
		System.out.println("I am  method in class A");
	}
}

class B extends A{
	public int b;
	
	public void meth1() { // perfect method-overriding.... as it matches with the super-class meth1()...
		System.out.println("I am method 1 in class B called overriding...");
	}
	
	public void meth1(int a,int b) { // this is not known as method-overriding, it is known as method-overloading 
		System.out.println("I am method 1 in class B : "+((a+b)));
		
	}
}


public class Method_Overriding {

	public static void main(String[] args) {
		B b=new B();
		b.meth1(); // this access the meth1() of the base class A, because no parameters are passed it will access the base class meth1() --> method-overriding.
		b.meth1(10,20); // this access the meth1() of class B, because parameters are passed, it finds the function which matches the pro-to-type of the function -->method-overloading

	}

}
