/* A String is a sequence of characters.
 * A String is class and can be used  as a data type.
 * Strings are immutable in Java.Cannot change the value of a string once declared.
 * 
 										*/


import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
//		String name=new String("Arya");
		String name="Arya";
		
//		Different Ways of printing output in Java.
		System.out.print(name+"\n");
		System.out.println(name);
		System.out.printf(name);
		System.out.format("\n"+name+"\n");
		
		int a=6;
		float b=5.6454f;
		System.out.printf("The value of a is %d \nThe value of b is %f\n",a,b);
		System.out.format("The value of a is %d \nThe value of b is %f\n",a,b);
		
		System.out.println("Enter the string.....\n");
		String name2=input.nextLine(); //Takes whole sentence as an input...
//		String name2=input.next(); //Takes only one word as an input.
		System.out.println(name2);

	}

}
