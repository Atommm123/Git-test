package rus.max.cons;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 1;
		
		switch (a) {
		
		case 1:    //������� "�" ����� �� (� ������ ������)  1 ��� ���.
			System.out.println("1");
			break;           //���������� ���� �����
			//return;        ���� �������� ������ break, �� ��������� ��� �����, �.�. � ������� ������ ����� main � Hello �� ���������.   
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			// no break;     ���� �� �������� break, �� � ����� ����� ����������� ���������� ��������� ������� ���������� ������������ �� ��� ������� ��� ���. 
		default: 
			System.out.println("Nothing");
				
		
		}
		
		System.out.println("Hello");
		

	}

}
