package PatternEXamples;

public class StarPattern_12 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
		for(int s=1;s<=5-i;s++) //space logic
		{
		System.out.print(" ");
		}
		for(int j=1;j<=i*2-1;j++) //j th row logic to print *
		{
		System.out.print("*");	
		}
		System.out.println();
		}

		}
}	
		/*

		Logic:
			i  space  j
			1	4	  1
			2	3     3
			3	2     5
			4	1     7
			5	0     9
			

		/*
		 		*
		 	  * * *
		 	* * * * *
		  * * * * * * *
		* * * * * * * * * 	


		*/


	


