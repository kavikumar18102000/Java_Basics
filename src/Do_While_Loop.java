
/*

This loop is similar to the while loop except the fact is that, it is guaranteed to execute at least once...

Syntax for do-while:
	
	do{
		statement to be executed;
		
	}while(condition);  ---> Note this semicolon....
	
while --> checks condition and then executes the statement.

do-while --> executed the statements and then checks the condition.

*/

public class Do_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		
		do {
			System.out.println(i);
			i++;
		}while(i<5);

	}
}
