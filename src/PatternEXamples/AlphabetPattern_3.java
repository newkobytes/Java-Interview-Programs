package PatternEXamples;

public class AlphabetPattern_3 {

	public static void main(String[] args) {
		char ch ='A';
		for(int i=1;i<=5;i++)
				{
			
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
B C
D E F
G H I J
K L M N O
*/