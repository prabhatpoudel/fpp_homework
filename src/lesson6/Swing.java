package lesson6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Swing extends JFrame {

	JButton countLetter;
	JButton reverseLetter;
	JButton removeDup;

	JLabel in;
	JLabel out;

	JTextField input;
	JTextField output;

	public Swing() {
		setLayout(new FlowLayout());
		
		countLetter = new JButton("Count Letters");
		countLetter.setBounds(10, 30, 100, 50);
		add(countLetter);
		
		reverseLetter = new JButton("Reverse Letters");
		reverseLetter.setBounds(10, 80, 100, 50);
		add(reverseLetter);
		
		removeDup = new JButton("Remove Duplicates");
		removeDup.setBounds(10, 120, 100, 50);		
		add(removeDup);

		in = new JLabel("Input");
		in.setBounds(180, 30, 100, 50);
		add(in);
		
		input = new JTextField(15);
		input.setBounds(180, 60, 100, 50);
		add(input);
		
		out = new JLabel("Output");
		in.setBounds(180, 90, 100, 50);
		add(out);


		output = new JTextField(15);
		in.setBounds(180, 120, 100, 50);
		add(output);

		// initiating action llistener for the button
		countLetter cl = new countLetter();
		countLetter.addActionListener(cl);

		reverseLetter rl = new reverseLetter();
		reverseLetter.addActionListener(rl);

		removeDup rd = new removeDup();
		removeDup.addActionListener(rd);

	}

	class countLetter implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			String text = input.getText();
			output.setText(Integer.toString(text.length()));
		}
	}

	class reverseLetter implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String text = input.getText();
			output.setText(reverseString(text));
		}

		String reverseString(String inText) {
			String outText = "";

			for (int i = 0; i < inText.length(); i++) {
				outText = outText + inText.charAt(inText.length() - 1 - i);
			}
			return outText;
		}
	}

	class removeDup implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String text = input.getText();
			output.setText(removedup(text));
		}

		String removedup(String inText) {
			String outText = "";
			char chr;

			for (int i = 0; i < inText.length(); i++) {
				chr = inText.charAt(i);
				if (chr != ' ') {
					outText = outText + chr;
				}
				inText = inText.replace(chr, ' ');
			}

			return outText;
		}
	}

}
