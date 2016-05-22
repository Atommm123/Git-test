package МассивЦикл;

import java.util.ArrayList;
import java.util.Random;



public class МассивЦикл4 {
	private static String[] mobiles = new String[3];
	private static Random r = new Random();

	public static void main(String[] args) {
		
		mobiles[0] = new String("zdfgd");
		mobiles[1] = new String("zdfdfg");
		mobiles[2] = new String("zdfasdf");
		
		
		for(String m: mobiles){     //Таким образом можно тоже пролистывать арайлист или одномерный массив
			System.out.println(m);
		}

	}


	}


