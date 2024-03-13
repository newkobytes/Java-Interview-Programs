package PatternEXamples;

public class AlphabetPattern_1 {

	public static void main(String[] args) {
		char ch ='A';
		for(int i=1;i<=5;i++)
				{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch + " ");
				
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			System.out.println();
			ch++;
				}

	}

}

/*
 A
 B B
 C C C 
 D D D D 
 E E E E E
 */
