package rus.atom.synchroniz;

public class Main {
	private static int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Worker());
		Thread t2 = new Thread(new Worker());
		
		t1.start();
		t2.start();
		
		try{
		t1.join();  //join ����� ��� ���� ����� ����� ��� ��� ������� �� �����, ��� ���������� �� �������, �������� ������ ������ ����������! ��� �� ����� sleep, �� �����! ���� ����� join ���� � ������ Thread!!! 
		t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(number); 

	}
    
	public static synchronized void Uveli4eHue(){   //Synchronized ������� ������ ��� ��������� ������ � ��� ����� ������� �������, �.�. ���� ���� ���������� �� �����-�� �������� �������� ���������� �����-�� ��������, �� ������ ������� �� ���������� � �������� ��� �������!!! �.�. ��� ��� ���������� ������� �������� � �������� �� ��� ������ � ����� ��������� �� ������� ��������� � ��������.
		number++;
	}
	
}
