// 3. Write a GUI application that receives three numeric values as input and then displays
// the largest of the three numbers. Use text fields for input and output. The result
// should be displayed when a button is pressed and a checkbook is checked.

package checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkbox {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame f = new JFrame();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(500, 200);
			SimplePanel p = new SimplePanel();
			f.add(p);
			f.setVisible(true);
		});
	}
}

class SimplePanel extends JPanel {
	private final JTextField t1, t2, t3, t4;
	private final JLabel l1, l2, l3, l4;
	private final JCheckBox cb;
	private final JButton b1;

	public SimplePanel() {
		t1 = new JTextField(8);
		t2 = new JTextField(8);
		t3 = new JTextField(8);
		t4 = new JTextField(8);

		l1 = new JLabel("Input 1:");
		l2 = new JLabel("Input 2:");
		l3 = new JLabel("Input 3:");
		l4 = new JLabel("Greater:");

		b1 = new JButton("Check");
		cb = new JCheckBox("Tick here!");
		MyEventListener me = new MyEventListener();
		b1.addActionListener(me);
		// addMouseListener(me);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(l1);
		add(t1);

		add(l2);
		add(t2);

		add(l3);
		add(t3);

		add(cb);
		add(b1);
		add(l4);
		add(t4);
	}

	private class MyEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (cb.isSelected()) {
				float a, b, c;
				a = Float.parseFloat(t1.getText());
				b = Float.parseFloat(t2.getText());
				c = Float.parseFloat(t3.getText());

				if (a >= b && a >= c)
					t4.setText(String.valueOf(a));
				else if (b >= a && b >= c)
					t4.setText(String.valueOf(b));
				else
					t4.setText(String.valueOf(c));
			}
		}
	}
	// private class MyEventListener implements MouseListener {
	// public void mouseClicked(MouseEvent me) {
	// if (cb.isSelected()) {
	// float a, b, c;
	// a = Float.parseFloat(t1.getText());
	// b = Float.parseFloat(t2.getText());
	// c = Float.parseFloat(t3.getText());

	// if(a>=b && a>=c)
	// t4.setText(String.valueOf(a));
	// else if(b>=a && b>=c)
	// t4.setText(String.valueOf(b));
	// else
	// t4.setText(String.valueOf(c));

	// }
	// }

}
