
import java.util.Scanner;


public class Rock_Paper_Scissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		
		while(i<5){
		
		System.out.println("Enter 1-for scissor , 2-for paper , 3-for rock");
		System.out.println("Player-1 enter your choice....");
		int p1=sc.nextInt();
		System.out.println("Player-2 enter your choice....");
		int p2=sc.nextInt();

		if(p1==1 && p2==2) {
			System.out.println("Player 1 won !....");
		}
		else if(p2==1 && p1==2) {
			System.out.println("Player 2 won !....");
		}
		else if(p1==2 && p2==3) {
			System.out.println("Player 1 won!.....");
		}
		else if(p1==3 && p2==2) {
			System.out.println("Player 2 won!.....");
		}
		else if(p1==1 && p2==3) {
			System.out.println("Player 2 won!.....");
		}
		else if(p1==3 && p2==1) {
			System.out.println("Player 1 won!.....");
		}
		else {
			System.out.println("Invalid entry.......");
		}
		i++;
 
	}
	}

}
