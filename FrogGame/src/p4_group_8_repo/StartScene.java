package p4_group_8_repo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	
import javafx.application.Application;

public class StartScene extends JFrame implements ActionListener{
	JFrame frame;
	JButton Startbutton, button1, button2, button3;
	JLabel label;
	JTextField username;
	
	public StartScene() {
		
		button1 = new JButton("level 1");
		button1.setBounds(190, 400, 200, 50);
		button1.addActionListener(this);
		button1.setBackground(new Color(38, 187, 46));
		button1.setFont(new Font("Comic Sans", Font.BOLD, 15));
		button1.setFocusable(false);
		button1.setBorder(BorderFactory.createEtchedBorder());
		
		button2 = new JButton("level 2");
		button2.setBounds(190, 400, 200, 50);
		button2.addActionListener(this);
		button2.setBackground(new Color(38, 187, 46));
		button2.setFont(new Font("Comic Sans", Font.BOLD, 15));
		button2.setFocusable(false);
		button2.setBorder(BorderFactory.createEtchedBorder());
		
		button3 = new JButton("level 3");
		button3.setBounds(190, 400, 200, 50);
		button3.addActionListener(this);
		button3.setBackground(new Color(38, 187, 46));
		button3.setFont(new Font("Comic Sans", Font.BOLD, 15));
		button3.setFocusable(false);
		button3.setBorder(BorderFactory.createEtchedBorder());
	
		frame = new JFrame();
		label = new JLabel("Select Stage:");
		username = new JTextField(20);
		
		GUIsetup();
	}
	
	public void GUIsetup() {
		
		Container cp = frame.getContentPane();
		FlowLayout flow = new FlowLayout();
		cp.setLayout(flow);
		frame.setSize(600,690);
		frame.setTitle("Frogger");
		cp.add(label);
		cp.add(button1);
		cp.add(button2);
		cp.add(button3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	


	button1.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	            Application.launch(level1.class);
	    }  
	    });
	
	button2.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	            Application.launch(level2.class);
	    }  
	    });
	
	button3.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	            Application.launch(level3.class);
	    }  
	    });
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

	
	
	