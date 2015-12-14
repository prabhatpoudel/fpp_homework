package lesson9;

import java.util.LinkedList;

public class Question1 {
	public static void main(String[] args) {
		priorityQueue priQue=new priorityQueue();
		priQue.add(100);
		priQue.add(80);
		priQue.add(200);
		System.out.println(priQue.peek());
		System.out.println(priQue.remove());
		System.out.println(priQue);

	}

}

class Node {
	int num;
	Node next;

	public Node(int number, Node next) {
		this.num = number;
		this.next = next;
	}
	
	public String toString() {
		return "\n Num is :" + num;
	}

}

class priorityQueue {
	Node header;

	public priorityQueue() {
		header = null;
	}
	
	public void add(int x) {
        Node newNode = new Node(x,null);
        Node previous = null;
        Node current = header;

        while (current != null && x < current.num) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            newNode.next = header;
            header = newNode;
        }

        else {
            previous.next = newNode;
            newNode.next = current;
        }
    }
	
/*
	public void add(int x) {
		Node n1;
		boolean flag = false;
		if (header == null) {
			n1 = new Node(x, null);
			header = n1;
		} else {
			Node prev = null;
			Node temp = header;
			while (temp != null) {
				if (temp.num > x) {
					flag = true;
					n1 = new Node(x, temp);
					if (header.num > x) {
						header = n1;
					}
					if (header.num < x)
					{
//						flag=false;	
			            temp = header;
			            header = header.next;
					}
				}
				prev = temp;
				temp = temp.next;
			}
			if (!flag) {
				n1 = new Node(x, null);
				prev.next = n1;
			}

		}
	}
*/
	public Node remove() {
		if (!isEmpty()) {
			Node temp = header;
			Node n1 = header.next;
			header.next = null;
			header = n1;
			return temp;
		}
		return null;
	}

	boolean isEmpty() {
		if (header == null)
			return true;
		else
			return false;
	}

	public int size() {
		Node temp = header;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public Node peek() {
		if (!isEmpty()) {
			return header;
		}
		return null;
	}

	public String toString() {
		Node temp = header;
		String output = "";
		while (temp != null) {
			output += temp.toString();
			temp = temp.next;
		}
		return output;
	}
}
