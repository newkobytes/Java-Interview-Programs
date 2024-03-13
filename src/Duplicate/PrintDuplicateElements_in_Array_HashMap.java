package Duplicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateElements_in_Array_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str= {"2","6","7","8","2","6"};//{"sharmila","shiva","sharmila","Amma","Appa","shiva"};
		
		Map<String,Integer > strmap = new HashMap<String,Integer>();
		for(String s : str)
		{
			if(strmap.containsKey(s))
			{
				strmap.put(s, strmap.get(s)+1);
			}
			else
			{
				strmap.put(s,1);
			}
		}
		
		Set<Map.Entry<String, Integer>> entryset = strmap.entrySet();
		for(Map.Entry<String, Integer> entry: entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}
