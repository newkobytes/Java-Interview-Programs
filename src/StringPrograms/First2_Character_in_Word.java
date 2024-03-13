package StringPrograms;

public class First2_Character_in_Word {

	public static void main(String[] args) {
		String word="Wake up early in the morning";
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
				System.out.println(separateword.substring(0,2));
				separateword="";
			}
		}
	}

}
