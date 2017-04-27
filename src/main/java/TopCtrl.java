import java.awt.event.*;

public class TopCtrl extends App{
	TopView view;


	public TopCtrl () {
		this.view = new TopView();

		init(view);

		test();
	}

	public void init (TopView view) {
		view.add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test("add");
			}
		});


		view.show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test("show");
			}
		});


		view.find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test("find");
			}
		});
	}
}