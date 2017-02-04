import javax.swing.*;
import java.awt.*;
import java.awt.event.*;       
public class SwingExample implements ActionListener 
{
	private JTextField t1, t2, t3;	
	public SwingExample() 
{
		JFrame f = new JFrame("SwingExample");
        		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
       		JLabel l1 = new JLabel("First Value:");
		JLabel l2 = new JLabel("Second Value:");
		JLabel l3 = new JLabel("Result:");
		t1 = new JTextField(8);
		t2 = new JTextField(8);
		t3 = new JTextField(8);
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Subtract");
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
        		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(l3);
		f.add(t3);
        		f.pack();
        		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) 
{
		String s1, s2, s;
		int x, y, z;
		s1 = t1.getText();			
		s2 = t2.getText();
		if(s1.equals(""))
			x = 0;
		else
			x = Integer.parseInt(s1);
		if(s2.equals(""))
			y = 0;
		else
			y = Integer.parseInt(s2);
		if(ae.getActionCommand() == "Add")
			z = x + y;
		else
			z = x - y;
		s = String.valueOf(z); 
		t3.setText(s);
	}
	public static void main(String[] args) 
	{
		new SwingExample();		
		
	}
}


