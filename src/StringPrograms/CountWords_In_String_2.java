package StringPrograms;

public class CountWords_In_String_2 {

	public static void main(String[] args) {

		int count=0;
		String string="A Red Seed in a black soil";
		string+=" ";
		String word="";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				word+=string.charAt(i);
			}
			else
			{
				count++;
			}
		}
		System.out.println("No.of Words in string "+ count);
	}

}
