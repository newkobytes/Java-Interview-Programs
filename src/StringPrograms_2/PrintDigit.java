package StringPrograms_2;

public class PrintDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "It is 10 simple";
String letters="";
int[] digits;
		for(int i=0;i<string.length();i++)
		{
		char c= string.charAt(i);
		if(Character.isDigit(c))
		System.out.println(c);
		else
			if(Character.isLetter(c))
				letters+=c;
		System.out.println(letters);
		letters="";
		
		}
	}

}
