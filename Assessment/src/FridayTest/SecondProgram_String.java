package FridayTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondProgram_String {

	public static void main(String[] args) {
		String s1="First Part Of String";
		String s2 =" Second  Part Of String";
		String concatinated = s1.concat(s2);
			System.out.println("concatinated string is -->"+concatinated);
			System.out.println("length of the string is -->"+concatinated.length());
			
			Pattern p =Pattern.compile("Part");
			Matcher m = p.matcher(concatinated);
			System.out.println(m.groupCount());
			while(m.find()) {
			System.out.println(m.start()+"...."+m.end()+"...."+m.group());
			}
			String [] str = concatinated.split(" ");
			for(int i=0;i<str.length;i++) {
				if(str[i].contentEquals("First")) {
					System.out.println("first is found at index number :"+i);
				}
				if(str[i].contentEquals("Second")) {
					System.out.println("Second is found at "+i);
				}
			}
			for(String val:str) {
				if(val.length()==4) {
					System.out.println(val);
				}
			}
				
	}

}
