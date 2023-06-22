
// Array List is a modified version of an array..

import java.util.*;


public class Array_List {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(1,90); // takes arguments as add(int index,int value. use to insert element at particular index....
		
		for(int ele : a1) {
			System.out.println(ele);
		}
		
		System.out.println();
		
		for(int i=0;i<a1.size();i++) {
			
//			System.out.println(a1[i]); // we cannot access array List elements using the index value..
			
			System.out.println(a1.get(i)); // we must get() to traverse the array...
		}
		
		ArrayList<Integer> a2 = new ArrayList<>(5); // we can declare the size of an array by passing the size to the constructor.
		
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(50);
		a2.add(70);
		a2.add(80);
		
//		for(int i : a2) {
//			System.out.println(i);
//		}
		
		a1.addAll(3, a2);
		System.out.println("After adding a2 with a1..");
		for(int ele : a1) {
			System.out.println(ele);
		}
	}
	

	
	

}
