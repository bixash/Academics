// 2. Write a GUI application to calculate simple interest. Use text fields for inputs and
// output. Use mouseClick method to generate the result.

package simpleInterest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleInterest {
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

	public SimplePanel() {
		t1 = new JTextField(8);
		t2 = new JTextField(8);
		t3 = new JTextField(8);
		t4 = new JTextField(8);
		l1 = new JLabel("Principal:");
		l2 = new JLabel("Time:");
		l3 = new JLabel("Rate:");
		l4 = new JLabel("Interest:");
		MyEventListener me = new MyEventListener();
		addMouseListener(me);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
	}

	private class MyEventListener implements MouseListener {
		public void mouseClicked(MouseEvent me) {
			float p, n, r, i;
			p = Float.parseFloat(t1.getText());
			n = Float.parseFloat(t2.getText());
			r = Float.parseFloat(t3.getText());
			i = p * n * r / 100;
			t4.setText(String.valueOf(i));
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
