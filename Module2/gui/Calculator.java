package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
	
	JFrame frame; 
	JLabel l1, l2, ldisplay_value;
	JTextField t1, t2;
	JButton btnAddition, btnSubtraction;
	
	// Constructor 
	public Calculator() {
		
		frame = new JFrame("Calculator");

		
		l1 =new JLabel("Enter First Value: ");
		l1.setBounds(33, 92, 102, 25);
		
		l2 =new JLabel("Enter Second Value: ");
		l2.setBounds(33, 150, 126, 25);
		
		ldisplay_value = new JLabel("Result is: " ); 
		ldisplay_value.setBounds(33, 224, 248, 51);
		
		
		t1 = new JTextField();
		t1.setBounds(153, 92, 126, 25);
		
		t2 = new JTextField();
		t2.setBounds(154, 150, 126, 25);
		

		
		btnAddition = new JButton("+");
		btnAddition.setBounds(235,380,77,51);
		

		btnAddition.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

			 	double n1 = Double.parseDouble(t1.getText()); 
			 	double n2 = Double.parseDouble(t2.getText()); 

			 	Double addition = n1 + n2; 
			 	
			 	ldisplay_value.setText("Result is: " + addition);
			 	
			 
			}
			  
		}); 
		
		btnSubtraction = new JButton("-");
		btnSubtraction.setBounds(235,442,77,51);
		
		btnSubtraction.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

			 	double n1 = Double.parseDouble(t1.getText()); 
			 	double n2 = Double.parseDouble(t2.getText()); 

			 	Double addition = n1 - n2; 
			 	
			 	ldisplay_value.setText("Result is: " + addition);
			}
			  
		}); 
		
		
		frame.getContentPane().add(l1); 
		frame.getContentPane().add(l2);

		frame.getContentPane().add(t1); 
		frame.getContentPane().add(t2);
		frame.getContentPane().add(ldisplay_value); 
		
		frame.getContentPane().add(btnAddition);
		frame.getContentPane().add(btnSubtraction);
		
		frame.setSize(338,543);	
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		// call Constructor 
		new Calculator(); 
	}
	
}
