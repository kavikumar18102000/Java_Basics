import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
	public static void main(String[] args) {
		
		//code to create a file.... 
		
//		File f1 = new File("aray.txt");
//		
//		try {
//			f1.createNewFile();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Unable to create a new file...");
//			e.printStackTrace();
//		}
		
		// code to write into a file...
		try {
		FileWriter f2 = new FileWriter("aray.txt");
		f2.write("this is out first java file handling code....");
		f2.close(); // every time opening a file be sure to close it.... 
	    }
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//code to read a file...
		File f3 = new File("aray.txt");
		try {
			Scanner sc = new Scanner(f3);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//To delete a file...
		File f4 = new File("aray.txt");
		if(f4.delete()) {
			System.out.println("File " + f4 + " delted successfully..");
		}
		else {
			System.out.println("error occured while deleting the file....");
		}
		
	}

}
