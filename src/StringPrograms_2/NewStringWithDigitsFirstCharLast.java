package StringPrograms_2;

public class NewStringWithDigitsFirstCharLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Times Its Simple 1000";
		String digits="";
		String characters="";
		String sentence="";
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(Character.isDigit(c))
				digits+=c;
			else
				characters+=c;
			
		}
		System.out.println("digits are: " + digits);
		System.out.println("letters are: " +characters);
		sentence= digits + characters;
		System.out.println("Sentence is: "+ sentence);
	}

}
