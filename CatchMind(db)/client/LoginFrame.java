package client;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
	
	private JPanel mp;
	private JLabel idlabel;
	private JButton signbutton,loginbutton;
	private JTextField idfield;
	
	LoginFrame(Object c)
	{
		setTitle("로그인");
		addWindowListener( new WindowAdapter() 
		{
			public void windowClosing( WindowEvent e ) {
				System.exit(0); 
			}
		});
		mp = new JPanel();
		idlabel = new JLabel("아이디");
		
		idfield = new JTextField(10);
		
		loginbutton = new JButton("로그인");
		loginbutton.addActionListener((ActionListener)c);
		signbutton = new JButton("회원가입");
		signbutton.addActionListener((ActionListener)c);
		
		add(mp);
		
		mp.setLayout(new FlowLayout());
		
		mp.add(idlabel); mp.add(idfield);
		mp.add(loginbutton); mp.add(signbutton);
		setBounds(650,350,400,80);
	}
	
	public String getID()
	{
		return idfield.getText();
	}
	public String getsignbuttonactioncommand()
	{
		return signbutton.getActionCommand();
	}
	public String getloginbuttonactioncommand()
	{
		return loginbutton.getActionCommand();
	}
	
}
