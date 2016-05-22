package rus.zti;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	private static Random r = new Random();

	public static void main(String[] args) {
		for(int i =0;i<10;i++){
			mobiles.add(new Mobile(r.nextInt(9999), "fghff"));
		}
		
		for(Mobile m: mobiles){     //“аким образом можно тоже пролистывать арайлист или одномерный массив
			System.out.println(m.getNumber()+" "+m.getName());
		}

	}

}
