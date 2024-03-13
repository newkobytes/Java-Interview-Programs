package PatternEXamples;

public class AlphabetPattern_2 {

	public static void main(String[] args) {
		char ch ='A';
		for(int i=1;i<=5;i++)
				{
			ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch + " ");
				ch++;
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			System.out.println();
			
				}


	}

}

/*
A
A B
A B C
A B C D
A B C D E
*/