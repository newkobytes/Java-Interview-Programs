
package Duplicate;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate_Words_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Sharmi went went to to to her her her business business";
		String[] word= str.split(" ");
		
		Set<String> myset = new LinkedHashSet<>();
		for(String S : word)
		{
			myset.add(S);
					
		}
		
		//How to print the elements present in the set:
		//Using Iterator:
			
		Iterator itr = myset.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		
		
		
		
		}

}
