import javax.swing.JFrame;

public class MyUI extends JFrame {
	
	public MyUI() {
	
	// set title of frame	
	super.setTitle("My Frame !!");	
	
	// set dimensions of frame
	super.setBounds(200, 100, 600, 500);
	
	// set frame size non modifiable
	super.setResizable(false);
	
	// show frame on screen
	super.setVisible(true);	
	
	}
	
	public static void main(String[] args) {
	
		MyUI m = new MyUI();
		
		
	}

}
