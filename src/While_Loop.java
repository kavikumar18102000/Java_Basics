package src;
/*

Syntax of While Loop:

	while(condition){
		statement to be executed if the condition is true;
	}
	
	This loop executes until the condition becomes false....
	
NOTE : If the condition never becomes false the while loop gets executed repeatedly, this loop is known as infinite loop.

*/


public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		while(i<=10) {
			System.out.printf("7 * %d = %d\n",i,7*i);
			i++;
		}
		
//		while(1) {  // we can't use this as we use in c or c++. We have prescribed data type called Boolean.
//			System.out.println("true");
//		}

	}

}
