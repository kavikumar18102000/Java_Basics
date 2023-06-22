/*
Logical operators are: -> used to provide logic to our java program
		-> && -> and operator -> both the conditions to be true and false if any one condition is false.
		-> || -> or operator -> any one or both conditions may be true and false if both the conditions are false.
		-> ! -> not operator -> Negates the given logic (true becomes false and false becomes true).


*/

import java.util.Scanner;

public class Relational_Logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		if(a>10 && b<50) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		boolean c= true;
		boolean d=false;
		System.out.println(!c);
		System.out.println(!d);
		
		
	}

}
