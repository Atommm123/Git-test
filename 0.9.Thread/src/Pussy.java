import java.util.Random;


public class Pussy implements Runnable  {     // ���������� ���� ���� �������� ������ � ������ �����, �������� ������ � ������ Run.
	 
	 public int time;
	 public String name;
	 Random r = new Random();
	 
	 public Pussy(String name){       // ��������� ��� ���� ��� ��������� �������� �� ����� � ������� ������. ��� ��� ���� ���������� ������� �� ����� ���������� ������� ������������ � �����������, �� �� ����������.
		 this.name = name;
		 time = r.nextInt(999);
	 }

	@Override
	public void run() {                                               // ������ �������� ���������������,��  ���������� ��� �������.
		System.out.printf("Potok %s Spit %d\n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("Potok %s prosHuls9 u Bce\n", name);
		
	}

}
