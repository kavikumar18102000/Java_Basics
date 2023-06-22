
/*

Multidimensional arrays are the arrays of arrays. Each element a M-D array is an array itself.
 
*/

package Arya;

import java.util.Scanner;

public class Array_Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//Declaration of 2-D array......
		int [][]arr=new int[2][3]; // first is the row value and next is the column value.
		System.out.println("Enter the 2-D array elements....");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf("Enter the value of arr[%d][%d]\n",i,j);
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]);
			System.out.print(" ");
			}
			System.out.println();
		}
		
		//Declaration of a 2-D String array....
		String [][]names = new String[2][3];

	}

}
