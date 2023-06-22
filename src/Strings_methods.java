/*
 * String methods operate on java strings.
 * They can be used to finding the length of the strings,converting the string to lowercase or uppercase etc..and many more functions...

*/




public class Strings_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	                 0123	->index of the string 'name' .NOTE that the index value starts from '0'.
		String name="Arya";
//		String name1=name;
//		System.out.println(name1);
		
//		String Methods in Java......
		
//		System.out.println(name.length());//->return Length of the string.
//		System.out.println(name.toUpperCase());//->converts the string to Uppercase.
//		System.out.println(name.toLowerCase());//->converts the string to Lowercase.
		
		int length=name.length();
		System.out.println(length);
		
		String name2="  A R y a ";
		System.out.println(name2.trim());//return a string after removing all the leading(at first) and tracting(at end) spaces in the string.
		System.out.println(name.substring(2));//return the sub-string from the given index to end of  the string.
		System.out.println(name.substring(0,2));/*returns a sub-string form start index(0) to the end index(2).start index is included and end 
													index is excluded.Exclude means it less than the end index.2-1.*/
		
		System.out.println(name.replace('a', 'h'));//returns the string with replacing the character 'a' with 'h'.
		System.out.println(name.replace("y","hi"));//replaces 'y' with 'hi' and returns the string...
		
		System.out.println(name.startsWith("a"));//returns true if the string starts with 'a', or else returns false...
		System.out.println(name.endsWith("a"));//returns true if the string endswith 'a'.
		
		System.out.println(name.charAt(2));//returns the character at the given index value....
		
		System.out.println(name.indexOf("ya"));//returns the index value of the given character.
		
		
	}

}
