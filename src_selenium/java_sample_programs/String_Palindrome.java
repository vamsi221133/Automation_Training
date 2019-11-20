package java_sample_programs;

import java.util.Scanner;

public class String_Palindrome {
	static void Using_indexOf() {
		System.out.println("Enter any Sting for checking palindrome :");
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			rev=rev+str.charAt(i);
			
		}System.out.println("\n"+rev);
		if(str.contentEquals(rev)) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("given string is not a palindrome");
		}
	}

	static void WithOut_Using_indexOf() {
		System.out.println("Enter any Sting for checking palindrome :");
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		char[] vam = str.toCharArray();
		String rev ="";
		for(int i=vam.length-1;i>=0;i--) {
			rev=rev+vam[i];
		}System.out.println(rev);
		if(str.contentEquals(rev)) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("given string is not a palindrome");
		}
	}
	public static void main(String[] args) {
		WithOut_Using_indexOf();
	}

}
