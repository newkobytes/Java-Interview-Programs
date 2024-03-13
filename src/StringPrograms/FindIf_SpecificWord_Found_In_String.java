package StringPrograms;

public class FindIf_SpecificWord_Found_In_String {

	public static void main(String[] args) {
int count=0;
		String string = "Sharmila is more beautiful and Sharmila is more talented";
		string+=" ";
		String word="";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
				word+=string.charAt(i);
			else
			{
				if(word.equalsIgnoreCase("sharmila"))
					count++;
				    word="";
			}
		}
		if(count==0)
			System.out.println("Not found");
		else
			System.out.println("Found");
	}

}
