
/*
 NOTE : In case of arrays the reference is passed to the function. Same is the case of passing the objects to the methods.
 */

public class Reference {
	static void change_array(int []a) {
		a[0]=690;
	}
	
	static void change_value(int a) {
		a=70;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=450;
		System.out.println("Value of x before change is "+x);
		
		Reference.change_value(x); // the value of x will not be changed, because we are passing the copy of the variable.
		
		
		System.out.println("the value of x after changing is"+x);
		
		System.out.println();
		
		
		int []marks= {10,20,30,40,50};
		System.out.println("value of marks[0] before changing is "+marks[0]);
		
		Reference.change_array(marks); //we are passing the reference(address) of the array, so the value at index 0 is changed from 10 to 50.
		
		System.out.println("the value of marks[0] after changing is "+marks[0]);

	}

}
