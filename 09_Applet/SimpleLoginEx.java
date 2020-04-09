package Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

public class SimpleLoginEx extends Applet {
	public void init() {
		Label lblPw = new Label("Password : ");
		Label lblname=new Label("User name : ");
		
		TextField txtUname=new TextField();
		txtUname.setColumns(20);
		
		
		TextField txtPw=new TextField();
		txtPw.setColumns(20);
		txtPw.setEchoChar('*');
	//	txtPw.setBounds(100, 200, 10, 50);
	//	setLayout(null);
		
		Button btnLogin =new Button("Login");
		
		add(lblname);
		add(txtUname);
		add(lblPw);
		add(txtPw);
		add(btnLogin);
		

	}
}
