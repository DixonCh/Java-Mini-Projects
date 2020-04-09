import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySwing extends JFrame implements ActionListener {
	JLabel firstname;
	JLabel secondname;
	JLabel out;
	JTextField txtfirstno;
	JTextField txtsecondno;
	JTextField txtout;
	JButton ok;
	JButton cancel;

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		MySwing frm = new MySwing();
		frm.setSize(400, 400);
		frm.setVisible(true);

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:PECODBC", "", "");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from tbLogin");
			while (rs.next()) {
				String UserName = rs.getString("Username");
				String Password = rs.getString("Password");
				System.out.println(UserName + " " + Password);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Well done!!");
		}

	}

	MySwing() {
		firstname = new JLabel("First Name: ");
		secondname = new JLabel("Last Name: ");
		out = new JLabel("OUT:");
		txtfirstno = new JTextField("");
		txtsecondno = new JTextField("");
		txtout = new JTextField("");
		ok = new JButton("OK");
		cancel = new JButton("CANCEL");

		setLayout(new GridLayout(4, 2));

		add(firstname);
		add(txtfirstno);
		add(secondname);
		add(txtsecondno);
		add(out);
		add(txtout);
		add(ok);
		add(cancel);

		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String i = (txtfirstno.getText());
				String j = (txtsecondno.getText());
				txtout.setText(i + "+" + j);

			}
		});
		cancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);

	}

}
