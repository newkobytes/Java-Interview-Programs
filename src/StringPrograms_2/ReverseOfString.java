package StringPrograms_2;

public class ReverseOfString {

	public static void main(String[] args) {
		String s ="Hi Sharmila";
		String reverse="";
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			reverse=c+reverse;
	}
		System.out.println(reverse);

}}
