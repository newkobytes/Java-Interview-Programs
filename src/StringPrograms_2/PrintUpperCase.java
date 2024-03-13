package StringPrograms_2;

public class PrintUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = " Its SimPle";

		for(int i=0;i<string.length();i++)
		{
		char c= string.charAt(i);
		if(Character.isUpperCase(c))
		System.out.println(c);
		}
	}

}
