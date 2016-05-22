package МассивЦикл;//двумерный массив.

public class МассивЦиклы3 {
	public static void main(String args[]){
		int[][] m = {{1,4,3,4,3},{8,9,1,2},{2,5,4,5}};
		 
		for(int row=0;row<m.length;row++){    //m.lengh - eto ckol'ko p9dov v maccuBe
			for(int col=0;col<m[row].length;col++){    //m[row].length - eto ckol'ko cTolbL|ov v etom r9de.
				System.out.print(m[row][col] + "  ");
				
					
				}
			if ( row!=0){
				for(int col=2;col<4;col++){
					System.out.print(m[row][col] + "  ");
			}
			
				
			}
			 
			System.out.print(m.length + " ");
			System.out.println(m[row].length);
		
			
			}
		}
}


