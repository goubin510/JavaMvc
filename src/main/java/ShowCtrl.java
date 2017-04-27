import java.awt.event.*;

public class ShowCtrl extends App{
	ShowView view;


	public ShowCtrl () {
		this.view = new ShowView();
		init(view);
	}

	public void init (ShowView view) {
		view.load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.l1.setText(display());
			}
		});

	}
}