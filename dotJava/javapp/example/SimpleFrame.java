package example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrame
{
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500,200);
            SimplePanel p = new SimplePanel();
            f.add(p);
            f.setVisible(true);
        });
    }    
}
class SimplePanel extends JPanel
{
    private final JButton b1, b2;
    private final JTextField t1, t2, t3;
    private final JLabel l1, l2, l3;
    public SimplePanel()
    {
    b1 = new JButton("Add");
	b2 = new JButton("Subtract");
    t1 = new JTextField(8);  
	t2 = new JTextField(8);
	t3 = new JTextField(8);
	l1 = new JLabel("Val1:");
	l2 = new JLabel("Val2:");
	l3 = new JLabel("Result:");
        MyEventListener me = new MyEventListener();
        b1.addActionListener(me); 
	b2.addActionListener(me);       
        add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b1);
	add(b2);
	add(l3);
        add(t3);        
    }  
    private class MyEventListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {        
            int x, y, z;
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());

            if(e.getActionCommand() == "Add")
	            z = x + y;
	        else
		        z = x - y;
                
            t3.setText(String.valueOf(z));
        }
    }
}
