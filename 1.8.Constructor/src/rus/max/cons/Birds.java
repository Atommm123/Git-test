package rus.max.cons;

public class Birds {
   private String name;
   private boolean canFly;
   
   public Birds(String name, boolean canFly){    //����������� ������� �����, ������� ��������� � �� ���������, ���������� ������ ��� �������� �������, �������� ������ ��������� � ��������� ������.
	   this.name = name;
	   this.canFly = canFly;
   }

   
 public boolean isCanFly() {
	return canFly;
}

public String getName() {
	return name;
}

}
