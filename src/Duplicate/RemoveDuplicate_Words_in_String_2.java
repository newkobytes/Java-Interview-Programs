package Duplicate;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate_Words_in_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Sharmi went went to to to her her her business business";
		String[] word= str.split(" ");
		
		Set<String> myset = new LinkedHashSet<>();
		
		for(int i=0; i<word.length;i++)
		{
			myset.add(word[i]);
		}
		for(String S : myset)
		{
			System.out.println(S);
					
		}
	}

}
