package StringPrograms;

public class ChangeCase_Of_Word_In_Sentence {

	public static void main(String[] args) {
String string = "Sharmila went to school";
string+=" ";
String word="";
String newword="";
int count=0;
for(int i=0;i<string.length();i++) {
	if(string.charAt(i)!=' ')
	{
		word+=string.charAt(i);
	}
	else
	{
		count++;
		if(count%2==0)
			newword=newword+word.toUpperCase()+" ";
		else
			newword=newword+word.toLowerCase()+" ";
		word="";
	}
}
System.out.println(newword);
	}

}
