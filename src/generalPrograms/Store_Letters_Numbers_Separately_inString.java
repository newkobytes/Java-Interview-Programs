package generalPrograms;

public class Store_Letters_Numbers_Separately_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 --Approach 1:
		String input = "abdjkoenf12437nfj485ndmf0845672";
		
		String letters = input.replaceAll("[0-9]", "");
		System.out.println(letters);
		
		String numbers = input.replaceAll("[^0-9]", "");
		System.out.println(numbers);
		
		*/
		
//-Approach 2:
		String input = "abdjkoenf12437nfj^$(&%485ndmf0(*^$845672";
		//ASCII letters: A-Z :65 to 90 and a-z : 97 to 122
		//ASCII numbers: 48 to 57
		String temp1="";
		String temp2 ="";
		String temp3 = "";
		
		for(int i=0; i<input.length();i++)
		{
			if(input.charAt(i)>=65 && input.charAt(i)<=90 || input.charAt(i)>=97 && input.charAt(i)<=122)
			{
				temp1=temp1+input.charAt(i);
			}
			
			else if(input.charAt(i)>=48 && input.charAt(i)<=57)
			{
				temp2= temp2 + input.charAt(i);
			}
			
			else
			{
				temp3 = temp3 + input.charAt(i);
			}
		}
		
		System.out.println("Letters are : " + temp1);
		System.out.println("Numbers are : " + temp2);
		System.out.println("Special characters are : " + temp3);
	}

}
