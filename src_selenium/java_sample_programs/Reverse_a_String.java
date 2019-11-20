package java_sample_programs;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		System.out.println("enter any value :");
		Scanner sc = new Scanner(System.in);
		String name=sc.next(),temp="";
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		}System.out.println(temp);
	}

}
