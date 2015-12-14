package lesson12;

import java.util.Scanner;

class CustomerAccount {
	String cus_name;
	int acc_No;
	double balance;

	public CustomerAccount(String name, int acc, double bal) {
		this.cus_name = name;
		this.acc_No = acc;
		this.balance = bal;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public int getAcc_No() {
		return acc_No;
	}

	public void setAcc_No(int acc_No) {
		this.acc_No = acc_No;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double bal) {
		balance = balance + bal;
	}

	public void withdraw(double bal) {
		balance = balance - bal;
	}
}

public class Question3 {

	public static void main(String[] args) {
		double withdraw = 0.0;
		double deposit = 0.0;
		CustomerAccount ca = new CustomerAccount("Prabhat Poudel", 123456, 1000.00);
		
		boolean exit = false;

		while (!exit) {
			try {
				System.out.println("Please choose the below options: \n Deopsit: d \n WithDraw: w \n Exit: e");
				Scanner input = new Scanner(System.in);
				String choice = input.next();
				
				if (ca.getBalance() < 100) {
					throw new Exception("Balance is getting low.");
				}
				switch (choice) {
				case "d":

					System.out.println("Please enter the amount to Deposit: ");
					deposit = input.nextDouble();
					ca.deposit(deposit);
					break;
				case "w":
					System.out.println("Please enter the amount to Withdraw: ");
					withdraw = input.nextDouble();
					if (ca.getBalance() < withdraw) {
						throw new Exception("Available balace is Low, please deposit the balance.");
					} else
					{
						ca.withdraw(withdraw);
					}
					break;
				case "e":
					exit = true;
					break;
				default:
					break;
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

}
