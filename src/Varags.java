
/*

varags --> variable arguments

*/

public class Varags {
	
	static int add(int a,int ...arr) { //packs all the available arguments into an array
		int sum=0;
		for(int element: arr) {
			sum=sum+element;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sum of two values are "+Varags.add(10,20)); //we can pass more than two arguments for the function.
		System.out.println("sum of five values are "+Varags.add(5,4,3,2,5));
		System.out.println("sum of no values are "+Varags.add(1,2,3)); //return 0 if no arguments is passed to the function.
		//the first arguments is neglected to not to print null arguments.
		//At-least one argument should be provided...

	}

}
