import java.util.Scanner;

public class nested_try_catch {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			
			System.out.println("welcome....");
		    System.out.println("Enter the array index.....");
		    n = sc.nextInt();
		    
		    try {
		    	
				System.out.println("The value at the entered index is : "+arr[n]);
			} 
		    catch (ArrayIndexOutOfBoundsException e) {
		    	
				System.out.println("sorry!! array index value out of range...");
				System.out.println(e);
			}
		    
		} 
		catch (Exception e) {
			
			System.out.println("sorry error in the program...");
		}
	}

}
