package Duplicate;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements_in_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"sharmila","shiva","sharmila","Amma","Appa","shiva"};
		
		Set<String> myset = new LinkedHashSet<>();
	for (int i=0;i<str.length;i++)
	{
		myset.add(str[i]);
	}
	
	for(String s : myset)
	{
		System.out.println(s);
	}
	}

}
