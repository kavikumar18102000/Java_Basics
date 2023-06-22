import java.util.Random;
import java.util.Scanner;

class Game{
	
	int num;
	int user;
	int count=0;
	
	
	Game(){
		Random rand = new Random();
		this.num=rand.nextInt(50);
	}
	
	void user_input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number....");
		user=scan.nextInt();
	}
	
	boolean guess(){
		count++;
		if(user==num) {
			System.out.println("Guessed correctly... in : "+count+" steps");
			return true;
		}
		else if(user<num) {
			System.out.println("Too low....");
		}
		else if(user>num) {
			System.out.println("Too high.....");
		}
		else {
			System.out.println("Invalid number.......");
		}
		return false;
	}
	
}

public class Guess_number {

	public static void main(String[] args) {
		Game g = new Game();
		boolean b=false;
		while(!b) {
			g.user_input();
			b=g.guess();
		}

	}

}
