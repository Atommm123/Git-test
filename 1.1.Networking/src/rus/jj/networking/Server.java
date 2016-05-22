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
	static private ServerSocket server;    //����������� ��������� ����������!
	static private Socket connection;    //�����-��� �����, ������� ������������ ����������� ���������� ��� ���������� ���� ����������� � �������� ����� ���� ������
	static private ObjectOutputStream output;   //����� ������������� ������� ����� �� �����
	static private ObjectInputStream input; //����� ������������ ��������� ����� ������ 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			server = new ServerSocket(5678, 10);  //���������� ����� �����, ������� ����� ����������� ����� �������
			while(true){
				connection = server.accept();  //��������� ���������� � ���������� ��������� ���������� � ���������.
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				output.writeObject("�� ��������:  " +(String)input.readObject());
				
				
				
				
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
