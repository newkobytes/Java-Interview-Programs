package generalPrograms;

public class RotationLogic {

	public static void main(String[] args) {
		
		String a = "abcd";
		String b = "cdab";
		
//System.out.println(a.indexOf(b)); --This statement returns -1 since String 2 contains non-available character at string 1 i.e 'z'
		// 1. we have to check if the length of 2 strings are same:
	int lenA=a.length();
	int lenB=b.length();
	
		//2. Append the first string twice to check if the second string is present within the first string
	
	String c = a + a;
		//3. Check if the index of second string is present in first string and add the condition != -1 (which means if string 2 
		//--contains any character that is not present in String 1 then it directly tells it is not a rotation)
	      
	
	if((lenA==lenB) && (c.indexOf(b)) !=-1 )
	{
		System.out.println("String b is the rotation of String a ");
	}
	else
	{
		System.out.println("It is not a rotation");
	}

}
}

