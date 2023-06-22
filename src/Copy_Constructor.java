
// Passing the object as a parameter for a constructor is known as copy constructor....

class complex{
	private int r,i;
	
	public complex(int r, int i){
		this.r=r;
		this.i=i;
	}
	
	public complex(complex o2) { // takes the object as an parameter....
		this.r = o2.r;
		this.i = o2.i;
		
	}
	
	public String toString() { // inbuilt function.....
		return "(" + r + " + " + i + "i)";
	} 
}

public class Copy_Constructor {
	public static void main(String args[]) {
		complex c = new complex(10,20);
//		System.out.println(c.tostring());
		System.out.println("Object : 1 "+c);
		
		complex o2 = new complex(30,40);
		
		complex o3 = new complex(o2);
		System.out.println("Object : 2 "+o3);
	}

}
