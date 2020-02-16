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

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class enterMenu extends JFrame implements ActionListener, Runnable{

	public JScrollPane enterMenuPane;
	public JPanel enterMenu;
	private JButton enterMenuBack;
	private JButton enterMenuClear;
	private JButton enterMenuUpdate;
	private JButton enterMenuAdd;
	private JButton enterMenuRemove;
	private JLabel enterMenuLabel;
	private JLabel enterMenuResultField;
	public String ingredients;
	
	
    JTextField enterMenuTF = new JTextField(20);
    
	public enterMenu(){
		//initialize button, label, & text field
		enterMenuBack = new JButton("Back");
		enterMenuClear = new JButton("X");
		enterMenuLabel = new JLabel("Search Results");
		enterMenuTF.setText("Search for ingredients");
		enterMenuAdd = new JButton("+");
		enterMenuRemove = new JButton("-");
		enterMenuUpdate = new JButton("Update");
		enterMenuLabel.setFont(new Font("Serif", Font.BOLD, 30));
		enterMenuResultField = new JLabel();//ingredients);
		
		//enterMenuTF.add(enterMenuClear);
		
		//creates window		
		setTitle("Kitchen Assistant");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 100);
		
		//creates pane and panel
		enterMenuPane = new JScrollPane(enterMenu, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//invokeLater(new Runnable() {  @Override public void run() { frame.setVisible(true);}
		enterMenu = new JPanel();
		enterMenu.setSize(400, 500);
		enterMenu.setLayout(new FlowLayout());

		//creates button action
		enterMenuBack.addActionListener(this);
		enterMenuTF.addActionListener(this);
		enterMenuClear.addActionListener(this);
		
		//grid dimensions
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Add components to panel
		enterMenu.add(enterMenuTF);
		
		enterMenu.add(enterMenuClear);
		
		enterMenu.add(enterMenuLabel);
		
		enterMenu.add(enterMenuResultField);
		
		enterMenu.add(enterMenuAdd);
		
		enterMenu.add(enterMenuRemove);	
	
		enterMenu.add(enterMenuBack);
		
		enterMenu.add(enterMenuUpdate );
		
		//adds panel
		enterMenuPane.add(enterMenu);
		
		add(enterMenuPane);
		
		//sets visibility
		enterMenu.setVisible(true);

	}
	public static void main(String[] args)
	{
		
		enterMenu a = new enterMenu();

		 SwingUtilities.invokeLater(a);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == enterMenuBack)
		{
			System.out.println("Back button works!");
			//Retuen to main menu
			// mainMenu a = new mainMenu();
			
		}else if (e.getSource() == enterMenuTF)
		{
			System.out.println("Search field works!");
			ingredients = enterMenuTF.getText();
			///////////////////////////////////////////
			// Dung add code here
			//
			//
			//
			//
			//
			//
			///////////////////////////////////////////
			
		}else if (e.getSource()==enterMenuClear)
		{
			System.out.println("clear text");
			enterMenuTF.setText("");
			//clear text box
			
		}else {

		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
