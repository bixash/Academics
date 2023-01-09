// 4. Use adapter class to handle events in question number 2.
package adapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adapter {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(800, 200);
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
        l2 = new JLabel("Time/yrs:");
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

    private class MyEventListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            float p, t, r, i;
            p = Float.parseFloat(t1.getText());
            t = Float.parseFloat(t2.getText());
            r = Float.parseFloat(t3.getText());
            i = p * t * r / 100;
            t4.setText(String.valueOf(i));
        }

        
    }
}

