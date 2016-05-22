package rus.jj.networking;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


	public class  Main extends JFrame implements Runnable{
		static private Socket connection;    //Сокет-это класс, который обеспечивает необходимый функцтонал для соединения двух компьютеров и передачу между ними данных
		static private ObjectOutputStream output;   //Ксасс обджектаутпут создает поток на выход
		static private ObjectInputStream input; //Класс обджектштпут принимает поток данных 
		
		public static void main(String[] args){
			new Thread(new Main("Test")).start();
			new Thread(new Server()).start();
	}
		public Main(String name){
			super(name);
			setLayout(new FlowLayout());
			setSize(300,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setLocationRelativeTo(null);
			
			final JTextField t1 = new JTextField(10);   //Файнел значит что переменная инициализируется только одни раз.
			final JButton b1 = new JButton("send");
			b1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					if(arg0.getSource()==b1){
						sendData(t1.getText());
					}
					
				}
				
			});
			add(t1);
			add(b1);
		}
		
		
		public void run(){
			
				try {
					
					while(true){
						connection = new Socket(InetAddress.getByName("127.0.0.1"), 5678);   //конекшен  поместили в вайл тоже потому что нужно постоянно переопределять так как работает со статическим классом, если бы был динамический переопределять каждый раз не надо было бы
						output = new ObjectOutputStream(connection.getOutputStream());
						input = new ObjectInputStream(connection.getInputStream());
						
						
						JOptionPane.showMessageDialog(null, (String) input.readObject());
						
						
					}
				} catch (UnknownHostException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				} catch (HeadlessException e) {
					
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				}
			
			
		}
		
		private static void sendData(Object obj){        //Object obj - класс типа объект, который приниммет практически  любой объект 
		     try {
				output.flush();                          //Flush нужен чтобы не смешивались пакеты передовыемых данных
			    output.writeObject(obj);                 //С помощь. метода writeObject будем записывать в аутпут данные в него
		     } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}     
		}

}
