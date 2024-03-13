package StringPrograms_2;

public class CountUpperCase {

	public static void main(String[] args) {
int Uppercount=0;
int Lowercount=0;
String s="SHarmila SHiva Shekar Are Marrying";
for(int i=0;i<s.length();i++)
{
	char c = s.charAt(i);
if(Character.isUpperCase(c))
	Uppercount++;
if(Character.isLowerCase(c))
	Lowercount++;
}
System.out.println("Upper Case count is "+ Uppercount);
System.out.println("Lower Case count is " + Lowercount);
	}

}
