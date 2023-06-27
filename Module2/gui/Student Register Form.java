// Student Register Form 
package srf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Main {
	
	JFrame frame;
	
	JLabel ltitle, lname,lgender,lemail,lPhno, lpwd, lconfirmpwd, lcourses, lbranch, lsemester;
	
	JTextField tname, tgender, temail, tPhno;
	
	JRadioButton rb1, rb2;
	
	JPasswordField tpwd, tconfirmpwd;
	
	JComboBox<String>combo;
	String courses[]= {"ME/M Tect","BCA","MCA"};
	
	JComboBox<String>combo1;
	String branch[]= {"Computer Science Engineering","Mechanical Engineering","Civil Engineering"};
	
	JComboBox<String>combo2;
	String semester[]= {"1","2","3","4"};
	
	JButton btnRegister;
	
	public Main() {
		
		frame = new JFrame("Student Register Form");
		
		// JLabels 
		
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
		
		
		// JTextFields
				
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
				
		tpwd = new JPasswordField();
		tpwd.setBounds(147, 316, 186, 24); 
		
		tconfirmpwd = new JPasswordField();
		tconfirmpwd.setBounds(147, 363, 186, 24); 
		
		combo = new JComboBox<>(courses);
		combo.setBounds(147, 411, 186, 24);
		
		combo1 = new JComboBox<>(branch);
		combo1.setBounds(147, 460, 197, 23);
		
		combo2 = new JComboBox<>(semester);
		combo2.setBounds(147, 505, 197, 23);

		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(187,549,105,35);
		
		btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String name = tname.getText().toString(); 
//				String gender = tgender.getText().toString();
				String email = temail.getText().toString();
				String phno = tPhno.getText().toString();
				String pwd = tpwd.getText().toString();
				String confirmpwd = tconfirmpwd.getText().toString();
				String courses = combo.getItemAt(combo.getSelectedIndex());
				String branch = combo1.getItemAt(combo.getSelectedIndex());
				String semester = combo2.getItemAt(combo.getSelectedIndex());
				
				
				if(pwd.equals(confirmpwd))
				{
					String name1 = "\n\t Your Name is: ";
					String gender1 = "\n Gender is: ";
					String email1 = "\n Your Email is: ";
					String phno1 = "\n Phone No: ";
					String pwd1 = "\n Your Password is: ";
					String courses1 = "\n Course: ";
					String branch1 = "\n Branch: ";
					String semester1 = "\n Semester: ";
					
					try 
					{
						FileOutputStream fout = new FileOutputStream("G://ronak.txt");
						
						fout.write(name1.getBytes());
						fout.write(name.getBytes());
						fout.write(gender1.getBytes());
//						fout.write(gender.getBytes());
						fout.write(email1.getBytes());
						fout.write(email.getBytes());
						fout.write(phno1.getBytes());
						fout.write(phno.getBytes());
						fout.write(pwd1.getBytes());
						fout.write(pwd.getBytes());
						fout.write(courses1.getBytes());
						fout.write(courses.getBytes());
						fout.write(branch1.getBytes());
						fout.write(branch.getBytes());
						fout.write(semester1.getBytes());
						fout.write(semester.getBytes());
					} 
					catch (Exception e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("Success");
				}
				else
				{
					JOptionPane.showMessageDialog(frame, " Your Password and Confirm Password are not same ");
				}
			}
			
		});
		
		frame.add(ltitle);
		frame.add(lname);
		frame.add(lgender);
		frame.add(lemail);
		frame.add(lPhno); 
		frame.add(lpwd);
		frame.add(lconfirmpwd);
		frame.add(lcourses); 
		frame.add(lbranch);
		frame.add(lsemester); 

		frame.add(tname);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(temail);
		frame.add(tPhno);
		frame.add(tpwd);
		frame.add(tconfirmpwd);
		frame.add(combo);
		frame.add(combo1);
		frame.add(combo2); 
		frame.add(btnRegister);
		
		frame.setSize(472,650);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main(); 
	}
}
