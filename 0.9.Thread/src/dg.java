
import java.util.Random;


public class dg extends Thread {     // ����� ����� ������������.
	 
	 public int time;
	 public String name;
	 Random r = new Random();
	 
	 public dg(String name){       // ��������� ��� ���� ��� ��������� �������� �� ����� � ������� ������. ��� ��� ���� ���������� ������� �� ����� ���������� ������� ������������ � �����������, �� �� ����������.
		 this.name = name;
		 time = r.nextInt(999);
		 runny();
	 }                             //����������� ������������������� ������, ������� ���� ������������, ������ ����� ���������� ������� ������ � ��� �����, �.�. � ����� ����� �������� ��� ��������������� � ���������� ���� ���������������!  
	 

	
	    public void runny() {
		System.out.printf("Potok %s Spit %d\n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("Potok %s prosHuls9 u Bce\n", name);
		
	}

}