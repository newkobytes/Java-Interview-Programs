package Occurence_of_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_Single_CharactersPrint {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		PrintDuplicateCharacters();
		
	}
	
	public static void PrintDuplicateCharacters()
	{
		String s = "Shivu Loves Sharmila";
		String Str = s.replace(" ", "");
		
		char[] words = Str.toCharArray();
		//System.out.println(words);
		Map< Character, Integer> charMap = new HashMap<> ();
		
		for(Character ch : words)
		{
			if(charMap.containsKey(ch))
				
			{
				charMap.put(ch,charMap.get(ch)+1);
			
			}
			else
			{
				charMap.put(ch, 1);
				}
		}
		
		Set<Map.Entry<Character,Integer>> entryset = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println("The duplicate character is " + entry.getKey() + " and it occurs " + entry.getValue() + " times");
			}
			else
			{
				System.out.println("Single occured character is " + entry.getKey());
			}
		}
		
	}

}
