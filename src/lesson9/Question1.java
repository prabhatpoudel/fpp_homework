package lesson9;

import java.util.LinkedList;

public class Question1 {
	public static void main(String [] args)
	{
		LinkedList<Node> pq= new LinkedList<>();
		
		pq.add(new Node(number, val));
	}

}

class Node
{
	int num;
	String value;
	
	public Node(int number, String val)
	{
		this.num=number;
		this.value=val;
	}
	
	public String toString()
	{
		return "ID is: "+num+" Value is: "+value;
	}
}

class priorityQueue
{
	Node header;
	
	public priorityQueue ()
	{
		header=null;
	}
	
	public void add()
	{
		
	}
	
	public Node remove()
	{
		
	}
	
	boolean isEmpty()
	{
		
	}
}
