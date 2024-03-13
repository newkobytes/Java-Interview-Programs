package Duplicate;

public class PrintDuplicate_Words_in_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Amma", "Appa","Shiva","AMma", "ShISva","sss","sss","one","two","one","Appa"};
		int count;
		for (int i=0; i<str.length;i++)
		{
			count=1;
			for (int j=i+1; j<str.length;j++)
			{
				
				if(str[i]==str[j])
				{
					count++;
					str[j]="0";
				}
			}
			
			if(count>1 && str[i]!="0")
			{
				System.out.println(str[i]);
			}
			
		}
	}

}
