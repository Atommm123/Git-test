package rus.max.synchron;

import java.util.ArrayList;
import java.util.Random;

public class Worker {

	private  ArrayList<Integer> List1 = new ArrayList<Integer>();
	private  ArrayList<Integer> List2 = new ArrayList<Integer>();
	private  Object lock1 = new Object();    //Чтоб привязать созданый объект к методу
	private  Object lock2 = new Object();
	private  Random random = new Random();
	
	private   void partOne(){
		  synchronized(lock1){     //Таким образом с помощью синхронайзед(lock) создаем привязку метода к объекту чтоб создать именно к методу очередь! и тогда не будут путаться потоки.
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			List1.add(random.nextInt(100));
		  }
		
	}
	
	private   void partTwo(){
		synchronized(lock2){
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			List2.add(random.nextInt(100));
		}
		
	}
	
	
	private void proceed(){
		for(int i=0;i<1000;i++){
			partOne();
			partTwo();
			
			
		}
	}
	
	public void start(){
		System.out.println("the Beginning");
		long startTime = System.currentTimeMillis();   //currenttimemillis по сути считатет текущее время!
	    
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				proceed();
			}
			
		});   //Просто заостряю внимания грамматике синтаксиса на этом моменте с раннебл по поводу });
	
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				proceed();
			}
			
		});   //Просто заостряю внимания грамматике синтаксиса на этом моменте с раннебл по поводу });
		
		t1.start();
		t2.start();
		
		try {
			t1.join();    //Джоин чтоб поток успел вообще выплниться  перед тем как вывести на экран так работает раннебл и ран.
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("GoneTime: "+(endTime-startTime)+"\n"
				+ "List1: "+List1.size()+"\n"
						+ "List2: "+List2.size());
	}
	
	

}
