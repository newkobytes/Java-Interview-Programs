package StringPrograms;

public class ReplaceWord_In_Sentence {

	public static void main(String[] args) {
String string = "A Red Seed";
string+=" ";
String word ="";
String newword="";
for(int i=0;i<string.length();i++)
{
if(string.charAt(i)!=' ')
{
word+=string.charAt(i);	
}
else
{
if(word.equals("Red"))
	newword=newword+"Blue"+" ";
else
	newword=newword+word+" ";
word="";
	
}
}
System.out.println(newword);
	}

}
