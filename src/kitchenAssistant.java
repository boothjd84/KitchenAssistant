import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kitchenAssistant extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JButton b1,b2;
private JPanel panel1 = new JPanel(), panel2 = new JPanel(), contentPanel = new JPanel();
private CardLayout cardLayout = new CardLayout();
	
	public kitchenAssistant()
	{
		super("Card Layout");
		b1 = new JButton("Go to the second card");
		b2 = new JButton("Go to the first card");

		panel1.setBackground(Color.PINK);
		panel2.setBackground(Color.BLUE);
		
		
		actionListener al = new actionListener();
		
		b1.addActionListener(al);
		b2.addActionListener(al);
		
		panel1.add(b1);
		panel2.add(b2);
		
		contentPanel.setLayout(cardLayout);
		
		contentPanel.add(panel1, "panel1");
		contentPanel.add(panel2, "panel2");
		
		this.setContentPane(contentPanel);
		
		cardLayout.show(contentPanel, "panel1");

	}

	public class actionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event) 
		{
			JButton src = (JButton) event.getSource();
			// TODO Auto-generated method stub
			if (src.equals(b1))
			{
				cardLayout.show(contentPanel, "panel2");
			}else if (src.equals(b2))
			{
				cardLayout.show(contentPanel, "panel1");

			}else{

		
			}
	}

	
	}

}
