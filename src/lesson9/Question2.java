package lesson9;

import java.util.Arrays;

class Queue {

    private int front;
    private int rear;
    private int queue[];
    int size, length;

    public Queue(int x) {
        size = x;
        queue = new int[x];
        front = -1;
        rear = -1;
        length =0;
    }

    public boolean isempty() {
        return (front == -1 && rear == -1);
    }

    public void add(int value) {
        if ((rear+1)%size==front) {
            throw new IllegalStateException("Queue is full");

        } else if (isempty()) {
            front++;
            rear=front;
            queue[rear] = value;
            length++;

        } else {
            rear=(rear+1)%size;
            queue[rear] = value;
            length++;

        }
    }

    public int remove() {
        int value = 0;
        if (isempty()) {
           System.out.println("Queue is empty, cant remove the value");
        } 
        else 
        {
        	value = queue[front];
        	length--;
         if (front == rear) {	
            front = -1;
            rear = -1;
            

        } else {

            front=front++; //(front+1)%size;

        }
        }
        return value;

    }
    
	public int peak()
	{
		if(!isempty())
		{
			return queue[front];
		}
		return-1;
	}
	
	public int size()
	{
		return length;
	}

    @Override
    public String toString() {
        return "Queue [front=" + front + ", rear=" + rear + ", size=" + size
                + ", queue=" + Arrays.toString(queue) + "]";
    }

}

public class Question2 {
	public static void main(String [] args)
	{
		Queue q1=new Queue(7);
		q1.add(10);
		q1.add(11);
		q1.add(13);
		q1.add(16);
		q1.add(25);
		q1.add(4);
		q1.add(6);
		System.out.println(q1);
		System.out.println("size of queue is :"+q1.size());
		System.out.println(q1.remove());
		
		System.out.println("peak elements is "+q1.peak());
		System.out.println("size of queue is :"+q1.size());
		System.out.println(q1);
	}

}
