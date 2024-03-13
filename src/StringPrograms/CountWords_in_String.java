package StringPrograms;

public class CountWords_in_String {

	public static void main(String[] args) {

		String word ="I am Sharmila doing my studies";
		int count=1;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==' ' && word.charAt(i)+1!=' ')
			{
				count++;
				
			}
			else
			{
				continue;
			}
				
		}
		System.out.println("words in string are "+ count);
	}

}
