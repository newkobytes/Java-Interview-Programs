package PatternEXamples;

public class AlphabetPattern_4 {

	public static void main(String[] args) {
		char ch ='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch + " ");
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

