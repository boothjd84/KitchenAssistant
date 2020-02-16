import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class recipe extends JFrame implements ActionListener{
	private JFrame kitchenAssistant; 
	private JPanel recipe;
	private JButton back;
	private JButton make;
	private JLabel Header;
	
    ArrayList recipies = new ArrayList();
    String test;
    
	public recipe(){
		//initialize button, label, & text field
		back = new JButton("Back");
		clear = new JButton("X");
		label = new JLabel("Search Recipies");
		label.setFont(new Font("Serif", Font.BOLD, 30));
		tf.add(clear);
		
		//creates window		
		setTitle("Kitchen Assistant");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 100);
		
		//creates panels
		searchMenu = new JPanel();
		searchMenu.setSize(500, 600);
		searchMenu.setLayout(new GridBagLayout());

		//creates button action
		back.addActionListener(this);
		tf.addActionListener(this);
		clear.addActionListener(this);
		
		//grid dimensions
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		//Add components to panel
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(200,200,0,0);  //top padding
		gbc.gridx = 0;       //aligned with middle
		gbc.gridwidth = 2;   //2 columns wide
		gbc.gridy = 0;       //first row
		searchMenu.add(label,gbc);
		

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 40;      //make this component tall
		gbc.insets = new Insets(0,150,0,0);  //top padding
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 1;
		searchMenu.add(tf, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;      //make this component tall
		gbc.insets = new Insets(0,0,0,100);  // padding
		gbc.weightx = 200.0;
		gbc.gridwidth = 1;
		gbc.gridx = 2;
		gbc.gridy = 1;
		searchMenu.add(clear, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 0;       //reset to default
		gbc.weighty = 100.0;   //request any extra vertical space
		gbc.anchor = GridBagConstraints.LAST_LINE_START; //bottom of space
		gbc.insets = new Insets(0,0,0,300);  //right padding
		gbc.gridwidth = 1;   //2 columns wide
		gbc.gridy = 2;       //third row
		gbc.gridx = 0;       //aligned with left
		searchMenu.add(back, gbc );
		
		//add panel to window
		add(searchMenu);
		
		//sets visibility
		setVisible(true);

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == back)
		{
			System.out.println("Back button works!");
			//Retuen to main menu
			// mainMenu a = new mainMenu();
			
		}else if (e.getSource() == tf)
		{
			System.out.println("Search field works!");
			///////////////////////////////////////////
			// Dung add code here
			//
			//
			//
			//
			//
			//
			///////////////////////////////////////////
			
		}else if (e.getSource()==clear)
		{
			System.out.println("clear text");
			//clear text box
			
		}else {

		}
	}

}

