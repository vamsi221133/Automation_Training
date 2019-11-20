package java_sample_programs;

import java.util.Scanner;

public class Alfa_num {

	public static void main(String[] args) {
		System.out.println("enter any string with combination of alfa and num :");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		System.out.println("char array is :");

		for(int i=0;i<ch.length;i++) {
	        int ascii = ch[i]; 
//	        System.out.println("The ASCII value of " + ch[i] + " is: " + ascii); 
	        if(ascii>=65 && ascii<=90) {
	        	System.out.println(ch[i]+" is captal alphabets charecter...");
	        }
	        else if(ascii>=97 && ascii<=122) {
	        	System.out.println(ch[i]+" is small alphabetic charecter...");
	        }
	        else if(ascii>=48 && ascii<=57) {
	        	System.out.println(ch[i]+" is numaric charecter...");
	        }else {
	        	System.out.println(ch[i]+" is special charecter...:)");
	        }
	    } 
	} 	
}
