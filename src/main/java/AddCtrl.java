import java.awt.event.*;

public class AddCtrl extends App{
	AddView view;


	public AddCtrl () {
		this.view = new AddView();
		init(view);
	}

	public void init (AddView view) {
		view.add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOne(view.t1.getText(), view.t2.getText());
			}
		});
	}
}