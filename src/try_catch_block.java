import java.util.Scanner;

public class try_catch_block {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the divisor of 6000");
		int a = sc.nextInt();
		
		try { // this tries to run the code inside the try block...
			
			System.out.println("The result is : "+6000/a);
			
		} catch (Exception e) { // if any error occurred, then it catches the error in 'e'.
			System.out.println("We are unable to divide the number..due to following error..");
			System.out.println(e);
		}
		
	}

}
