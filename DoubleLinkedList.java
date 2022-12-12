package lesson2;


class DoubleLinkedList {
	static Node head; 
	static class Node  {
		int data;
		Node previous;
		Node next;
		Node(int d)
		{
			data = d;
			previous= null;
			next = null;
			
		} 
	}
	

	public static void main(String[] args)
	{

		DoubleLinkedList llist = new DoubleLinkedList();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);



		llist.head.next = second; 

		second.next= third; 
	
		
		
		System.out.println(head.data);
		System.out.println(second.data);
		System.out.println(third.data);
	}
}

