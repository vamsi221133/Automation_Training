package FridayTest;

public interface NinthProramInterface {

	//in interface we can define unimplemenented methods 
	//we can also define implementd method but for that we have to use default keyword
	
	abstract void vamsi();//unimplemented methods
	default void krishna() {
		System.out.println("this is implementd method");
	}
}
