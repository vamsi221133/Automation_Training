package java_sample_programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("enter any value :");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),temp=1;
		for(int i=2;i<=n;i++) {
			System.out.print(temp+" * "+i+" = ");
			temp = temp*i;
			System.out.println(temp);
		}
	}

}
