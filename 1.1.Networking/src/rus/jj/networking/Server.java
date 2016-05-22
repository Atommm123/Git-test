package rus.jj.networking;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Server implements Runnable {
	static private ServerSocket server;    //СерверСокет принимает соединение!
	static private Socket connection;    //Сокет-это класс, который обеспечивает необходимый функцтонал для соединения двух компьютеров и передачу между ними данных
	static private ObjectOutputStream output;   //Ксасс обджектаутпут создает поток на выход
	static private ObjectInputStream input; //Класс обджектштпут принимает поток данных 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			server = new ServerSocket(5678, 10);  //объяснение какой адрес, который хочет подключится нужно принять
			while(true){
				connection = server.accept();  //Принимает соединение и складывает переменую полученную в коннекшен.
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				output.writeObject("Вы прислали:  " +(String)input.readObject());
				
				
				
				
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

}
