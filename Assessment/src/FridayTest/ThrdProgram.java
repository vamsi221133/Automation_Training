package FridayTest;

public class ThrdProgram {
	ThrdProgram(){
		System.out.println("this is a constructor");
	}
	static //method overlading
	void overloading() {
		System.out.println("this mthod is going to overload");
	}
	static void overloading(int x) {
		System.out.println("this method is overloaded");
	}
	//folloing code is to demonistrate encapsulation
	private String vamsi;
	public String getVamsi() {
		return vamsi;
	}
	public void setVamsi(String vamsi) {
		this.vamsi = vamsi+"\t this is encapulation";
	}
	
	
	public static void main(String[] args) {
		ThrdProgram obb = new ThrdProgram();
		obb.overloading();
		obb.overloading(123);
		obb.setVamsi("vamsi_krishna");
		System.out.println(obb.getVamsi());
	}
}
