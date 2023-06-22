
//import java.util.Scanner;
//import java.util.*; // imports everything from the util package.

public class Packages {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in); // one way of using the packages. To do like this import packages
		
		java.util.Scanner input = new java.util.Scanner(System.in); // another of using the package without import the packages.
		
		
		
		int a = input.nextInt();
		System.out.println("Taking input as : "+a);

	}

}
