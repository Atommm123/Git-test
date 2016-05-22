package ьмсьп;



public class Дик1 {
	public static void main(String args[]){
		Ридер1 r = new Ридер1();
		r.Scann();
		r.y = count(r.y);
		r.d = count(r.d);
		r.Scan(r.y, r.d);
		
		
	}
	
	private static int count(int x){
		x = x + 1;
		return x;
	}

}



