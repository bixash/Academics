
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class UserRegistration extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            UserRegistration frame = new UserRegistration();
            frame.setVisible(true);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(800, 400);

          
            f.setVisible(true);
        
        });
    }

    /**
     * Create the frame.
     */

    public UserRegistration() {
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New User Register");
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name");
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        
        contentPane.add(mob);
        mob.setColumns(10);

        

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
               

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "root");

                    String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        "','" + emailId + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        
        contentPane.add(btnNewButton);
    }
}

