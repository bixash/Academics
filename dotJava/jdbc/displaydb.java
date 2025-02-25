// 1. Assuming your own database and tables write a program using JDBC to enter and
// display data from the database. Use GUI form to enter and display data.


// this is for inserting only
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
// import java.awt.event.*;
import java.sql.*;

public class displaydb { 
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame f = new JFrame("Signup Form");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(800, 400);
            // GuiPanel p = new GuiPanel(name, username, password);
            // f.add(p);
            f.setVisible(true);
        });
    }     
    
}

class guiPanel extends JPanel {
	// private final JLabel txtName, txtEmail, txtPassword; 
	// private final JLabel lblName, lblEmail, lblPassword; //lblSignup;

	public guiPanel(String name, String username, String password) {
        
        // txtId = new Jlabel(id);
		// txtName = new JLabel(name);
	    // txtEmail = new JLabel(username);
		// txtPassword = new JLabel(password);

		// lblName = new JLabel("Name:");
		// lblEmail = new JLabel("Email:");
		// lblPassword = new JLabel("Password");
		
		// addMouseListener(me);
		setLayout(new FlowLayout(FlowLayout.CENTER));
        // add(lblSignup);

		// add(lblName);
		// add(txtName);

		// add(lblEmail);
		// add(txtEmail);

		// add(lblPassword);
		// add(txtPassword);
        String url = "jdbc:mysql://localhost:3306/login";
        String user = "root";
        String pass = "";
        try {
            
            // Class.forName("com.mysql.jdbc.Driver");       // kind of deprecated
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String sqlStmt = "SELECT * from users";
            stmt.executeUpdate(sqlStmt);
            // ResultSet rs = stmt.executeQuery(sqlStmt); 
            // String name, username, password;
            // int id;
            // while(rs.next()) {
            //     id = rs.getInt(1);
            //     name = rs.getString(2);
            //     username = rs.getString(3);
            //     password = rs.getString(4);

            // }
            ResultSet rs = stmt.executeQuery(sqlStmt);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Name");
            model.addColumn("Username");
            model.addColumn("Password");
            while (rs.next()) {
                Object[] row = new Object[3];
                row[1] = rs.getString("name");
                row[2] = rs.getString("username");
                row[3] = rs.getString("password");
                model.addRow(row);
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }

		
    }
}

 