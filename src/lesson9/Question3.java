package lesson9;

import java.util.Stack;

public class Question3 {
	public static void main (String [] args)
	{
		String word = "ABD1BA";
		String reverseWord ="";
		Stack st = new Stack();
		
		for(int i =0; i<word.length(); i++)
		{
			st.add(word.charAt(i));
		}
		
		while(!st.isEmpty())
		{
			reverseWord= reverseWord+st.pop();
		}
		
		if(word.equals(reverseWord))
		{
			System.out.println("String is Palindrome.");
		}
		else 
			System.out.println("String is Not Palindrome.");
		
	}

}
