package PatternEXamples;

public class XPattern {

	public static void main(String[] args) {

		int n=10;
		for(int i=1; i<=n;i++)
			{
		for(int j=1;j<=n;j++)
		{
			if(i==j||i+j==11)
				System.out.print("X");
			else
				System.out.print(" ");
		}
			System.out.println();
			}
		}

}
