package java_sample_programs;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		int vam=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any valid number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=2;j<i;j++) {
				if(n%j==0) {
					vam=vam+1;
				}
			}
		}if(vam!=0) {
			System.out.println(n+" is not a prime number..");
		}
		else {
			System.out.println(n+" is prime number..");
		}
		
	}

}
