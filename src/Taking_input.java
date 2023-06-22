
import java.util.Scanner;

public class Taking_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking input from the user...");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the numer 1");
		int a=sc.nextInt();
//		float a=sc.nextFloat();
		
//		System.out.println(a);
		
		System.out.println("Enter the number 2");
		int b=sc.nextInt();
//		float b=sc.nextFloat();
		
		int sum=a+b;
//		
		System.out.println("The sum of two numbers is " +sum);
//		
//		System.out.println(a+b);
		
	
//		TO a string as an input from the user
		
		System.out.println("Enter a string...");
		String str=sc.next(); //Here the next metthod will take only one word at a time not a sentence. If a sentence is given it takes the first word.
//		Stirng str=sc.nextLine()//Here this method takes a full sentence as a string
		System.out.println(str);
		
		
//		To check wheather the user entred an integer value...
		
		System.out.println("Enter the integer value.....");
		boolean b1=sc.hasNextInt(); //prints true or false
		System.out.println(b1);
		

	}

}
