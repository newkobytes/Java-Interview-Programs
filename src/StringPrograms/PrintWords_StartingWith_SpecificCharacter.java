package StringPrograms;

public class PrintWords_StartingWith_SpecificCharacter {

	public static void main(String[] args) {
		String word="Wake up early in the morning Romio to start his Run";
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
				//if(separateword.startsWith("R")) 
				// if(separateword.endsWith("ed")
				//if(separateword.contains("ing"))
				if(separateword.length()==2);
				System.out.println(separateword);
				separateword="";
			}
		}
	}

}
