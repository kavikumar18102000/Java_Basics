
/*
Break statement : 
				The break statement is used to exit the loop irrespective of weather the condition is true or false.
				Whenever the 'break' is encountered inside the loop, the control is sent outside the loop.


Continue statement : 
				The continue statement is used to immediately move to the next iteration of the loop.
				The control is taken to the next iteration thus skipping everything below 'continue' inside the loop for the iteration.
				
				
In Nut shell :
		Break statement completely exits the loop.
		Continue statement skips the particular iteration of the loop. 

*/


public class Break_and_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			if(i==3) {
				 break;
			}
		}
		
		System.out.println();
		
		for(int i=0;i<5;i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}

	}

}
