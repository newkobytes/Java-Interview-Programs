package StringPrograms_2;

public class ReverseCaseofString {

	public static void main(String[] args) {

		String s ="Its Simple";
	
		String sentence="";
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(Character.isUpperCase(c))
				sentence+=Character.toLowerCase(c);
			else
				sentence+=Character.toUpperCase(c);
	}
		System.out.println(sentence);

}
}