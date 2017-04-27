import javax.swing.JPanel;
import java.awt.*;

public class TopView extends JPanel {
	Button add;
	Button show;
	Button find;

	public TopView () {
		this.setBounds(0,0,800,50);
		this.setBackground(Color.gray);

		init();
	}

	public void init () {
		add = new Button("Add");
		add.setSize(60,30);

		show = new Button("show");
		show.setSize(60,30);

		find = new Button("Find");
		find.setSize(60,30);

		this.add(add);
		this.add(show);
		this.add(find);
	}
}