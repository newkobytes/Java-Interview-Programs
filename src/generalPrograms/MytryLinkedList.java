package generalPrograms;

import generalPrograms.MyLinkedList.Node;

public class MytryLinkedList {

	
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
	
	public static MytryLinkedList insert(MytryLinkedList list, int data)
	{
		Node newnode = new Node(data);
		
		if(list.head==null)
		{
			list.head=newnode;
		}
		else
		{
			Node last= list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newnode;
		}
		return list;
	}
	
	public static void printList(MytryLinkedList list)
	{
		Node currentnode= list.head;
		System.out.println("Linked list is ");
		while(currentnode!=null)
		{
			System.out.println(currentnode.data);
			currentnode=currentnode.next;
		}
		
	}
	public static void main(String[] args) {
		
		MytryLinkedList list = new MytryLinkedList();
		insert(list,1);
		insert(list,2);
		insert(list,4);
		insert(list,3);
		printList(list);
	}

}
