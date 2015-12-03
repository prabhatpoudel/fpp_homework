package lesson6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import lesson6.Swing.countLetter;

public class Question2 {
	private static JFrame frame;
	private JButton red,orange,yellow,green,blue,indigo,violet;
	private JPanel panel;
	
	public Question2(){
		frame= new JFrame();
		red= new JButton("Red");
		orange= new JButton("Orange");
		yellow= new JButton("Yellow");
		green= new JButton("Green");
		blue= new JButton("Blue");
		indigo= new JButton("Indigo");
		violet= new JButton("Violet");
		panel= new JPanel(new FlowLayout(FlowLayout.CENTER));
		
	  final Color VIOLET = new Color(138, 43, 226); 
      final Color INDIGO = new Color(75, 0, 130);   
		
		frame.setVisible(true);
		frame.setSize(600, 300);
		frame.setTitle("Rainbow Color Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// if Using frame uncomment this part
//		frame.setLayout(new FlowLayout());
		

		//For the use of Panel
          frame.add(panel);
          panel.setSize(600,300);

		
/* If Using Frame uncomment this part
 		red.setBounds(10, 20, 10, 10);
		red.setBackground(Color.red);
		frame.add(red);
		orange.setBounds(10, 30, 10, 10);
		orange.setBackground(Color.orange);
		frame.add(orange);
		yellow.setBounds(10, 40, 10, 10);
		yellow.setBackground(Color.yellow);
		frame.add(yellow);
		green.setBounds(10, 50, 10, 10);
		green.setBackground(Color.green);
		frame.add(green);
		blue.setBounds(10, 60, 10, 10);
		blue.setBackground(Color.blue);
		frame.add(blue);
		indigo.setBounds(10, 70, 10, 10);
		indigo.setBackground(INDIGO);
		frame.add(indigo);
		violet.setBounds(10, 80, 10, 10);
		violet.setBackground(VIOLET);
		frame.add(violet);
*/		

          // Use of Panel
		red.setSize(100, 100);
		red.setBackground(Color.red);
		panel.add(red);
		orange.setSize(100, 100);
		orange.setBackground(Color.orange);
		panel.add(orange);
		yellow.setSize(100, 100);
		yellow.setBackground(Color.yellow);
		panel.add(yellow);
		green.setSize(100, 100);
		green.setBackground(Color.green);
		panel.add(green);
		blue.setSize(100, 100);
		blue.setBackground(Color.blue);
		panel.add(blue);
		indigo.setSize(100, 100);
		indigo.setBackground(INDIGO);
		panel.add(indigo);
		violet.setSize(100, 100);
		violet.setBackground(VIOLET);
		panel.add(violet);
		
		// initializing the action listener
		red r = new red();
		red.addActionListener(r);
		
		orange o = new orange();
		orange.addActionListener(o);
		
		yellow y = new yellow();
		yellow.addActionListener(y);
		
		blue b = new blue();
		blue.addActionListener(b);
		
		green g = new green();
		green.addActionListener(g);
		
		indigo i = new indigo();
		indigo.addActionListener(i);
		
		violet v = new violet();
		violet.addActionListener(v);
		
		
	}
	
	// action to perform once button gets clicked
	class red implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(frame,
				    "Red signifies passion, vitality, enthusiasm and security.");
		}
	}
	
	class yellow implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(frame,
				    "Yellow represents clarity of thought, wisdom, orderliness and energy.");
		}
	}
	
	class orange implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(frame, "Orange represent creativity, practicality, playfulness as well as equilibrium or control.");
		}
	}
	
	class green implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(frame, "Green denotes fertility, growth, balance, health and wealth.");
		}
	}
	
	class blue implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(frame, "Blue makes us think of the Unknown. The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.");
		}
	}
	
	class indigo implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(frame, "Indigo bridges the Gap between Finite and Infinite.");
		}
	}
	
	class violet implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(frame, "Violet can ignite one’s imagination and be an inspiration to artists. Dark tones of violet are associated with sorrow. Deeper shades of violet or purple denote high spiritual mastery.");
		}
	}
	
	public static void main(String [] args)
	{

		
		Question2 q2= new Question2();
	}

}
