
public class Invrement_decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10; //a++ ->prints the value of a and then increments to the value to 1, that is 11.This is lnown a post increment.
		int b=20; //++b -> first increments the value of b by 1 and the prints the value of b. Then b becomes 21 and prints it.
		
		/* In the same way we have,post-decrement(a--) and pre-decrement(--b).
		 It reduces the value by 1.*/
		
		
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(++b);
		
		System.out.println(--b);//Here the value of b becomes back to 20,as it is pre-incremented to 21 and pre-decremented to 20.
		
		int y=7;
		
		System.out.println(++y*8);
		
		char c='A';
		System.out.println(c++); //Here it prints the value and then increments it to character 'b'.
		System.out.println(c);/* In character increment it increments the value to the corresponding next character....*/

	}

}
