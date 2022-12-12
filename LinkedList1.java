package lesson2;

class LinkedList1 {
	static Node head; 
	static class Node  {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		} 
	}
	

	public static void main(String[] args)
	{

		LinkedList1 llist = new LinkedList1();

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

