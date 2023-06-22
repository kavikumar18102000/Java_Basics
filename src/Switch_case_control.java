package src;/*
  Switch-case is used when we have to choose a choice between number alternatives of a given variable.
  
 If a break statement not used after the declaration of each case, all the cases will be printed including default.
 Break statement breaks the switch after execution of the required case.
 
 A switch-case variable can be a integer, char or a string in Java.
 
 Nested switch-case can be done.But in practical it is rarely done.
 
 Enhanced switch-case is used when a case has more statements in it..., no need of using a break statement in enhanced switch-case.
 
 We can use ':' or an '->' in enhanced switch-case.
 
 
 */

import java.util.Scanner;

public class Switch_case_control {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the age....");
//		int age=sc.nextInt();
		
		String name="kavi";
		
//		switch(age) {
//		case 18:
//			System.out.println("you are an adult now....");
//			break;
//		case 10:
//			System.out.println("you are still a child....");
//			break;
//		case 15:
//			System.out.println("you are an teenager....");
//			break;
//		default:System.out.println("You are not born....");
//		}
//		
		
		
		
//		switch(name) {
//		case "Arya":
//			System.out.println("you are an adult now....");
//			break;
//		case "kumar":
//			System.out.println("you are still a child....");
//			break;
//		case "kavi":
//			System.out.println("you are an teenager....");
//			break;
//		default:System.out.println("You are not born....");
//		}
		
		
		
		
		//Enhanced switch-case...
		switch(name) {
		case "Arya" -> {
			System.out.println("you are a adult now....");
			System.out.println("you can enjoy your life now....");
		}
		
		case "kavi" -> {
			System.out.println("you area child.....");
			System.out.println("you can't enjoy....");
		}
		
		default -> System.out.println("Not valid....");
		}
		
		
	}

}
