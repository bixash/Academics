package example;

// 3. Write a GUI application that receives three numeric values as input and then displays
// the largest of the three numbers. Use text fields for input and output. The result
// should be displayed when a button is pressed and a checkbook is checked.


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Checkbox {
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

	public SimplePanel() {
		t1 = new JTextField(8);
		t2 = new JTextField(8);
		t3 = new JTextField(8);
		t4 = new JTextField(8);
		l1 = new JLabel("Principle:");
		l2 = new JLabel("Time:");
		l3 = new JLabel("Rate:");
		l4 = new JLabel("Interest:");
		cb = new JCheckBox("Check here");
		MyEventListener me = new MyEventListener();
		addMouseListener(me);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(cb);
	}

	private class MyEventListener implements MouseListener {
		public void mouseClicked(MouseEvent me) {
			if (cb.isSelected()) {
				float p, n, r, i;
				p = Float.parseFloat(t1.getText());
				n = Float.parseFloat(t2.getText());
				r = Float.parseFloat(t3.getText());
				i = p * n * r / 100;
				t4.setText(String.valueOf(i));
			}
		}

		public void mousePressed(MouseEvent me) {
		}

		public void mouseReleased(MouseEvent me) {
		}

		public void mouseEntered(MouseEvent me) {
		}

		public void mouseExited(MouseEvent me) {
		}
	}
}
