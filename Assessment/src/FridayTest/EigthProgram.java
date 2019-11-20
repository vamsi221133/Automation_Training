package FridayTest;

public class EigthProgram {

	public static void main(String[] args) {
		int a=0,b=1;
		for (int i=1;i<=20;i++) {
			
			System.out.print(a +" + ");
			int sum =a+b;
			a=b;
			b=sum;
		}

	}

}

