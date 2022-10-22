package calender;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {
	
	static void createAndDisplay(){
	JFrame frame= new JFrame("Calender");
	frame.setSize(800, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
//	JLabel label = new JLabel("This Is A Label");
//	f.add(label);
//	f.setVisible(true);
	
//	JButton button = new JButton ("Button");
//	f.add(button);
//	f.setVisible(true);
	
//	JTextField tf = new JTextField ("Input text here.......");
//	f.add(tf);
//	f.setVisible(true);
	
	JPanel panel = new JPanel();
		
	addGroupOfComponents("Group 1",panel,"Monday");
	addGroupOfComponents("Group 2",panel,"Tuesday");
	addGroupOfComponents("Group 3",panel,"Wednesday");
	addGroupOfComponents("Group 4",panel,"Thursday");
	addGroupOfComponents("Group 5",panel,"Friday");
	addGroupOfComponents("Group 6",panel,"Saturday");
	addGroupOfComponents("Group 7",panel,"Sunday");
	
	
	
	
	
	
//	// change to get and set
//	
//	label.setText("Replace!");
//	button.setText(label.getText());
//	
//	ActionListener buttonListener = new ActionListener() {
//
//		private void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("Button Clicked");
//			label.setText(tf.getText());
//			tf.setText("");
//		}
//		
//	};
//	button.addActionListener(buttonListener);
//	
//	
//	
//	
//	
//	
	frame.add(panel);
	frame.setVisible(true);
	
	
	

}

	private static void addGroupOfComponents(String text, JPanel panel,String day) {
		// TODO Auto-generated method stub
		JLabel labelday= new JLabel(day);
		JLabel label = new JLabel(text + "Label");
		JButton button = new JButton (text+ "Button");
		JTextField tf = new JTextField (text+ "Text Field", 10);
		addButtonListener(button, label, tf);
		panel.add(labelday);
		panel.add(label);
		panel.add(button);
		panel.add(tf);
		
	}
	
	private static void addButtonListener(JButton button, JLabel label, JTextField tf) {
		ActionListener buttonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(button.getText());
				System.out.println(tf.getText());
				label.setText(tf.getText());
				tf.setText(" ");
			}
			
		};
		button.addActionListener(buttonListener);
	}
	
	

	

}
