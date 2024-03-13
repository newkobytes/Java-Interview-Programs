package generalPrograms;

import java.util.HashMap;
import java.util.Map;

public class Print_SpecialCharacters_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sharmila@1346%*&98%$@*";
		int len=s.length();
		int count =0;
		String nospecialchar = "";
		
		for(int i=0;i<len-1;i++) //if string should be displayed only with special characters:
		{
			if(!Character.isDigit(s.charAt(i)) && (!Character.isLetter(s.charAt(i))) && (!Character.isSpace(s.charAt(i))))
			{
				count++;
				System.out.println(s.charAt(i));
			}
			else //if string should be displayed without special characters:
			{
				nospecialchar= nospecialchar + s.charAt(i);
				
			}
		}
		
		if(count==0)
		{
			System.out.println("No special charactrer found");
		}
		else
		{
			System.out.println("Special characters found " + count);
		}
		
		System.out.println("Removing special characters " + nospecialchar);
	}

}
