import java.util.Scanner;

public class hanling_exceptions {
	public static void main(String[] args) {
		
		int marks[] = new int[3];
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array index.....");
		int ind = sc.nextInt();
		
		System.out.println("Enter the divider of number...");
		int num = sc.nextInt();
		
		try {
			
			System.out.println("The reuslt is after performing the divison is : "+marks[ind]/num);
			
		} 
		
		catch (ArithmeticException e) {
			System.out.println("some arithmetic error occured");
			System.out.println(e);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index value out of range");
			System.out.println(e);
		}
		
		catch (Exception e) {
			
			System.out.println("some other error occured....");
		}
		}

}
