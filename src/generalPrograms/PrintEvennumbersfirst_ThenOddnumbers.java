package generalPrograms;

public class PrintEvennumbersfirst_ThenOddnumbers {

	public static void main(String[] args) {
		
		int [] arr = {1,2,5,4,7,8,11,20};
		int[] arr1 = new int[arr.length];
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				arr1[index] = arr[i]; 
				index++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				arr1[index] = arr[i]; 
				index++;
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
	}

}
