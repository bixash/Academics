import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class oddgui {
    public static void main(String[] args) {
        EventQueue.invokeLater(()-> {

            JFrame f = new JFrame("Odd or Even");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(400,200);
            SimplePanel p = new SimplePanel();
            f.add(p);
            f.setVisible(true);
        });
    }
}


class SimplePanel extends JPanel {
    private JButton b1;
    private JLabel l1, l2;
    private JTextField t1;

    public SimplePanel() {
        b1 = new JButton("Check");
        l1 = new JLabel("Enter a number:");
        l2 = new JLabel("");
        t1 = new JTextField(8);

        MyEventListener me = new MyEventListener();
        b1.addActionListener(me);

        add(l1);
        add(t1);
        add(b1);
        add(l2);


    }

    private class MyEventListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            int x = Integer.parseInt(t1.getText());
            
            if (x %2 == 0) {
                l2.setText("The number is even!");
            } else {
                l2.setText("The number is odd!");
            }
        }
    }
}