package calender;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {
	
	static void createAndDisplay(){
	JFrame frame= new JFrame("Calender");
	frame.setSize(1024, 600);
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
	panel.setLayout(new GridLayout(1,7,5,5));	
	addGroupOfComponents("Add Event",panel,"Monday","2022/10/22");
	
//	panel.setBorder((BorderFactory.createLineBorder(Color.black)));
//	panel.setBounds(10, 10, 150, 300);
	addGroupOfComponents("Add Event",panel,"Tuesday","2022/10/22");
	addGroupOfComponents("Add Event",panel,"Wednesday","2022/10/22");
	addGroupOfComponents("Add Event",panel,"Thursday","2022/10/22");
	addGroupOfComponents("Add Event",panel,"Friday","2022/10/22");
	addGroupOfComponents("Add Event",panel,"Saturday","2022/10/22");
	addGroupOfComponents("Add Event",panel,"Sunday","2022/10/22");
	
	
	
	
	
	
//	// change to get and set
//	
//	label.setText("Replace!");
//	button.setText(label.getText());

	
	frame.add(panel);
	frame.setVisible(true);
	
	
	

}

	private static void addGroupOfComponents(String text, JPanel panel,String day, String date) {
		// TODO Auto-generated method stub
		JPanel panelChild = new JPanel();
		panelChild.setLayout(new BoxLayout(panelChild, BoxLayout.Y_AXIS));
		JLabel labelday= new JLabel(day);
		JLabel labeldate= new JLabel(date);
		
		JTextArea eventTextarea = new JTextArea(text + "Label");
		eventTextarea.setEditable(false);
		eventTextarea.setLineWrap(true);
//		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		JButton button = new JButton (text+ "");
//		button.setHorizontalAlignment(JButton.CENTER);
		JTextField tf = new JTextField (text+ "Text Field",20);
		tf.setMaximumSize(new Dimension (Short.MAX_VALUE, 500));
		addButtonListener(button, eventTextarea, tf);
		panelChild.setBorder((BorderFactory.createLineBorder(Color.black)));
//		panel.add(labelday);
		
		panelChild.add(labelday);
		panelChild.add(labeldate);
		panelChild.add(eventTextarea);
		Dimension minSize = new Dimension(5, 100);
		Dimension prefSize = new Dimension(5, 100);
		Dimension maxSize = new Dimension(Short.MAX_VALUE, Short.MAX_VALUE);
		panelChild.add(new Box.Filler(minSize, prefSize, maxSize));
		panelChild.add(tf);
		panelChild.add(button);
		panel.add(panelChild);
		
	}
	
	private static void addButtonListener(JButton button, JTextArea label, JTextField tf) {
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
