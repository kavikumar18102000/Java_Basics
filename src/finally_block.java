
public class finally_block {

	public static int div() {
		try {
			int a = 10;
			int b = 0;
			return a / b;
		} catch (Exception e) {
			System.out.println(e);
		}

		finally { // executes the code inside the block compulsory, if it has an exception or not...
					
			System.out.println("cleaning the resource....");
		}

		return -1;

	}

	public static void main(String[] args) {

		System.out.println(div());
	}
}
