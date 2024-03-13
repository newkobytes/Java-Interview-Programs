package Duplicate;

public class PrintDuplicate_Words_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String str ="Big black bug bit a big lack on bit black nose";
		str = str.toLowerCase();
		String[] words = str.split(" ");
		int count;
		for(int i=0;i<words.length;i++)
		{
			count=1;
			if(words[i]!="0") {
				
			
		for(int j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j])) 
			{
				count++;
				words[j]="0";
			}
		}
			}
		if(count>1)
			System.out.print(words[i] + " ");
		}
	}

}
*/



String str = "Big black bug bit a big lack on  a bit black nose";

str=str.toLowerCase();

String[] words= str.split(" ");

int count;
for (int i=0;i<words.length;i++)
{
	count=1;

	for(int j=i+1;j<words.length;j++)
	{
		
		if(words[i].equals(words[j]))
		{
			count++;
			words[j]="0";
			
		}
	}
		if(count>1&&words[i]!="0")
		{
			System.out.println(words[i]);
		}
	}
}
}




