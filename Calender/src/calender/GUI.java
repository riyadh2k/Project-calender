package calender;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		frame.setSize(1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(1,7,5,5));
	
	DayDate  dayDate = new DayDate();
//	String monDate = dayDate.getWeekDate(DayOfWeek.MONDAY);
	
	addGroupOfComponents("Add",panel,"MONDAY",dayDate.getWeekDate(DayOfWeek.MONDAY));
	addGroupOfComponents("Add",panel,"TUESDAY",dayDate.getWeekDate(DayOfWeek.TUESDAY));
	addGroupOfComponents("Add",panel,"WEDNESDAY",dayDate.getWeekDate(DayOfWeek.WEDNESDAY));
	addGroupOfComponents("Add",panel,"THURSDAY",dayDate.getWeekDate(DayOfWeek.THURSDAY));
	addGroupOfComponents("Add",panel,"FRIDAY",dayDate.getWeekDate(DayOfWeek.FRIDAY));
	addGroupOfComponents("Add",panel,"SATURDAY",dayDate.getWeekDate(DayOfWeek.SATURDAY));
	addGroupOfComponents("Add",panel,"SUNDAY",dayDate.getWeekDate(DayOfWeek.SUNDAY));
		
	frame.add(panel);
	frame.setVisible(true);
	
}

	private static void addGroupOfComponents(String text, JPanel panel,String day, String date) {
		// TODO Auto-generated method stub
		JPanel panelChild = new JPanel();
		panelChild.setLayout(new BoxLayout(panelChild, BoxLayout.Y_AXIS));
		JLabel labelday= new JLabel(day);
		JLabel labeldate= new JLabel(date);
		
		JTextArea eventTextarea = new JTextArea();
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
//		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		setDayColor(labelday, date);
		
		panel.add(panelChild);
		
	}
	
	private static void addButtonListener(JButton button, JTextArea label, JTextField tf) {
		ActionListener buttonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(button.getText());
//				System.out.println(tf.getText());
				label.setText(label.getText()+"\n"+tf.getText());
				tf.setText(" ");
			
			}
			
		};
		button.addActionListener(buttonListener);
	}
	private static void setDayColor(JLabel labelday, String date) {
		if(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")).equals(date)) {
			labelday.setOpaque(true);
			labelday.setBackground(Color.GREEN);
		}
		
	}
	
}
