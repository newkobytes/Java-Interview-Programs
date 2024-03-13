package generalPrograms;

/*linkedlist will contain a node that has data in it and a pointer
1-> 2-> 3
1 is a node that has a data of 1 and a pointer to 2
*/
public class MyLinkedList {

	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public static MyLinkedList insert(MyLinkedList list, int data)
	{
		Node newNode= new Node(data);
		
		if(list.head==null)
		{
			list.head=newNode;
		}
		else
		{
			Node last = list.head;
			
			while(last.next !=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		
		return list;
	}
	
	public static void printList(MyLinkedList list)
	{
		Node currentNode= list.head;
		System.out.println("Linked list is ");
		
		while(currentNode!=null)
		{
		System.out.println(currentNode.data);
		currentNode = currentNode.next;
	}
	}
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		insert(list,1);
		insert(list,2);
		insert(list,3);
		insert(list,4);
		
		printList(list);
	}

}
