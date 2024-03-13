package Duplicate;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate_Words_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str= {"Sharmila", "Shiva", "Sharmila", "Amma", "Appa", "Shiva"};
		
		Set<String> myset = new LinkedHashSet<> ();
		for(String s : str)
		{
			myset.add(s);
		}
		
		Iterator itr = myset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
