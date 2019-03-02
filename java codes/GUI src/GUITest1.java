
import javax.swing.*;
public class GUITest1 extends JFrame {
	GUITest1()
	{
		super.setBounds(0,0,500,500);
		super.setTitle("First GUI");
		super.setVisible(true);
		super.setResizable(false);
		super.layout();
	}
public static void main(String[] args) {
	GUITest1 ob = new GUITest1();
	
}
}
