import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Project001 extends JFrame implements ActionListener
{
	JComboBox<String> box1, box2;
	JButton b1, b2 ,b3;

	public Project001() 
	{
		super.getContentPane().setBackground(Color.CYAN);
		super.setBounds(100, 100, 600, 500);
		super.setResizable(false);		
		//
		box1 = new JComboBox<String>();
		box1.setBounds(50, 100, 200, 20);
		super.add(box1);

		box2 = new JComboBox<String>();
		box2.setBounds(300, 100, 200, 20);
		super.add(box2);
		
		b1 = new JButton("Get Table");
		b1.setBounds(50, 70, 200, 20);
		super.add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Get Table Data");
		b2.setBounds(300, 70, 200, 20);
		super.add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Show Me Databases, u know");
		b3.setBounds(50, 40, 450, 20);
		super.add(b3);
		b3.addActionListener(this);
		//
		super.setLayout(null); // third last
		super.setVisible(true); // second last
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // last
	}
	
	public static void main(String[] args) 
	{
		Project001 p = new Project001();
	}
	
	String dbname = "";
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b3)
		{
			Connection co = ConnectionProvider.getConnection();
			try 
			{
				Statement st = co.createStatement();
				ResultSet rs = st.executeQuery("show databases");
				String str = "";
				while(rs.next())
				{
					str = str + rs.getString(1) + ":";
				}
				
				String[] sa = str.split(":");
				
				for (int i = 0; i < sa.length; i++) 
				{
					box1.addItem(sa[i]);
				}
				
		
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
		if(e.getSource() == b1)
		{
			box2.removeAllItems();
			dbname = (String)box1.getSelectedItem();	
			Connection co = ConnectionProvider.getConnection();
			try 
			{
				Statement st = co.createStatement();
				ResultSet rs = st.executeQuery("show tables in "+dbname);
				String str = "";
				while(rs.next())
				{
					str = str + rs.getString(1) + ":";
				}
				
				String[] sa = str.split(":");
				
				for (int i = 0; i < sa.length; i++) 
				{
					box2.addItem(sa[i]);
				}				
		
			} 
			catch (Exception e2) 
			{
				JOptionPane.showMessageDialog(null, "Pehle maha button click");
				//e2.printStackTrace();
			}

		}
		
		if(e.getSource() == b2)
		{
			String table = (String)box2.getSelectedItem();	
			Connection co = ConnectionProvider.getConnection();
			try 
			{
				Statement st = co.createStatement();
				
				ResultSet rs = st.executeQuery("select * from "+dbname+"."+table);
				
				ResultSetMetaData rsmd = rs.getMetaData();
				
				int cols = rsmd.getColumnCount();
				
				String str = "";
				
				for(int i = 1; i <= cols; i++)
				{
					str = str + rsmd.getColumnName(i) + " :";
				}
				
				str = str + "\n\n";
				
				while(rs.next())
				{
					for(int i = 1; i <= cols; i++)
					{
						str = str + rs.getString(rsmd.getColumnName(i)) +":";
					}
					str = str + "\n";
				}
					
				
			FileOutputStream fo = new FileOutputStream
					("d:/abc/"+table+".txt");
			
			fo.write(str.getBytes());
			
			fo.close();
			
			Runtime.getRuntime().exec("cmd /c start d:/abc/"+table+".txt");
		
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}

		}

	}
}
