
/*
 
 In java interface is a group of related methods and they interact....
 
 example : 
   interface Bicycle{
   		int a=100;
   		void breakup(int decrement);
   		void speedup(int increment);
   }
   
   class HeroBicycle implements Bicycle{
   			int speed = 7;
   			
   			void speedup(int increment){
   					speed+=increment;
   			}
   			void breakup(int decrement){
   					speed-=decrement;
   			}
   }
 
 In interface we can't change the properties of it, as it is final value... example : int a=100; is fixed value can't be changed...
 
 To create an interface we use 'interface' keyword followed by the name of the interface...
 To implement the interface, we use 'implement' keyword followed by the name of the interface as shown in the above example....
 
 we can create more than one interfaces...
 
 Interface methods are 'public' by default. We should declare them as public in the classes.

 Body cannot be created for the function in the interfaces, only prototypes are allowed..
 
 */

interface Bicycle{
	int a=100;
	void speed_up(int increment);
	void break_up(int decrement);
	
	private void problems() { // this method is not accessible by the implemented class as it is private.
		System.out.println("No problems faced, till now..");
	}
	
	default void review() {
		problems(); // But the private can be used indirectly in the specified default methods of that interface..
		System.out.println("Bicylce is super to ride and very much comforatable...");
	}
}

interface Model{
	void model_num(int num);
	String [] brand_name();
}


class Hero_cycle implements Bicycle, Model{
	int speed;
	public void speed_up(int increment) {
		speed+=increment;
		System.out.println("speed is : "+speed);
	}
	
	public void break_up(int decrement) {
		speed-=decrement;
		System.out.println("speed reduced to : "+speed);
	}
	
	void Blow_horn() {
		System.out.println("poom,poom..........!");
	}
	
	public void model_num(int num) {
		System.out.println("Model number is : "+num);
	}
	
	public String[] brand_name() {
		 String a[]= {"arya","kavi","kumar"};
		 return a;
	}
	
//	public void review() {  // default method overriding. If we declare like this, this method will be called but not the default method in the interface
//		System.out.println("Super to ride....");
//    }
	
}



public class Interface {

	public static void main(String[] args) {
		Hero_cycle h1 = new Hero_cycle(); //this object can implement methods present in the Hero_cycle class.
		h1.speed=150;
		h1.speed_up(50);
		h1.break_up(100);
		System.out.println("the value of a in interface is : "+h1.a); // can access the properties of interface from the class object.....
		h1.Blow_horn();
		
		// cannot modify the properties in interface as they are final value in interface...
		//h1.a=50;
		
		h1.model_num(10067);
		String b[]=h1.brand_name();
		for(String item : b) {
			System.out.println("Qwner of the cycle is : "+item);
		}
		
		Bicycle h2 = new Hero_cycle(); // this object is can only implement the methods present in the Bicycle interface...
		//h2.blow_horn(); // Not allowed...
		
		h2.review(); // we can call the default method without implementing in the class. And can create a body for it in the interface itself...
		
//		h1.problems(); // throws an error as undeclared in the class
	}

}

