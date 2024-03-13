package StringPrograms_2;

public class CreateNewStringContainingUpperCase {

	public static void main(String[] args) {
String s ="Its Simple";
String newword="";
for(int i=0;i<s.length();i++)
{
	char c= s.charAt(i);
	if(Character.isUpperCase(c))
		newword+=c;

}
System.out.println(newword);
	}

}
