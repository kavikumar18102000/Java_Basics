/*
 * Decision statements in java are:
 * 		->If-else statement
 * 		->Switch statement
 * 
 * Syntax for If-else:
 * 					NOTE: else part is optional
 * 	if(condition to be checked){
 * 			statement if condition is true;		
 * }
 * else{
 * statement if condition is false;
 * }
 * 
 * Relational operators are used to check conditions in java. It returns the value in boolean(true or false).
 *  	(==,>=,<=,>,<,!=)
 * '=' -> assignment operator
 * '==' -> equality operator
 * 
 * */

import java.util.Scanner;

public class Conditions_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age......");
		int a=sc.nextInt();
		if(a>18) {
			System.out.println("Yes...you can drive..");
		}
		else {
			System.out.println("No,you are still a child....");
		}
		

	}

}
