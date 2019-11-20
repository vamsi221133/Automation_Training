package java_sample_programs;

import java.util.Scanner;


public class Armstrong_number {
	
	static void num() {
//	 static Runnable num() {
//		for(int k=1;k<10000;k++) {
		System.out.println("enter any number :");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
//		int num=k;
		int c=0,a;
		int dup=num;
		while(dup!=0) {
		a = dup%10;
		dup=dup/10;
		c=c+(a*a*a);
//		System.out.println("present c values is"+c);
		}
//		System.out.println("the value  is "+c);
		if(num==c) {
			System.out.println(num+" is armstriong");
		}
		else {
			System.out.println(num+" is not armstrong");
		}
//		return null;
	}
//	}
	static void sample() {
		int n=1265;
		int k = n%10;
		int c=n/10;
		System.out.println("% means"+k);
		System.out.println("/ means"+c);
	}

	public static void main(String[] args) {
//		sample();
		num();
//		Thread th = new Thread(num());
//		th.start();
		
	}

}
