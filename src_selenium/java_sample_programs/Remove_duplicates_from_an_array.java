package java_sample_programs;

import java.util.ArrayList;
import java.util.List;

public class Remove_duplicates_from_an_array {

	public static void main(String[] args) {
		int temp=0;
		List arr= new ArrayList();
		arr.add(1);
		arr.add(3);
		arr.add(4);
		arr.add("vamsi");
		arr.add("krish");
		arr.add("vamsi");
		System.out.println(arr);
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i).equals(arr.get(j))) {
					temp=temp+1;
					System.out.println("duplicates found at : "+i+" which contain value as :"+arr.get(i));
					
				}
				
			}
		}
		if(temp==0) {
			System.out.println("Duplicates are not found in the given array");
		}
		
	}
}
