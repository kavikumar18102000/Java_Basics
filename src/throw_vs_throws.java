
class negative_excep extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String toString() {
		return "Negative value will be not taken...";
	}
	
	public String getMessage() {
		return "Negative value will be not taken...";
	}
	
}


public class throw_vs_throws {
	
	public static int divide(int a,int b) throws ArithmeticException{
		return a/b;
	}
	
	public static double area(int r) throws negative_excep {
		if(r<0) {
			throw new negative_excep();
		}
		double res = Math.PI * r * r;
		return res;
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println(divide(10,0));
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		
		try {
			System.out.println(area(-1));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
