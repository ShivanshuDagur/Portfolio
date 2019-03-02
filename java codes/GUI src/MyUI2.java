import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class MyUI2 extends JFrame implements ActionListener {
	
	// refvar of button/ textfiled/pass/area/pane/label
	JButton b, b2;
	JTextField tf;
	JPasswordField pf;
	JTextArea area;
	JScrollPane pane;
	JLabel l;

	public MyUI2() {		
	super.setTitle("Frame#2");
	super.setBounds(100, 50, 700, 600);
	super.setResizable(false);
	// --------------------------------------
	// create a button
	b = new JButton("open");
	// set dimension of button
	b.setBounds(100, 300, 100, 25);
	// add button to the frame
	super.add(b);
	// register the button for event handling
	b.addActionListener(this);

	// create a button
	b2 = new JButton("close");
	// set dimension of button
	b2.setBounds(220, 300, 100, 25);
	// add button to the frame
	super.add(b2);
	// register the button for event handling
	b2.addActionListener(this);

	
	// create a tesxtfield
	tf = new JTextField();
	// set dimension of textfield
	tf.setBounds(100, 270, 200, 20);
	// add button to the frame
	super.add(tf);

	// create a password
	pf = new JPasswordField();
	// set dimension of textfield
	pf.setBounds(320, 270, 200, 20);
	// add button to the frame
	super.add(pf);
	
	// create a textarea
	area = new JTextArea();
	// create object of scrollpane
	pane = new JScrollPane(area);
	// set dimension of area
	pane.setBounds(100, 50, 420, 200);
	// add area to frame
	super.add(pane);
		
	// create a label
	l = new JLabel("Details");
	// set dim of label
	l.setBounds(100, 30, 100, 20);
	// add label to frame
	super.add(l);	
	// --------------------------------------
	super.setLayout(null); // must be second last statement
	super.setVisible(true); // must be last statement
	}
	
	public static void main(String[] args) {
		
	MyUI2 m = new MyUI2();	
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b) {
		// fetch the data of tf and pf
		String t1 = tf.getText();
		String t2 = pf.getText();
		String t3 = t1.concat(t2);
		// store t3 inside area
		area.setText(t3);				
		}
		if(e.getSource()==b2) {
			Runtime r = Runtime.getRuntime();
			r.exit(0);
		}
		
	}
	
}
