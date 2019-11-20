package FridayTest;

import java.util.HashMap;

public class FourthProgram {
	
public static void main(String[] args) {
		HashMap <Integer , String> hm = new HashMap<Integer,String>();
		String str = "";
		for (int i=0;i<10;i++) 
		{
		str = "vamsi"+i;
		hm.put(i, str);
		}
		System.out.println(hm);
	}
}
