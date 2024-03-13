package Duplicate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateWords_In_String_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Shiva loves Boxing and Shiva Sharmi loves Boxing";
		String[] S =str.split(" ");
		Map<String, Integer> strmap = new LinkedHashMap<> ();
		for(String ch : S)
		{
			if(strmap.containsKey(ch))
			{
				strmap.put(ch, strmap.get(ch) + 1);             
			}
			else
			{
				strmap.put(ch, 1); 
			}
		}
		
		Set <Map.Entry<String, Integer>> entryset = strmap.entrySet();
		for (Map.Entry<String, Integer> entry : entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println("The duplicate word is " + entry.getKey());
			}
			/*else
			{
				System.out.println("The non-duplicate word is " + entry.getKey());
			} */
		}
	}

}
