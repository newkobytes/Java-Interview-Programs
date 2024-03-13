package generalPrograms;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "Sharmila";
	String reverse = "";
	/*	int length = str.length();
		
		for(int i=length-1; i>=0; i--)
		{
		  reverse = reverse + str.charAt(i);
		}																																																							
		
		System.out.println(reverse);
	*/
		char[] word=str.toCharArray();
		int len= word.length;
		for(int i=len-1; i>=0; i--)
		{
		  reverse = reverse + word[i];
		}																																																							
		
		System.out.println(reverse);
		
	}

}
