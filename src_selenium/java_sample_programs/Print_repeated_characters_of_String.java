package java_sample_programs;

public class Print_repeated_characters_of_String {

	public static void main(String[] args) {
		String str = "vamsikrishna";
		System.out.println("given string is :"+str);
		char[] ch= str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==str.charAt(j)) {
					System.out.println("duplicates are :"+ch[i]);
				}
			}
		}
	}
}
