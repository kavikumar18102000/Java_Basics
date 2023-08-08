package java_basic_with_examples;
/*

varags --> variable arguments

*/

import java.util.ArrayList;
import java.util.List;

public class Varags {
	
	static int add(int a,int ...arr) { //packs all the available arguments into an array
		int sum=0;
		for(int element: arr) {
			sum=sum+element;
		}
		return sum;
		
	}

	static List<Integer> result(int ...arr){
		List<Integer> l = new ArrayList<>();
		for (int ele:
			 arr) {
			l.add(ele);
		}

		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sum of two values are "+Varags.add(10,20)); //we can pass more than two arguments for the function.
		System.out.println("sum of five values are "+Varags.add(5,4,3,2,5));
		System.out.println("sum of no values are "+Varags.add(1,2,3)); //return 0 if no arguments is passed to the function.
		//the first arguments is neglected not to print null arguments.
		//At-least one argument should be provided...

		System.out.println(result(2,3,4,5,6,7,8,9)); //we can perform like this also...

	}

}
