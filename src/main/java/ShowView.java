import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;
import javax.swing.JTextArea;

public class ShowView extends JPanel {
	JTextArea l1;
	Button load;

	public ShowView () {
		this.setBounds(0,50,800,550);
		this.setBackground(Color.pink);

		init();
	}

	public void init () {
		l1 = new JTextArea("Name        |        Num");
		l1.setSize(600, 500);

		load = new Button("load");
		load.setSize(60,30);

		this.add(l1);
		this.add(load);
	}
}