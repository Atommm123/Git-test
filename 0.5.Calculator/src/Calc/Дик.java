package Calc;

import javax.swing.JFrame;

public class Дик {
	public static void main(String args[]){
		Ридер r = new Ридер("Tab");
		
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300,250);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		r.t1.setEditable(false);
		r.t1.setText("0");
	}
}
 

