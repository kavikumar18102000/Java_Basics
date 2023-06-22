

interface father{
	void method1();
	void method2();
}

interface child1 extends father{
	void method3();
	void method4();
}


class child_of_child1 implements child1{
	
	child_of_child1(){
		method4();
	}
	
	public void method4() {
		System.out.println(" I am method 4");
	}

	@Override
	public void method1() {
		System.out.println(" I am method 1");
		
	}

	@Override
	public void method2() {
		System.out.println(" I am method 2");
		
	}

	@Override
	public void method3() {
		System.out.println(" I am method 3");
		
	}
	
}


class child2_of_father implements father{
	
	child2_of_father(){
		method1();
		method2();
	}
	
	@Override
	public void method1() {
		System.out.println(" I am method 1");
		
	}

	@Override
	public void method2() {
		System.out.println(" I am method 2");
		
	}
	
}


public class Interface_Inheritance {

	public static void main(String[] args) {
		child_of_child1 c1 = new child_of_child1();
		c1.method1();
		c1.method2();
		
		System.out.println();
		child2_of_father c2 = new child2_of_father();
		

	}

}
