package PatternEXamples;

public class NumberPattern_1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i + " ");
			}
				for(int k=5;k>=i;k--)
				{
					System.out.print(" ");
				}
					System.out.println();
		}

	}

}



/*  1
	2 2
	3 3 3
	4 4 4 4
	5 5 5 5 5
*/