package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInput {
	public static void main(String[] args) {
		
		FileInputStream f1;
		try {
			f1 = new FileInputStream("anu.txt");
			
			int a=f1.read();
			System.out.println((char)a);
			int j=0;
			while(j=f1.read()!=1) {
				System.out.println((char)j);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		
		
		
	}

}
