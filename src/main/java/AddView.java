import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;

public class AddView extends JPanel {
		Label l1;
		TextField t1;
		Label l2;
		TextField t2;
		Button add;

	public AddView () {
		this.setBounds(0,50,800,550);
		this.setBackground(Color.blue);

		init();
	}

	public void init () {

	    l1 = new Label("Name :");  
	    l1.setBounds(50,50,100,30);
	    t1 = new TextField("");  
	    t1.setBounds(100,100,200,30);

	    l2 = new Label("Num :");  
	    l2.setBounds(200,200,100,30);
	    t2 = new TextField("");  
	    t2.setBounds(300,300,200,30);

		add = new Button("Add");
		add.setBounds(400,400,200,30);

		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(add);

		this.setLayout(null);
	}
}