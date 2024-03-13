package PatternEXamples;

public class StarPattern_9 {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=4;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int l=4;l>i;l--)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

		for(int i=2;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print(" ");
			}
			for(int m=4;m>=i;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	
}


}


/*

*             *
* *         * *
* * *     * * *
* * * * * * * *
* * *     * * * 
* *         * *
*             *

*/