package client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignFrame extends JFrame{
	private JPanel mp;
	private JLabel jl;
	private JTextField jtf;
	private JButton signin,check;
	
	SignFrame(Object c)
	{
		mp = new JPanel();
		jl = new JLabel("아이디");
		jtf = new JTextField(10);
		signin = new JButton("가입");
		check = new JButton("중복체크");
		signin.setEnabled(false);
		setTitle("회원가입");
		setBounds(650,350,400,80);
		signin.addActionListener((ActionListener)c);
		check.addActionListener((ActionListener)c);
		add(mp);
		mp.setLayout(new FlowLayout());
		mp.add(jl); mp.add(jtf); mp.add(signin); mp.add(check);
	}
	public String getID()
	{
		return jtf.getText();
	}
	public String getsigninbuttonactioncommend()
	{
		return signin.getActionCommand();
	}
	public String getcheckbuttonactioncommend()
	{
		return check.getActionCommand();
	}
	public void setEnabled(boolean t)
	{
		signin.setEnabled(t);
	}
}
