

class acces_modifier{
	private int x = 10;
	public int y=20;
	protected int z = 30;
	int a = 50; // default access modifier
	
	acces_modifier(){
		method1();
	}
	
	void method1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
}

class c1 extends acces_modifier{
	x=45;
}

public class Access_Modifiers {

	public static void main(String[] args) {
		
		acces_modifier am = new acces_modifier();
		
}
}