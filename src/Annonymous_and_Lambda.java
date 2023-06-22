

interface DemoAno{
	void meth1();
	void meth2();
}

@FuncitonalInterface // It is nothing but interface contains only one function....
interface Lambda{
	void meth1(int a);
}


class Annony implements DemoAno{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("I am meth 1");
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("I am meth 2");
		
	}
	
}

public class Annonymous_and_Lambda {
	public static void main(String[] args) {
		
		DemoAno obj1 = new Annony();
		obj1.meth1();
		
		
		// Anonymous class....
		
		DemoAno obj = new DemoAno(){
			public void meth1() {
				System.out.println("I am meth 1");
			}

			@Override
			public void meth2() {
				// TODO Auto-generated method stub
				System.out.println("I am meth 2");
				
			}
		};
		
		obj.meth1();
		
		
//		Lambda Expression
		
		Lambda l = (a)->{System.out.println("I am method 1 from Lambda interface... " + a);
		};
		
		l.meth1(7);
		
	}
	
	

}
