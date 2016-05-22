
import java.util.Random;


public class dg extends Thread {     // Можно через наследование.
	 
	 public int time;
	 public String name;
	 Random r = new Random();
	 
	 public dg(String name){       // Одинкавое имя найм для удосбства выводить на экран с помощью принтф. Так как если попытаться вывести на экран стринговый элемент доставляемый в конструктор, то не получиться.
		 this.name = name;
		 time = r.nextInt(999);
		 runny();
	 }                             //Отличаеться последовательностью потока, сначала один выполняеться, только после выполнения первого второй и так далее, т.е. в метод ранни побадает все последовательно и выводиться тоже последовательно!  
	 

	
	    public void runny() {
		System.out.printf("Potok %s Spit %d\n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("Potok %s prosHuls9 u Bce\n", name);
		
	}

}