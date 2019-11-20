package FridayTest;

 class chaild {

		 int a = 100;
		static int b=800;

}
 public class TenthProgram extends chaild{
	 
	private int s=200;
	 void sampl() {
		super.a=300;
		System.out.println(a);
		super.b=200;
		System.out.println(b);
	}void sampl1(){
		this.s=10000;
		System.out.println(s);
	}
	 
	public static void main(String[] args) {
		TenthProgram ob = new TenthProgram();
		ob.sampl();
		ob.sampl1();
}
	//private : it will visible inside the same class only.other class cannot access the private variables and methods.
	//static  : a single copy of static variable is created and shared among all the instances of the class

}