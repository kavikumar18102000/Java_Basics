package src;

class Car{
	int model;
	String name;
	
	void get_model() {
		System.out.println("Model number : "+ model);
	}
	
	void get_name() {
		System.out.println("Car name is : "+ name);
	}
}


public class creatingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();// instantiating of objects
		Car car2 = new Car();
		
		//Setting attributes.....
		car1.model=1003;
		car1.name="BMW";
		
		car2.model=1002;  //for each object we can create different attribute values......
		car2.name="Benz";
		
		
		//Printing the attributes
		car1.get_model();
		car1.get_name();
		System.out.println();
		car2.get_model();
		car2.get_name();
	}

}
