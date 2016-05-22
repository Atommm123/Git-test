import javax.swing.JFrame;


public class Дик {
	public static void main(String args[]){
		Ридер r = new Ридер("Tab");
		
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(190,250);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}
