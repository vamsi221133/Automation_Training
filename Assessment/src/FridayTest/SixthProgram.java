package FridayTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SixthProgram {

	public static void main(String[] args) {
		
		try
		{
		String d="1st line maveric\n second line\n third line\n fourth line ";
		FileOutputStream ff=new FileOutputStream("C:/Users/training/Desktop/vamsi.txt")	;
		ff.write(d.getBytes());
		ff.close();
		char [] ch = d.toCharArray();

		System.out.println("\nlength of the array is\t"+ch.length);
		File file=new File("C:/Users/training/Desktop/vamsi.txt");
		FileInputStream f=new FileInputStream(file);
		System.out.println("\nprinting array ");
		
		int i;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
			
		}
		
		

		}catch (Exception e) {
			System.out.println("plese check the file path and the logic you have written");
		}
		}
}
