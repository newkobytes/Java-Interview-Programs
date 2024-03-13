package generalPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class moveZerotoLastfromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> numberlist= new ArrayList<>();

numberlist.add(3);
numberlist.add(2);
numberlist.add(0);
numberlist.add(4);
numberlist.add(6);
numberlist.add(7);
numberlist.add(0);
numberlist.add(5);
int size=numberlist.size();

System.out.println("List before: " +numberlist);

for(int i=0; i<size;i++)
{
	if(numberlist.get(i)==0)
	{
		numberlist.remove(i);
		size--;
		numberlist.add(0);
		
	}
	else
	{
		continue;
	}
}

System.out.println("List After: "+ numberlist);
	}

}
