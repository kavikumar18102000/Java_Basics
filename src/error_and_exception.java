import java.util.Iterator;
import java.util.Scanner;

public class error_and_exception {
	public static void main(String[] args) {
		
		// Syntax error 
//				int a = 10     ---> no semicolon its an syntax error....
		
		
		
		
		// Logical errors demo.....using prime numnbers...
		
		System.out.println(2);
		int i;
		for (i=0;i<5;i++) {  // the logic is to print the prime numbers, but it prints 9 which is not a prime numbers. This is known as logical error.
			System.out.println(2*i+1);
			
		}
		
		// Runtime error
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number.....");
		int k=sc.nextInt();
		System.out.println("Integer 1000 divided by k is "+1000/k);
		
		
	}

}
