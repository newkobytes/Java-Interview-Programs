package generalPrograms;

public class LenOfLastWord_in_String {

	public static void main(String[] args) {
	
		String s = "Welcome to my Coding knowledge  ";
		s=s.trim(); //to remove both leading and trailing spaces of the string:
		int len = s.length();
		System.out.println("Length of entire string is " + len);
		int count =0;
		
		//length always gives the total count, count starting from 1
		//so if we need the last character to be printed u, u have to mention length-1
		for(int i=len-1; i>=0;i--)
		{
			if(s.charAt(i)==' ')
				{
				break; // when iterating from the last , if it contains a space it means that the last word is 
					   //completed and the last before word is about to start
					   // so come out of the iteration or for loop bcoz , we have to check only the count of last word
				}
			else
			{
				count ++;
			}
		}
		System.out.println("Length of last word is " + count);
	}

}
