package Applet;

import java.applet.*;
import java.awt.*;

public class Triangle  extends Applet {
	public void init() {
		this.setSize(500,500);
	}
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawLine(10, 100, 100, 100);
		g.drawLine(55, 10, 100, 100);
		g.drawLine(10, 100, 55, 10);
		
		Font f=new Font("Arial",Font.BOLD,25);
		g.setFont(f);
		g.setColor(Color.magenta);
		g.drawString("This is Triangle Example", 10, 150);
		g.drawRect(100, 50, 75, 50);
		g.fillRect(200, 50, 75, 50);
		//g.fillRect(x, y, width, height);
	}
}
