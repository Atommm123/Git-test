package rus.max.block;

import java.util.ArrayList;

public class Mainn {
	private static ArrayList<Object> List = new ArrayList<Object>();
	static Object obj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addObject();
		proceed();
		prinLn();

	}
	
	private static void proceed() {
		System.out.println(List.size());
		
		
		
		
		while(List.size()!=0){
			Object obj = 3;
		for(Object element: List){          //���� � �������� ����������� ��������� ��������� ���������� ��������� � ����������
			obj = element;                  //�� ���� ��� �����������, �� ����� ������, ��� ��� ����� �� �����������
			break;                          //�� ���� �������� ���� � ������� ������� ��� �������� ���, � ����� �����
		}                                   //������ ����, ��� ��� ��������! ��������� �� ����������� ������ � �������� �����.
		
		List.remove(obj);
		
		
	}
		System.out.println(obj);
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
