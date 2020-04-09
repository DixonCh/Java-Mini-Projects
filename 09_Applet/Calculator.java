import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Applet implements ActionListener {
	Label fno, sno, result, showres;
	TextField fNo, sNo;
	Panel f, s, r, b;
	Button plus, minus, mul, div, exit;

	public void init() {
		setLayout(new GridLayout(6, 2, 5, 5));

		fno = new Label("First no: ");
		sno = new Label("Second no:");
		result = new Label("Result: ");
		showres = new Label("...");

		fNo = new TextField(8);
		sNo = new TextField(8);

		f = new Panel();
		s = new Panel();
		r = new Panel();
		b = new Panel();

		plus = new Button("+");
		minus = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		exit = new Button("Exit");

		add(f);
		add(s);
		add(r);
		add(b);
		f.add(fno);
		f.add(fNo);
		fNo.setSize(100, 20);
		s.add(sno);
		s.add(sNo);
		r.add(result);
		r.add(showres);
		b.add(plus);
		b.add(minus);
		b.add(mul);
		b.add(div);
		add(exit);

		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double i = Integer.parseInt(fNo.getText());
				double j = Integer.parseInt(sNo.getText());
				showres.setText(Double.toString(i + j));

			}
		});

		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Integer.parseInt(fNo.getText());
				double y = Integer.parseInt(sNo.getText());
				showres.setText(Double.toString(x - y));

			}
		});
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Integer.parseInt(fNo.getText());
				double y = Integer.parseInt(sNo.getText());
				showres.setText(Double.toString(x * y));

			}
		});
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Integer.parseInt(fNo.getText());
				double y = Integer.parseInt(sNo.getText());
				showres.setText(Double.toString(x / y));

			}
		});

		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		System.exit(0);
	}
}
