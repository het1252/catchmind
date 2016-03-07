package client;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class RoomCreateFrame extends JFrame{
	private JPanel MainPanel;
	private JLabel RoomNameLabel;
	private JTextField RoomNameTextField;
	private JButton CreateButton;
	
	RoomCreateFrame(Object c)
	{
		setTitle("�� ����");
		MainPanel = new JPanel();
		RoomNameLabel = new JLabel("�� �̸�");
		RoomNameTextField = new JTextField(10);
		CreateButton = new JButton("����");
		
		CreateButton.addActionListener((ActionListener)c);
		add(MainPanel);
		
		MainPanel.setLayout(new FlowLayout());
		MainPanel.add(RoomNameLabel);
		MainPanel.add(RoomNameTextField);
		MainPanel.add(CreateButton);
		
		setBounds(500,400,200,100);
	}
	
	
	public String getRoomName()
	{
		return RoomNameTextField.getText();
	}
	public String getcreatebuttonactioncommend()
	{
		return CreateButton.getActionCommand();
	}
	public void setTextClear()
	{
		RoomNameTextField.setText(" ");
	}
}
