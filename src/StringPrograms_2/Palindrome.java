package StringPrograms_2;

public class Palindrome {

	public static void main(String[] args) {
		String s ="dad";
		String reverse="";
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			reverse=c+reverse;
	}
		if(s.equalsIgnoreCase(reverse))
		System.out.println("Its is palindrome");
		else
			System.out.println("It is not a palindrome");

	}

}
