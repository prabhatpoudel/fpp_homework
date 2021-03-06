package lesson7;

import java.awt.*;

import javax.swing.*;

public class Question1 extends JFrame {
	private JFrame frame;
	private JTextField inTextMile;
	private JTextField inTextPound;
	private JTextField inTextGallon;
	private JTextField inTextFahr;
	private JTextField opTextKm;
	private JTextField opTextKg;
	private JTextField opTextLtr;
	private JTextField opTextCenti;
	
	private JLabel mile;
	private JLabel pound;
	private JLabel gallon;
	private JLabel fahr;
	private JLabel km;
	private JLabel kg;
	private JLabel ltr;
	private JLabel centi;
	
	private JButton convert;
	
	public Question1()
	{
		frame= new JFrame();
		inTextMile= new JTextField();
		inTextPound= new JTextField();
		inTextGallon= new JTextField();
		inTextFahr= new JTextField();
		opTextKm= new JTextField();
		opTextKg= new JTextField();
		opTextLtr= new JTextField();
		opTextCenti= new JTextField();
		
		mile = new JLabel();
		pound = new JLabel();
		gallon = new JLabel();
		fahr = new JLabel();
		km = new JLabel();
		kg = new JLabel();
		ltr = new JLabel();
		centi = new JLabel();
		
		convert = new JButton();
		
		Container cn = getContentPane();
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Metric Conversion Assistant");
		
		mile.setBounds(2, 10, 90, 30);
		mile.setText("Mile:");
		frame.add(mile);
		
		pound.setBounds(2, 50, 90, 30);
		pound.setText("Pound:");
		frame.add(pound);
		
		gallon.setBounds(2, 90, 90, 30);
		gallon.setText("Gallon:");
		frame.add(gallon);
		
		fahr.setBounds(2, 130, 90, 30);
		fahr.setText("Fahrenheit:");
		frame.add(fahr);
		
		inTextMile.setBounds(65, 10, 90, 30);
		inTextMile.setText(null);
		frame.add(inTextMile);
		
		inTextPound.setBounds(65, 50, 90, 30);
		inTextPound.setText(null);
		frame.add(inTextPound);
		
		inTextGallon.setBounds(65, 90, 90, 30);
		inTextGallon.setText(null);
		frame.add(inTextGallon);
		
		inTextFahr.setBounds(65, 130, 90, 30);
		inTextFahr.setText(null);
		frame.add(inTextFahr);
		
		km.setBounds(180, 10, 90, 30);
		km.setText("KiloMeter:");
		frame.add(km);
		
		kg.setBounds(180, 50, 90, 30);
		kg.setText("KiloGram:");
		frame.add(kg);
		
		ltr.setBounds(180, 90, 90, 30);
		ltr.setText("Liter:");
		frame.add(ltr);
		
		centi.setBounds(180, 130, 90, 30);
		centi.setText("Centigrade:");
		frame.add(centi);
		
		opTextKm.setBounds(250, 10, 90, 30);
		frame.add(opTextKm);
		
		opTextKg.setBounds(250, 50, 90, 30);
		frame.add(opTextKg);
		
		opTextLtr.setBounds(250, 90, 90, 30);
		frame.add(opTextLtr);
		
		opTextCenti.setBounds(250, 130, 90, 30);
		frame.add(opTextCenti);
		
		convert.setBounds(160, 180, 90, 30);
		convert.setText("Convert");
		frame.add(convert);

		convert.addActionListener(evt -> 
		{
			
			double km=0;
			double kg=0;
			double ltr=0;
			double cen=0;
			
			
			if(inTextMile.getText().equals(""))
			 { opTextKm.setText("0"); }
			else
			{
				km=1.6*Integer.parseInt(inTextMile.getText()) ;
				//if((int) inTextMile.getText() )
				opTextKm.setText(Double.toString(km));
				}

			
			if(!inTextPound.getText().equals(""))
			{
				kg=0.45*Integer.parseInt(inTextPound.getText()) ;
				opTextKg.setText(Double.toString(kg));
			}
			else { opTextKg.setText("0"); }
			
			if(!inTextGallon.getText().equals(""))
			{
			ltr=3.79*Integer.parseInt(inTextGallon.getText()) ;
			//if((int) inTextMile.getText() )
			opTextLtr.setText(Double.toString(ltr));
			}
			else { opTextLtr.setText("0"); }
			
			if(!inTextFahr.getText().equals(""))
			{
				cen=((Integer.parseInt(inTextFahr.getText()))-30)/2 ;
				opTextCenti.setText(Double.toString(cen));
			}
			else { opTextCenti.setText("0"); }

			
		});
	}
	
public static void main(String args[])
{
	Question1 q1= new Question1();
}

}
