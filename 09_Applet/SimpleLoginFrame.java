package Applet;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class SimpleLoginFrame extends Frame {
	public static void main(String[] args) {

		SimpleLoginFrame frm = new SimpleLoginFrame();
		Label lblPw = new Label("Password : ");
		Label lblname = new Label("User name : ");

		TextField txtUname = new TextField();
		txtUname.setColumns(20);

		TextField txtPw = new TextField();
		txtPw.setColumns(20);
		txtPw.setEchoChar('*');
		// txtPw.setBounds(100, 200, 10, 50);
		// setLayout(null);

		Button btnLogin = new Button("Login");

		frm.add(lblname);
		frm.add(txtUname);
		frm.add(lblPw);
		frm.add(txtPw);
		frm.add(btnLogin);
		frm.setSize(300, 400);
		frm.setLayout(new FlowLayout());
		
		frm.setVisible(true);

	}
}
