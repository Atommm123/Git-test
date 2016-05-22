package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Ридер extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16 ;
    JTextField t1;
    int i, k, p1, m1, ra1, u1, p2, m2, ra2, u2, g;
    String a, b;
    eHandler handler = new eHandler();
   
    public  Ридер(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("+");
        b12 = new JButton("-");
        b13 = new JButton("/");
        b14 = new JButton("*");
        b15 = new JButton("=");
        b16 = new JButton("C");
        b16.setPreferredSize(new Dimension(200, 25));
        t1 = new JTextField(20);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b11);
        add(b12);
        add(b4);
        add(b5);
        add(b6);
        add(b13);
        add(b14);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b15);
        add(b16);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b10.addActionListener(handler);
        b11.addActionListener(handler);
        b12.addActionListener(handler);
        b13.addActionListener(handler);
        b14.addActionListener(handler);
        b15.addActionListener(handler);
        b16.addActionListener(handler);
       
    }
   
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                if(e.getSource()==b1){
                	g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    
                	i = 0;
                    i= i * 11 + 1;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                    
                                   
                }
                
                if(e.getSource()==b2){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10 + 2;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b3){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10 + 3;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b4){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10 + 4;
                    a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b5){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10 + 5;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b6){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10 + 6;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b7){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10 + 7;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b8){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10 + 8;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b9){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10 + 9;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b10){
                    g = Integer.parseInt(t1.getText());
                    if(i != g){String a = Integer.toString(0);  t1.setText(a);}
                    i = Integer.parseInt(t1.getText());
                    i= i * 10;
                    String a = Integer.toString(i);
                    t1.setText(a);                 
                }
                if(e.getSource()==b11){                                     // сложение
                    p1 = Integer.parseInt(t1.getText());
                    t1.setText("0");
                    
                }
                if(e.getSource()==b12){                                     // вычитание
                    m1 = Integer.parseInt(t1.getText());
                    t1.setText("0");
                    i=0;
                }
                if(e.getSource()==b13){                                     //деление                   
                    ra1 = Integer.parseInt(t1.getText());
                    t1.setText("0");
                    i=0;       
                }
                if(e.getSource()==b14){                                     //умножение
                    u1 = Integer.parseInt(t1.getText());
                    t1.setText("0");
                    i=0;
                }
                if(e.getSource()==b15){                                     //равно
                    if(p1 != 0){
                        p2 = Integer.parseInt(t1.getText());
                        k = p1 + p2;
                        String b = Integer.toString(k);
                        t1.setText(b);
                    }
                    if(m1 != 0){
                        m2 = Integer.parseInt(t1.getText());
                        k = m1 - m2;
                        String b = Integer.toString(k);
                        t1.setText(b);
                    }
                    if(ra1 != 0){
                        ra2 = Integer.parseInt(t1.getText());
                        if(ra2 == 0){
                            JOptionPane.showMessageDialog(null, "на ноль делить нельзя");
                        }
                        k = ra1 / ra2;
                        String b = Integer.toString(k);
                        t1.setText(b);
                    }
                    if(u1 != 0){
                        u2 = Integer.parseInt(t1.getText());
                        k = u1 * u2;
                        String b = Integer.toString(k);
                        t1.setText(b);
                    }
                    i = 0;  p1 = 0; p2 = 0;  m1 = 0;    m2 = 0; ra1 = 0; ra2 = 0;   u1 = 0; u2 = 0; g = 0;
                    }
                if(e.getSource()==b16){                                     //обнуление
                    i = 0;  k = 0;  p1 = 0; p2 = 0;  m1 = 0;    m2 = 0; ra1 = 0; ra2 = 0;   u1 = 0; u2 = 0; g = 0;
                    a = "0";    b = "0";
                    t1.setText("0");
                }
               
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "NO");
            }
        }
    }
}