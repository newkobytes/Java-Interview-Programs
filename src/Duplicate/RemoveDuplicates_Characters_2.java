package Duplicate;

public class RemoveDuplicates_Characters_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="SHARMILASHIVA";
		
		String result = "";
		
		for (int i=0; i<str.length();i++)
		{
			String ch = "" +str.charAt(i);
			if(result.contains(ch))
			{
				continue;
			}
			result += ch;
		}
		
		System.out.println(result);
	}
	}