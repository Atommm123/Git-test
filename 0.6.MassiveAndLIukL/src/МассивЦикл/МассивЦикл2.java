package МассивЦикл; //одномерный массив.

public class МассивЦикл2 {
	public static void main(String args[]){
		int[] m = new int[5];
		 
		for(int x=0;x!=5;x=x+1){
			m[x] = x +(x-3*x) ;
			
			System.out.println(m[x]);
			
			}
		}
	}



