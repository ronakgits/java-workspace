// Student Register Form 

import java.awt.Font; 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
//import javax.swing.JOptionPane;

public class Main {
	
	JFrame frame;
	
	JLabel ltitle, lname,lgender,lemail,lPhno, lpwd, lconfirmpwd, lcourses, lbranch, lsemester;
	
	JTextField tname, tgender, temail, tPhno, tpwd, tconfirmpwd;
	
	JRadioButton rb1, rb2;
	
	JPasswordField tpass,tconfirmpass;
	
	JComboBox<String>combo;
	String courses[]= {"ME/M Tect","BCA","MCA"};
	
	JComboBox<String>combo1;
	String branch[]= {"Computer Science Engineering","Mechanical Engineering","Civil Engineering"};
	
	JComboBox<String>combo2;
	String semester[]= {"1","2","3","4"};
	
	JButton btnRegister;
	
	public Main() {
		
		frame = new JFrame("Student Register Form");
		
		ltitle = new JLabel("Register a new Student"); 
		ltitle.setBounds(10, 26, 436, 35);
		ltitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
		ltitle.setHorizontalAlignment(JLabel.CENTER);
		
		lname = new JLabel("Name"); 
		lname.setBounds(60, 105, 72, 30);
		lname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lgender = new JLabel("Gender"); 
		lgender.setBounds(60, 161, 72, 30);
		lgender.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lemail = new JLabel("Mail Id"); 
		lemail.setBounds(60, 220, 72, 30);
		lemail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lPhno = new JLabel("Mobile No");
		lPhno.setBounds(60, 264, 72, 30);
		lPhno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lpwd = new JLabel("Password");
		lpwd.setBounds(60, 316, 72, 30);
		lpwd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lconfirmpwd = new JLabel("Re Password");
		lconfirmpwd.setBounds(60, 359, 105, 30);
		lconfirmpwd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lcourses = new JLabel("Courses");
		lcourses.setBounds(60, 407, 105, 30);
		lcourses.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lbranch = new JLabel("Branch");
		lbranch.setBounds(60, 455, 105, 30);
		lbranch.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lsemester = new JLabel("Semester");
		lsemester.setBounds(60, 500, 105, 30);
		lsemester.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
//		
				
		tname = new JTextField();
		tname.setBounds(147, 109, 186, 24);
		
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(147, 166, 71, 23);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(220, 166, 72, 23);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		
		temail = new JTextField();
		temail.setBounds(147, 220, 186, 24);
		
		tPhno = new JTextField();
		tPhno.setBounds(147, 268, 186, 24); 
				
		tpwd = new JTextField();
		tpwd.setBounds(147, 316, 186, 24); 
		
		tconfirmpwd = new JTextField();
		tconfirmpwd.setBounds(147, 363, 186, 24); 
		
		combo = new JComboBox<>(courses);
		combo.setBounds(147, 411, 186, 24);
		
		combo1 = new JComboBox<>(branch);
		combo1.setBounds(147, 460, 197, 23);
		
		combo2 = new JComboBox<>(semester);
		combo2.setBounds(147, 505, 197, 23);

		btnRegister = new JButton("Register");
		btnRegister.setBounds(187,549,105,35);
		
		
		frame.getContentPane().add(ltitle);
		frame.getContentPane().add(lname);
		frame.getContentPane().add(lgender);
		frame.getContentPane().add(lemail);
		frame.getContentPane().add(lPhno); 
		frame.getContentPane().add(lpwd);
		frame.getContentPane().add(lconfirmpwd);
		frame.getContentPane().add(lcourses); 
		frame.getContentPane().add(lbranch);
		frame.getContentPane().add(lsemester); 

		frame.getContentPane().add(tname);
		frame.getContentPane().add(rb1);
		frame.getContentPane().add(rb2);
		frame.getContentPane().add(temail);
		frame.getContentPane().add(tPhno);
		frame.getContentPane().add(tpwd);	
		frame.getContentPane().add(tconfirmpwd);
		frame.getContentPane().add(combo);
		frame.getContentPane().add(combo1);
		frame.getContentPane().add(combo2); 
		

		frame.getContentPane().add(btnRegister);
		
		frame.setSize(472,650);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Main(); 
	}
}
