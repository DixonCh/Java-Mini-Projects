//STEP 1. Import required packages
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JavaMysql extends JFrame {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/EMP";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";
	
	JLabel firstname;
	JLabel secondname;
	JLabel output;
	JTextField txtfirstno;
	JTextField txtsecondno;
	JTextField txtoutput;
	JButton ok;
	JButton cancel;

	JavaMysql() {
		firstname = new JLabel("First Name: ");
		secondname = new JLabel("Last Name: ");
		output = new JLabel("OUTPUT:");
		txtfirstno = new JTextField("");
		txtsecondno = new JTextField("");
		txtoutput = new JTextField("");
		ok = new JButton("OK");
		cancel = new JButton("CANCEL");

		setLayout(new GridLayout(4, 2));

		add(firstname);
		add(txtfirstno);
		add(secondname);
		add(txtsecondno);
		add(output);
		add(txtoutput);
		add(ok);
		add(cancel);
	}	

	public static void main(String[] args) {
		JavaMysql frm = new JavaMysql();
		frm.setSize(400, 400);
		frm.setVisible(true);
		
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, first, last, age FROM Employees";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");
	}// end main
}// end JavaMysql
