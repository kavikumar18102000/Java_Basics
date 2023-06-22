
import java.util.HashSet;

public class Hash_Set {
	public static void main(String[] args) {
		HashSet<Integer> myhash = new HashSet<>();
		
		myhash.add(10);
		myhash.add(20);
		myhash.add(30);
		myhash.add(30); // set will not take the duplicate values....
		
		System.out.println(myhash);
		
	}

}
