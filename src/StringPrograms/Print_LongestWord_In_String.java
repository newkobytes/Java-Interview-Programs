package StringPrograms;

public class Print_LongestWord_In_String {

	public static void main(String[] args) {

		String string="Sharmila is the most beautiful girl in the world";
		string+=" ";
		String word="";
		String longestword="";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				word+=string.charAt(i);
			}
			else
			{
				if(word.length()>longestword.length())
					longestword=word;
				word="";
			}
		}
		System.out.println("longestword is "+ longestword);
	}

}
