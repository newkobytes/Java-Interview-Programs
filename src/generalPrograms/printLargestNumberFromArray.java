package generalPrograms;

import java.util.Arrays;

public class printLargestNumberFromArray {

	public static void main(String[] args) {
		
		String arr[] = {"3","30","34","5","9"};
		System.out.println(LargestInteger(arr));
	}
	
	public static String LargestInteger(String arr[]) {
		Arrays.sort(arr,(num1,num2)->(num2+num1).compareTo(num1+num2));
		String str="";
		for(String s : arr)
		{
			str=str+s;
	}
		return str;
	}
}

