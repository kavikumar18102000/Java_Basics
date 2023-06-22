package Arya;

class student{
	int roll_no;
	String name;
	
	student(int r, String name){
		this.roll_no = r;
		this.name = name;
	}
	
	void print() {
		System.out.println("Roll NO : "+roll_no);
		System.out.println("Name : "+name);
		System.out.println("-----------------------------------------------------------");
	}
	
}


public class Array_of_objects {

	public static void main(String[] args) {
		
//		student[] o = null ; // it will not store any objects as it is declared as null;
		
		student[] o;
		o = new student[5]; // declaring the size of the array. Creates only 5 objects;
		o[0]=new student(10,"Arya");
		o[1]=new student(20,"kavi");
		o[2]=new student(30,"kumar");
		o[3]=new student(40,"darshan");
		o[4]=new student(50,"sanjay");
		
		for(int i=0;i<o.length;i++) {
			if(o[i].name == "sanjay") {
				System.out.println("Found in "+i+"th object");
			}
//			o[i].print();
//			System.out.println();
		}
		
		

	}

}
