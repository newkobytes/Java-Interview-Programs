package Duplicate;

public class PrintDuplicateElements_in_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"sea","sea","Amma", "Appa","crow","Shiva","Amma","crow", "ShISva","sss","sss","one","two","one"};
		
		for(int i=0; i<str.length;i++)
		{
			int count=1;
			
			for (int j=i+1;j<str.length;j++)
			{
				if (str[i]==str[j])
				{
					count++;
					str[j]="0";
				}
			}
			if (count>1 && str[i]!="0")
			System.out.println("dupliacte elements in array: "+ str[i] );
		}
	}

}
