package StringPrograms;

public class Capitalize_EachWord_In_Sentence {

	public static void main(String[] args) {
String string="sharmi is a good girl";
string+=" ";
String word="";
String newword="";

for(int i=0;i<string.length();i++)
{
if(string.charAt(i)!=' ')
{
word+=string.charAt(i);
}
else
{
char caps=word.charAt(0);
caps=Character.toUpperCase(caps);
newword= newword+caps+word.substring(1)+" ";
word="";
}
}
System.out.println(newword);
	}

}
