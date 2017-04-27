import java.awt.event.*;

public class FindCtrl extends App{
	FindView view;


	public FindCtrl () {
		this.view = new FindView();
		init(view);
	}

	public void init (FindView view) {
		view.search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test("find");
			}
		});
	}
}