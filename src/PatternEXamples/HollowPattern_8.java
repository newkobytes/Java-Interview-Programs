package PatternEXamples;

public class HollowPattern_8 {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=9;j>=i;j--)
			{
				if(i==1||j==1||j==i||i+j==10)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}

/*

*********
 *     *
  *   *
   * *
    *

*/