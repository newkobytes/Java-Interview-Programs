package PatternEXamples;

public class AlphabetPattern_6 {

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
				ch++;
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
