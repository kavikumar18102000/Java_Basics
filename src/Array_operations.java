
package Arya;

public class Array_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,30,20,40,50};
		
		System.out.println(arr.length); // -->returns the length of the array...
		
		//Accessing the array elements using for-loop
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d\t",arr[i]);
		}
		
		//Array of strings...
		String [] names= {"arya","kavi","kumar"};
		System.out.printf("\n%s\t\n",names[1]);
		
		
		//For-each loop in java...
		for(int element:arr) { //To print all the elements in the loop, without establishing the condition and updating...
			System.out.println(element);
		}

	}

}
