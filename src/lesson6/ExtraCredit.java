package lesson6;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.nio.channels.SelectableChannel;

import javax.swing.*;

public class ExtraCredit {
	
	private JFrame frame;
	private JLabel firstName,lastName,street,city,state,country,gender,selectCourse,suitableSession,message;
    private JPanel panel1,panel2;
	
	public ExtraCredit()
	{
		// Container Declaration
		frame= new JFrame();
		frame.setSize(500, 750);
		frame.setVisible(true);
//		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

		
		frame.add(panel1);
//		panel1.setBounds(0, 0, 250, 800);
		panel1.setSize(250,750);
		
		frame.add(panel2);
//		panel2.setBounds(260, 0, 250, 800);
		panel2.setSize(250,750);
		panel2.setBackground(Color.RED);
		
		// Component Declaration for panel1
		
		firstName= new JLabel("First Name: ");
		lastName= new JLabel("Last Name: ");
		street= new JLabel(" Street: ");
		city= new JLabel("City: ");
		state= new JLabel("State: ");
		country= new JLabel("Country: ");
		gender= new JLabel("Gender: ");
		selectCourse= new JLabel("Select Course: ");
		suitableSession= new JLabel("Suitable Session: ");
		message= new JLabel("Message");
		

		
		message.setBounds(0,500,100,100);
		suitableSession.setBounds(0,450,100,100);
		selectCourse.setBounds(0,400,100,100);
		gender.setBounds(0,350,100,100);
		country.setBounds(0,300,100,100);
		state.setBounds(0,250,100,100);
		city.setBounds(0,200,100,100);
		street.setBounds(0,150,100,100);
		lastName.setBounds(0,100,100,100);
		firstName.setBounds(0,50,100,100);
		
		//Adding Component to the panel1
		panel1.add(firstName);
		panel1.add(lastName);
		panel1.add(street);
		panel1.add(city);
		panel1.add(state);
		panel1.add(country);
		panel1.add(gender);
		panel1.add(selectCourse);
		panel1.add(suitableSession);
		panel1.add(message);
		
	}
	
	public static void main(String [] args)
	{

		
		ExtraCredit ec= new ExtraCredit();
	}

}
