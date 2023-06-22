

/*

Array is a collection of similar type of data Like integer,float etc...

		int [] marks;
		     
*/

package Arya;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring an array and allocation of the memory...
		int [] marks=new int[5]; // int[5] --> size of the array;
		
		//we can declare like this also.....
//		int []marks; --->Declaration
//		marks=new int[5]; --->Memory allocation...
		
		
		//Declaration and initialization of elements...
		int [] arr= {10,20,30,40,50};
		
		//Accessing an array......
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		
//		System.out.println(marks[0]);
//		System.out.println(arr[4]);
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
