
public class practice_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern using For-Loop");
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Pattern using While-Loop");
		int i=0,j;
		while(i<5) {
			j=i;
			while(j<5) {
				System.out.printf("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		//  Factorial of a number using for loop
		
		int fact=1;
		
		for(int k=1;i<=5;i++) {
			fact=fact*k;
			
		}
		System.out.println("factorial of a nuber is " + fact);

	}

}
