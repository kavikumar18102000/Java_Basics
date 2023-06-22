//package src;
/*

In Java objects gets created at run-time only.......

Dynamic method is nothing but, it decides which method should run during run time.....

*/

class Phone{
	public void greet() {
		System.out.println("I am a Phone......");
	}
	
	public void on() {
		System.out.println("Turning the Phone ON....");
	}
}

class Smart_Phone extends Phone{
	public void greet() {
		System.out.println("I am a Smart Phone inherited from Phone....");
	}
	
	public void off() {
		System.out.println("Smart Phone is turning of.........");
	}
}

public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {
//		Phone p=new Phone(); //Allowed -> you are referencing the object p created to the Phone class
//		p.greet();
//		
//		Smart_Phone sp = new Smart_Phone(); //Allowed -> you are referencing the object sp created to Smart_Phone class
//		sp.greet();
		
		Phone p = new Smart_Phone(); // Yah!...This is allowed.... -> Super-class object can be referenced to the sub-class
									//Actually the object is created for Smart_Phone ,but referenced to Phone, so it is allowed......
		p.greet();
		
//		Smart_Phone sp = new Phone(); // NO,this is not allowed...... -> sub-class object cannot be referenced to the Super-class..
		
		p.on(); // It calls the on() from the super-class as the method not over-rided......
		
//		p.off(); // can't use or not allowed, because method is not present in the super-class , because it is referenced to super-class.....

	}

}
