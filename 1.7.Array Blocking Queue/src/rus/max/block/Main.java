package rus.max.block;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	private static ArrayBlockingQueue<Object> List = new ArrayBlockingQueue<Object>(1000);  //������������� �� ����� � ���, �������� � �������� ����� ������������� � �������� ��������� ��������� �� ��������� � ����� �� �����,����� ������������ ����� �� ����� 500��� 600 ���������.
	static Object obj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addObject();
		proceed();
		prinLn();

	}
	
	private static void proceed() {
		System.out.println(List.size());
		
		for(Object element: List){          
			List.remove(element);                  
			                         
		}                                   
		
	}
			
  
	

	private static void prinLn() {
		
		System.out.println(List.size());
		
	}
	
	
	private static void addObject() {
		for (int i = 0; i < 5; i++){
			List.add(new Object());
		}
	}

}
  
	


