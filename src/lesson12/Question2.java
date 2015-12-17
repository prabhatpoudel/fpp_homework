package lesson12;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		boolean flag = false;
		while (!flag) {
			try {
				System.out.println("Please enter the Number Between 0 and 100.");
				Scanner input = new Scanner(System.in);
				int value = Integer.parseInt(input.next());
				if (value < 0 || value > 100) {
					throw new IllegalArgumentException("Number Range must be 0 to 100 only.");
					// UnsupportedOperationException e = new
					// UnsupportedOperationException(
					// "Number Range must be 0 to 100 only.");

				} else
					flag = true;

			} catch (NumberFormatException e) {
				System.out.println("Not a valid number!");
			}
			// catch (UnsupportedOperationException e)
			// {
			// System.out.println(e.getMessage());
			// }
			catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		}
	}

}
