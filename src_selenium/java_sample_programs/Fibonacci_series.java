package java_sample_programs;

public class Fibonacci_series {

	public static void main(String[] args) {
		int sum,n1=0,n2=1;
		for(int i=0;i<=10;i++) {
			System.out.print(n1+ "+");
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}System.out.println("...");

	}

}
