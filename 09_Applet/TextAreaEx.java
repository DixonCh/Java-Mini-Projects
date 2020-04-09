package Applet;

import java.applet.Applet;
import java.awt.TextArea;

public class TextAreaEx extends Applet{
	String letter = "The quality of a person's life is \n" +
			"in direct proportion to their commitment to" +
			"excellence.\nregardless of their chosen field of endeavor";	
	TextArea txtDetails;	
	public void init() {
		txtDetails = new TextArea(letter, 10, 45);
		add(txtDetails);
	} }
