package StringPrograms;

public class FirstLetter_In_Word {

	public static void main(String[] args) {

		String word="I am the great one in world";
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
				System.out.println(separateword.charAt(0));
				separateword="";
			}
		}
	}

}
