package Occurence_of_String;

import java.util.Scanner;

public class No_Of_Words_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//APPROACH 1:
	/*	
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int count =1;
		for(int i=0; i<s.length()-1;i++) 
		{
		if((s.charAt(i)==' ') &&(s.charAt(i+1)!=' '))
			count++;
		}
		System.out.println("Number of words in a string is: " + count);
	} */

		//APPROACH 2:  My own pgm
		
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int Len =s.length();
		System.out.println("the length is: " + Len); // == 21 total length
		String[] word= s.split(" ");
		System.out.println("Number of words in a string is: " + word.length);
		//System.out.println(word.length);
		
		}
}
		


