import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainMenu{// extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//searchMenu b = new searchMenu();
		//JPanel k = new JPanel();

		//main menu interface instance is created
		//kitchenAssistant a = new kitchenAssistant(k);
				
		//search menu interface instance is created
		//searchMenu b = new searchMenu();

		//update menu interface instance is created
		//updateMenu c = new updateMenu();
		
	}
	/*
	//protected JFrame KA;
	protected static JPanel mainMenu; 
	private JButton Recipe;
	private JButton Search;
	private JButton Update;

	
	public mainMenu(){
		//initialize buttons
		Recipe = new JButton("Recipe");
		Search = new JButton("Search");
		Update = new JButton("Update");
		
		//creates window
		KA = new JFrame();
		KA.setTitle("Kitchen Assistant");
		KA.setSize(600, 600);
		KA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		KA.setLocation(500, 100);

		//creates panels
		mainMenu = new JPanel();
		mainMenu.setSize(400, 400);
		mainMenu.setLayout(new GridLayout(3, 1));

		//Add Buttons to panel
		mainMenu.add(Recipe);
		mainMenu.add(Search);
		mainMenu.add(Update);
		

		//creates button action
		Recipe.addActionListener(this);
		Search.addActionListener(this);
		Update.addActionListener(this);
		

		//add panel to window
		KA.add(mainMenu);
		
		//sets visibility
		KA.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Recipe)
		{
			System.out.println("Recipe button works!");
		}else if (e.getSource() == Search)
		{
			System.out.println("Search button works!");
			//Goto search menu
			//searchMenu a = new searchMenu();
		//	KA.add(searchMenu);
			
		}else if (e.getSource() == Update)
		{
			System.out.println("Update button works!");
		}else{

			//JButton b=(JButton)e.getSource();//checks which button is clicked
			//b.setEnabled(false);//disables clicked button
			
		}
	}
*/
}
