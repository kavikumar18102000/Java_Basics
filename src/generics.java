import java.util.ArrayList;


//custom generic..

class Mygeneric<T1>{
	int val;
	private T1 t1;
	
	public Mygeneric(int a, T1 t) {
		this.val=a;
		this.t1=t;
	}
	
	public int get() {
		return this.val;
	}
	
}


class Mygeneric2<T1,T2>{
	int val;
	private T1 t1;
	private T2 t2;
	
	public Mygeneric2(int val,T1 t1,T2 t2) {
		this.val=val;
		this.t1=t1;
		this.t2=t2;
	}
	
	public T2 get() {
		return t2;
	}
}

public class generics {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
//		ArrayList<int> arr = new ArrayList(); ---> this is not possible as the type parameter cannot take the primitive data type and it produces an error...
		
		arr.add("arya");
		arr.add(10);
		arr.add(20);
		
//		int a = arr.get(1); ---> this won't work as we did not specified the Array type. So it produces an error.
//								 In the below ex we are type casting it into int as we ate fetching the integer value.
//								 And also the error occurs during the run time.
		
		int a = (int) arr.get(1);
		String b = (String) arr.get(0);
		System.out.println(a);
		System.out.println(b);
		
		
		//Accessing custom generic...
		Mygeneric<String> mg = new Mygeneric<String>(30,"kumar");
		Mygeneric mg2 = new Mygeneric(40,"kavi");
		
		int c = mg.get();
		int d = mg2.get();
		System.out.println(c);
		System.out.println(d);
		
		
		Mygeneric2<String,Integer> mg3 = new Mygeneric2(50,"kumar","kavi");
		
		Integer e = mg3.get();
		System.out.println(e);
		
	}

}
