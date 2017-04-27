

public class App {

    public static void main(String[] args) {

    	// create window
        MainVue mainVue = new MainVue();

        // create the top controler for menu bar
        TopCtrl topCtrl = new TopCtrl();

        // create the top controler for menu bar
        AddCtrl addCtrl = new AddCtrl();

        // create the top controler for menu bar
        ShowCtrl showCtrl = new ShowCtrl();

        // create the top controler for menu bar
        FindCtrl findCtrl = new FindCtrl();

        // add the views to the window
        mainVue.add(topCtrl.view);
        mainVue.add(addCtrl.view);
        mainVue.add(showCtrl.view);
        mainVue.add(findCtrl.view);

        topCtrl.view.setVisible(true);
        addCtrl.view.setVisible(false);
        showCtrl.view.setVisible(true);
        findCtrl.view.setVisible(false);
    }

	public void test() {
		System.out.println("str");
	}

	public void test(String str) {
		System.out.println(str);
	}

	public void test(String str1, String str2) {
		System.out.println(str1 + " -:- " + str2);
	}

	public void addOne(String name, String num) {

		Modele modele = new Modele();

		modele.addData(name, num);

	}

	public String display() {

		Modele modele = new Modele();

		// modele.show();

		return modele.show();

	}
}