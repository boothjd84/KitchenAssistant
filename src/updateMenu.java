import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class updateMenu extends JFrame implements ActionListener{
	private JPanel updateMenu; 
	private JButton Scan;
	private JButton Manual;
	private JButton Back;

	
	public updateMenu(){
		//initialize buttons
		Scan = new JButton("Scan");
		Manual = new JButton("Manual");
		Back = new JButton("Back");
		
		//creates window
		setTitle("Kitchen Assistant");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 100);

		//creates panels
		updateMenu = new JPanel();
		updateMenu.setSize(400, 400);
		updateMenu.setLayout(new GridBagLayout());

		//grid dimensions
		GridBagConstraints gbc = new GridBagConstraints();
				
		
		//Add Buttons to panel
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 200;      //make this component tall
		gbc.ipadx = 300;	  //make this component wide
		gbc.insets = new Insets(10,10,10,10);  //padding
		gbc.gridwidth = 3;
		gbc.gridx = 0;	//first column
		gbc.gridy = 0;	//first row
		updateMenu.add(Scan, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 200;      //make this component tall
		gbc.ipadx = 300;	  //make this component wide
		gbc.insets = new Insets(10,10,10,10);  // padding
		gbc.gridwidth = 3;
		gbc.gridx = 0;	//first column
		gbc.gridy = 1;	//second row
		updateMenu.add(Manual, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LAST_LINE_START; //bottom of space
		gbc.ipady = 0;       //reset to default
		gbc.weightx = 150.0;   //request any extra horizontal space
		gbc.insets = new Insets(10,0,0,500);  //mostly right padding
		gbc.gridwidth = 1;   //1 columns wide
		gbc.gridy = 2;       //third row
		gbc.gridx = 0;       //first column
		updateMenu.add(Back, gbc);
		

		//creates button action
		Scan.addActionListener(this);
		Manual.addActionListener(this);
		Back.addActionListener(this);
		

		//add panel to window
		add(updateMenu);

		//sets visibility
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Scan)
		{
			System.out.println("Scan button works!");
		}else if (e.getSource() == Manual)
		{
			System.out.println("Manual button works!");
			//Goto search menu
			//searchMenu a = new searchMenu();
			
		}else if (e.getSource() == Back)
		{
			System.out.println("Back button works!");
		}else{
			
		}
	}

}
