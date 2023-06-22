import java.util.Scanner;

class My_excep extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "I am a tostring()";
		}
	
	public String getMessage() {
		return "I am a getmessage()";
	}
}


public class create_custom_exception {
	public static void main(String[] args) {
		System.out.println("Enter the number....");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a<50) {
			try {
				throw new My_excep();
			} 
			catch (Exception e) {
				System.out.println(e.toString());
				System.out.println(e.getMessage());
			}
		}
	}
}
