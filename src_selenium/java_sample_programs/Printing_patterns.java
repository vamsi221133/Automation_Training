package java_sample_programs;

public class Printing_patterns {
	static void Pyramid_Triangle() {
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("@ ");
			}
			System.out.println();
    }
	}
	static void patterns() {

		for(int i=0;i<7;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void Pyramid_Triangle_With_Numbers() {
	int vam=0;
	for(int i=0;i<50;i++) {
		for(int j=0;j<50-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print(vam+" ");
			
		}vam++;
	System.out.println();
	}
	}
	
	static void manju_left_tri() {
//		int i,j,k,n=6;
		for(int i=0;i<=5;i++){
			
			for(int k=0;k<5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
 				System.out.print("*");
			}
			System.out.println();
	}
}
 public static void main(String[] args) {
		Pyramid_Triangle();
//		Pyramid_Triangle_With_Numbers();
	manju_left_tri();
	}
}
