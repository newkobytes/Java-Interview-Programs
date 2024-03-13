package generalPrograms;

public class Remove_C_from_String {

	public static void main(String[] args) {
		
	/* Approach 1 my own code:	
		String s = "Cache";
		String str = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=67 && s.charAt(i)!=99)
			{
				str=str + s.charAt(i);
			}
			else
			{
				System.out.println("it has " + s.charAt(i));;
			}
		}
		System.out.println("Final string removing 'c' or 'C' is " + str);
		
	*/
	
	//Approach 2:
		
		String s = "Cache";
		String str = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='c' && s.charAt(i)!= 'C')
			{
				str=str + s.charAt(i);
			}
			
		}
		System.out.println("Final string removing 'c' or 'C' is " + str);
	}

}
