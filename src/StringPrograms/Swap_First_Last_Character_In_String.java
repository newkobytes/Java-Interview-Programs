package StringPrograms;

public class Swap_First_Last_Character_In_String {

	public static void main(String[] args) {

		String string="In the box";
		string+=" ";
		String word="";
		String newword="";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				word+=string.charAt(i);
			}
			else
			{
				char firstletter=word.charAt(0);
				char lastletter= word.charAt(word.length()-1);
				String middleletters= word.substring(1, word.length()-1);
				newword= newword+ lastletter+ middleletters+firstletter+" ";
				word="";
			}
		}
		System.out.println(newword);
	}

}
