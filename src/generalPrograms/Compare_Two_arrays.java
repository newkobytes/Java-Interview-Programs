package generalPrograms;

import java.util.Arrays;

public class Compare_Two_arrays {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,7,8};
		int arr2[] = {1,2,4,5,3,8,9};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
if(arr1.length==arr2.length)
	{
		
		boolean flag = false;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] == arr2[i])
				{
					flag = true;
					continue;
				}
				else
				{
					flag=false;
					break;
				}
		}
		
		if(flag==false)
		{
			System.out.println("Both arrays are not equal");
		}
		else
		{
			System.out.println("Both arrays are equal ");
		}
	}
else
	{
	 	System.out.println("lengths are not equal");
	}
		
	}

}
