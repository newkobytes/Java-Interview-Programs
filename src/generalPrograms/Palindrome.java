package generalPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");

int num =sc.nextInt();
int org_num=num;
int rev=0;
int r;

while(num!=0)
{
r=num%10;
//rev = rev*10 + num%10;
rev= rev * 10 + r;
num=num/10;  

}
if(org_num==rev)
{
	System.out.println("The given number " + org_num + " is palindrome");
	}
	else
	{
		System.out.println("The given number " + org_num + " is not palindrome");
	}
	}
}
