
/*

A for loop is used to execute a piece of code for specific number times.

Syntax for for-loop:

	for( initialization; condition to be checked; update){
	
		statement to be executed;
		
	}

*/

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int i=10;
		
		//2n=even numbers
		//2n+1=odd numbers
		
		for(int j=1;j<i;j++) {
			
			if(j%2!=0) {
				System.out.println(j);
			}
		}
		
		System.out.println();
		
		//we can use this also
		for(int k=0;k<i;k++) {
			System.out.println(2*k);// for printing even numbers
			System.out.println(2*k+1); //for printing odd numbers
		}

	}

}
