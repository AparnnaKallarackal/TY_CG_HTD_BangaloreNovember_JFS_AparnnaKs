package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutput {
public static void main(String[] args) {
	
	FileOutputStream f1;
	try {
		f1 = new FileOutputStream("anu.txt");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	String s="aparnna suresh";
	byte b[]=s.getBytes();
	
	f1.write(b);
	System.out.println();

}
}
