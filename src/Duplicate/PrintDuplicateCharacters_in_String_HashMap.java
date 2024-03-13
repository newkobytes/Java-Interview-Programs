package Duplicate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacters_in_String_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrintChar("SharmilaSl");

	}
public static void  PrintChar (String str) //sharmila
{
	char[] letters=str.toCharArray();
	Map<Character,Integer> charmap = new LinkedHashMap<Character,Integer>(); // <s,1 h,1 a,1 r,1 m,1 i,1 l,1 a,2>
	
	for(Character ch: letters)
	{
		if(charmap.containsKey(ch))
		{
			charmap.put(ch, charmap.get(ch)+1);
		}
		else
		{
			charmap.put(ch, 1);
		}
	}
	
	//to print
	Set<Map.Entry<Character,Integer>> entrySet =charmap.entrySet();
	for(Map.Entry<Character, Integer> entry : entrySet)
	{
		//if(entry.getValue()>1)
		//{
			System.out.println(entry.getKey() + " is occured " + entry.getValue() + " times");
		//}
	}
}
}
