import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;

public class FindView extends JPanel {
	Label l1;
	TextField t1;
	Button search;

	public FindView () {
		this.setBounds(0,50,800,550);
		this.setBackground(Color.green);

		init();
	}

	public void init () {
		l1 = new Label("Search :");  
	    l1.setBounds(200,200,100,30);
	    t1 = new TextField("");  
	    t1.setBounds(300,300,200,30);

		search = new Button("Search");
		search.setBounds(400,400,200,30);

		this.add(l1);
		this.add(t1);
		this.add(search);

		this.setLayout(null);
	}
}