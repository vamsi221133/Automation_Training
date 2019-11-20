package FridayTest;

public class NinthProgram implements NinthProramInterface {
	//in java we cont use multiple inheritence directly...so we can achive thi by using inyterfaces
	//interface is used to implement multiple inheritances.
	//java class can implement multiple inheritences
	//all methods in interfaces are public and abstract
	//to use interfaces in our class we have to use the keyword implements
	
	
	//diff bw interface and inehritance
	//interfaces
	//1-->interfaces are used to implenet multiple inheritances.
	//2-->anyclass that inherit form interface has to implement all the methods declared on it.
	//3-->interfaces can not have constructors.
	//4-->they dont have properties
	
	//inheritance
	//1-->it is used for code reusability
	//inheritance can be of anything class,intefrace
	//it is the way where a base calss giving its access to other classes to use its variables,methods.etc
	
	
	@Override
	public void vamsi() {
		System.out.println("this is umimplementd method which is implementd in class");
		
	}

	public static void main(String[] args) {
		NinthProgram ob = new NinthProgram();
		ob.vamsi();
		ob.krishna();
	}

}
