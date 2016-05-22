import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class –идер extends JFrame {
	
	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	int i, k;
	String a, b;
	
	vod lop = new vod();
	
	public –идер(String s){                      //≈сли метод называетьс€ так же, как класс, то этот метод называетьс€ конструктор и может
		super(s);                                //принимать некий аргумент. 
		
		setLayout(new FlowLayout());
		
		b1 = new JButton("ddggdf");
		b2 = new JButton("Poc4");
		l1 = new JLabel("Vved fer");
		l2 = new JLabel("Vved vt");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		
		add(t1);
		add(l2);
		add(t2);
		add(l1);
		add(l3);
		add(l4);
		add(b2);
		add(b1);
		b2.addActionListener(lop);
		b1.addActionListener(lop);
		
	
	}
	
	public class vod implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
			  if(e.getSource()==b2){
				i = Integer.parseInt(t1.getText());
				k = Integer.parseInt(t2.getText());
				i++;
				k++;
				a = "perv" +i;
				b = "vtor" +k;
				l3.setText(a);
				l4.setText(b);
			}
			
			if(e.getSource()==b1){
				t1.setText(null);
				t2.setText(null);
				l3.setText("");
				l4.setText("");
			} 
		
		}catch (Exception exx) { JOptionPane.showMessageDialog(null,"4ucJLo BJL9Tb");}
		
	}

  }
}