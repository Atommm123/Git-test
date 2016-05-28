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
		t1.join();  //join Нужен для того чтобы перед тем как вывести на экран, что получилось по потокам, операция вообще успела выполнится! Что то вроде sleep, но лучше! Этот метод join есть в классе Thread!!! 
		t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(number); 

	}
    
	public static synchronized void Uveli4eHue(){   //Synchronized Создает объект под выполение задачи и что самое главное ОЧЕРЕДЬ, т.е. если даже произойдет по каким-то причинам зажержка выполенеия какго-то процесса, то другой процесс не приступить к действие ВНЕ очереди!!! Т.е. тот что задержался сначала вернется и выполнит то что должен а потом следующий по очереди приступит к действию.
		number++;
	}
	
}
