import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class insertdb {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame f = new JFrame("Signup Form");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(800, 400);
			GuiPanel p = new GuiPanel();
			f.add(p);
			f.setVisible(true);
		});
	}
}

class GuiPanel extends JPanel {
	private final JTextField txtName, txtEmail, txtPassword;
	private final JLabel lblName, lblEmail, lblPassword; //lblSignup;
	private final JCheckBox checkBox;
	private final JButton btnRegister;

	public GuiPanel() {
		txtName = new JTextField(8);
	    txtEmail = new JTextField(8);
		txtPassword = new JTextField(8);

		lblName = new JLabel("Name:");
		lblEmail = new JLabel("Email:");
		lblPassword = new JLabel("Password");
		// lblSignup = new JLabel("Signup Form");

		btnRegister = new JButton("Register");
		checkBox = new JCheckBox("I agree all terms and conditions!");

		GuiEventListener me = new GuiEventListener();
		btnRegister.addActionListener(me);
		// addMouseListener(me);
		setLayout(new FlowLayout(FlowLayout.CENTER));
        // add(lblSignup);

		add(lblName);
		add(txtName);

		add(lblEmail);
		add(txtEmail);

		add(lblPassword);
		add(txtPassword);

		add(checkBox);
		add(btnRegister);
		
		
	}

	private class GuiEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (checkBox.isSelected()) {
                
                String url = "jdbc:mysql://localhost:3306/login";
                String user = "root";
                String pass = "";
                String name = txtName.getText();
                String username = txtEmail.getText();
                String password = txtPassword.getText();
              
                try {
                    Connection conn = DriverManager.getConnection(url, user, pass);
                    Statement stmt = conn.createStatement();
                    String query = "INSERT INTO users(name, username, password) values('" + name + "','" + username + "','" + password+"')";

                    // stmt.executeUpdate(query);
                    int x = stmt.executeUpdate(query);

                    if(x ==1)
                        System.out.println("Inserted Successfull!");
                    else
                        System.out.println("Insertion Failed!");
                    
                    stmt.close();
                    conn.close();

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            
		}
	}
}