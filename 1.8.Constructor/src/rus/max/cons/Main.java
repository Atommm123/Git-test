package rus.max.cons;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds birds = new Birds("sinii", true);   //в скобках(если создан конструктор), вписываются аргументы для этого конструктора

       	System.out.println(birds.getName());
       	System.out.println(birds.isCanFly());
	
	}
	
}
