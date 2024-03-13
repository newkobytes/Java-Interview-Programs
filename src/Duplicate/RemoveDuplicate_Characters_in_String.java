package Duplicate;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate_Characters_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "SHARMILASHARS";
		char[] letters=str.toCharArray();
		
		Set<Character> myset = new LinkedHashSet<> ();
		for(Character l : letters)
		{
			myset.add(l);
		}
		
		Iterator itr = myset.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}

}
