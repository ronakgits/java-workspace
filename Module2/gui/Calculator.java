package calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
	
	JFrame f; 
	JLabel l1, l2;
	JTextField t1, t2;
	JButton btnAddition, btnSubmit;
	
	// Constructor 
	public Calculator() {
		
		f = new JFrame("Calculator");
		f.setSize(338,543);	
		f.setVisible(true);
		f.getContentPane().setLayout(null);
		f.setLocationRelativeTo(null);
		
		
		l1 =new JLabel("Enter First Value: ");
		l1.setBounds(52, 92, 88, 25);
		
		l2 =new JLabel("Enter Second Value: ");
		l2.setBounds(52, 150, 102, 25);
		
		
		t1 = new JTextField();
		t1.setBounds(150, 92, 129, 25);
		
		t2 = new JTextField();
		t2.setBounds(151, 150, 129, 25);

		
		btnAddition = new JButton("+");
		btnAddition.setBounds(235,380,77,51);
		
		btnSubmit = new JButton("=");
		btnSubmit.setBounds(235,442,77,51);
		
				
		f.getContentPane().add(l1); 
		f.getContentPane().add(l2);

		f.getContentPane().add(t1); 
		f.getContentPane().add(t2);
		
		f.getContentPane().add(btnAddition);
		
		f.getContentPane().add(btnSubmit);
	}
	
	public static void main(String[] args) {
		// call Constructor 
		new Calculator(); 
	}
	
}

