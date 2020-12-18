package p4_group_8_repo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	
import javafx.application.Application;

/**
 * Date: 18/12/2020
 * This application is a frog game called Frogger
 * The objective of this game is for the frog to avoid obstacles in its path and reach the other end of the map
 * Users have 5 end goals they have to complete in order to win the game.
 * @author Lim Yen Kai
 * @version v1
 */

public class StartScene extends JFrame implements ActionListener{
	JFrame frame;
	JButton button1, button2, button3;
	JLabel label;
	JTextField username;
	
	/**
	 * Generates buttons for start scene to allow users to select levels
	 */
	public StartScene() {
		
		button1 = new JButton("level 1");							//button for level 1
		button1.setBounds(190, 400, 200, 50);
		button1.addActionListener(this);
		button1.setBackground(new Color(38, 187, 46));
		button1.setFont(new Font("Comic Sans", Font.BOLD, 15));
		button1.setFocusable(false);
		button1.setBorder(BorderFactory.createEtchedBorder());
		
		button2 = new JButton("level 2");							//button for level 2
		button2.setBounds(190, 400, 200, 50);
		button2.addActionListener(this);
		button2.setBackground(new Color(38, 187, 46));
		button2.setFont(new Font("Comic Sans", Font.BOLD, 15));
		button2.setFocusable(false);
		button2.setBorder(BorderFactory.createEtchedBorder());
		
		button3 = new JButton("level 3");							//button for level 3
		button3.setBounds(190, 400, 200, 50);
		button3.addActionListener(this);
		button3.setBackground(new Color(38, 187, 46));
		button3.setFont(new Font("Comic Sans", Font.BOLD, 15));
		button3.setFocusable(false);
		button3.setBorder(BorderFactory.createEtchedBorder());
	
		frame = new JFrame();
		label = new JLabel("Please Select Stage:");
		
		GUIsetup();
	}
	
	/**
	 * this method creates a frame containing buttons and labels
	 */
	public void GUIsetup() {
		
		Container cp = frame.getContentPane();	//JFrame setup
		FlowLayout flow = new FlowLayout();		//JFrame layout
		cp.setLayout(flow);						
		frame.setSize(350,100);
		frame.setTitle("Frogger");
		cp.add(label);
		cp.add(button1);	//add level 1 button to frame
		cp.add(button2);	//add level 2 button to frame
		cp.add(button3);	//add level 3 button to frame
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

	
	
	