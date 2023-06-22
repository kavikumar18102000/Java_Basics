/*

Super keyword :
		A reference variable used to immediate parent class object...
	
	* can be used to refer immediate parent class instance variable
	* can be used to invoke parent class methods
	* can be used to invoke parent class constructors



*/


class One_class{
	int a;
	One_class(int a){
		this.a=a;
		System.out.println("I am one class constructor : "+a);
	}
	
	void add(int a,int b) {
		System.out.println("Addition of two numbers are : "+(a+b));
	}
}

class Two_class extends One_class{
	Two_class(int m){
		super(m);
		System.out.println("I am c Two_class constructor....");
	}
	
	void display() {
		super.add(10, 20); //can be used to invoke parent class methods
	}
}

public class Super {

	public static void main(String[] args) {
		One_class one = new One_class(50);
		System.out.println();
		Two_class t = new Two_class(10);
		t.display();

	}

}
