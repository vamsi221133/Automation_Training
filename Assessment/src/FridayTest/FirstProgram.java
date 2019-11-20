package FridayTest;

public class FirstProgram {
	public static void main(String[] args) {
		int i;
	int [] numbers = {10,27,3,40,50};
	
	System.out.println("even numbers are : ");
	for(i=0;i<numbers.length;i++) {
		while(numbers[i]%2==0) {
			
			System.out.println(numbers[i]);
			break;
		}}
	System.out.println("odd numbers are : ");
	for(i=0;i<numbers.length;i++) {
		while(numbers[i]%2!=0) {
			
			System.out.println(numbers[i]);
			break;
		}
		}
	}
}
