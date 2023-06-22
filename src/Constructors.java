

class Friends{
	private String name;
	private int id;
	
	
	// Constructor overloading as same as the method overloading.....
	
/*
	
	In constructor overloading it chooses the constructor by identifying the arguments given....
	
	For example :
		f1 is an object created  with two arguments,  so it chooses the constructor which takes two arguments.
		f2 is an object created with no arguments, so it chooses the constructor with no arguments.......
		
	Syntax for creating an constructor :
	
			public class_name(){
				attributes.......;
			}

*/
	
	public Friends() {   // creating a  constructor for the class without arguments.......
		name = "default";
		id = 4567;
	}
	
	// creating a constructor with arguments.....
	
	public Friends(String myname,int myid) {
		name = myname;
		id = myid;
	}
	
	void details() {
		System.out.println("NAME : "+name);
		System.out.println("Phone number is : "+id);
	}
}



public class Constructors {
	public static void main(String args[]) {
		Friends f1 = new Friends("arya",100);
		Friends f2 = new Friends(); //calling constructor without arguments
		Friends f3 = new Friends("kumar",200);
		f1.details();
		System.out.println();
		f2.details();
		System.out.println();
		f3.details();
		
	}
	

}
