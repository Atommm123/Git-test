import java.util.Random;


public class Pussy implements Runnable  {     // Имплементс чтоб Фрид получила доступ к классу Пусси, работает вместе с методо Run.
	 
	 public int time;
	 public String name;
	 Random r = new Random();
	 
	 public Pussy(String name){       // Одинкавое имя найм для удосбства выводить на экран с помощью принтф. Так как если попытаться вывести на экран стринговый элемент доставляемый в конструктор, то не получиться.
		 this.name = name;
		 time = r.nextInt(999);
	 }

	@Override
	public void run() {                                               // Потоки попадают последовательно,но  выводяться кто быстрее.
		System.out.printf("Potok %s Spit %d\n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("Potok %s prosHuls9 u Bce\n", name);
		
	}

}
