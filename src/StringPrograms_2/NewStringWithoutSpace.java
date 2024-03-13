package StringPrograms_2;

public class NewStringWithoutSpace {

	public static void main(String[] args) {
		String s =" Its Simple ";
		
		String sentence="";
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(!Character.isSpace(c))
				sentence+=c;
	}
		System.out.println(sentence);

}
}