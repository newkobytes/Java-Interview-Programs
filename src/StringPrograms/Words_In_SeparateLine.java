package StringPrograms;

public class Words_In_SeparateLine {

	public static void main(String[] args) {

		String words= "Life is uncertain in this world";
		words+=" ";
		String separatewords="";
		for(int i=0;i<words.length();i++)
		{
			if(words.charAt(i)!=' ')
			{
				separatewords+=words.charAt(i);
			}
			else
			{
				System.out.println(separatewords);
				separatewords="";
			}
		}
	}

}
