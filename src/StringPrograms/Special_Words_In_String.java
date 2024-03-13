package StringPrograms;

public class Special_Words_In_String {

	public static void main(String[] args) {

		//Special words starts and ends with same characters
		String word="Mom and Dad also Bob and Aura are good";
		word+=" ";
		String separateword="";
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)!=' ')
			{
				separateword+=word.charAt(i);
			}
			else
			{
				
				char firstletter=separateword.charAt(0);
				char lastletter= separateword.charAt(separateword.length()-1);
				if(Character.toUpperCase(firstletter)==Character.toUpperCase(lastletter))
					System.out.println(separateword);
				separateword="";
			}
		}
	}

}
