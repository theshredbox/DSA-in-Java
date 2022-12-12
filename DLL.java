package lesson2;
import java.util.*;
import java.io.*;

public class DLL
{
    Node head;
    Node back;
    
    static class Node
    {
        int data;
        Node next;
        Node prev;
        
        Node(int d)
        {
            data = d;
            next = null;
            prev = null;
        }
    }
    
    public static DLL insert(DLL list, int data)
    {
        Node new_node = new Node(data);
        
        if(list.head == null)
        {
            list.head = new_node;
        }
           
        else
        {    
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
            new_node.prev = last;
        }
        list.back = new_node;
        return list;        
    }
    
    public static void printlistfront(DLL list)
    {
        Node curr = list.head;
        System.out.println();
        System.out.print("DoublyLinkedList Front: ");
        while(curr != null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(" NULL ");
    }

    public static void printlistback(DLL list)
    {
        Node curr = list.back;
        System.out.println();
        System.out.print("DoublyLinkedList Back: ");
        while(curr != null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.prev;
        }
        System.out.println(" NULL ");
    }
    
    public static void main(String[] args) 
	{
	    DLL list = new DLL();
	    
        System.out.println();
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();
		
        System.out.print("Enter nodes value: ");
		for(int i=0; i<n; i++)
		{
		    insert(list, sc.nextInt());
		}
		
		printlistfront(list);
        printlistback(list);
	}
}