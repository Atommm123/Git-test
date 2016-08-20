package ffoorr;

import java.util.Scanner;

public class vottak {
static Scanner x;
static int b;
static String a;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mmMm();
		nnNn();
	}
   public static void nnNn(){
	
	System.out.printf("ajdhfba %s \n", a  );
	System.out.printf("%d", b);
	System.out.printf( a, b);
   }
   
   public static void mmMm(){
	
	x = new Scanner(System.in);
	a = x.next();
	b = (int)Double.parseDouble(x.next());
   }
}
