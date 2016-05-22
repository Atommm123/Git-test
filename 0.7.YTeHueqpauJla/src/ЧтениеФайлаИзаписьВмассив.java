import java.util.Scanner;         //Для использования метода Сканнер!!!
import java.io.File;             // В методе openFile с помощью метда ссылка создали некий не совсем определенный  объект и он бы не определялся, что это такое вообще, если бы не этот импорт с помощью, которого происходит инициализация типа оъекта new File  в методе openFile!!!

import javax.swing.JOptionPane;

public class ЧтениеФайлаИзаписьВмассив {
	static String[][] m = new String[5][3];
	static Scanner scn;           // Этот метод импортируется из java.until.Scanner. И так как используем потом этот метод с другом методе, то тоже статик!!!
	
	public static void main(String args[]){
		openFile();               //Метод в методе должен быть статичным поэтому далее все Статик!!!
		readFile();
		
		out();
	}
	
	

	private static void out() {
		 
		
			for(int row = 0; row<m.length;row++){                     //Можно прописать csn.hasNext вместо row<m.length  и будет считать от этого
				for(int col = 0;col<m[row].length;col++){
					System.out.print(m[row][col] + "  ");
					                                                  //Гдавно не забывть scn.next(); , а то будет вечный цикл или oшибка
					}
				System.out.println();
					
			
			
						
				
		}
		
	 }		
	

	private static void readFile() {
		while(scn.hasNext()){        //Цикл вайл действует по принципу пока НЕ наступило обратное!!! А метод hasNext будет считывать файл до тех пор пока он не закончиться, а когда он закончиться этот метод прекратит цикл!!!
			for(int row = 0; row<m.length;row++){                      //Можно прописать csn.hasNext вместо row<m.length  и будет считать от этого
				for(int col = 0;col<m[row].length;col++){              //Как вычислить заранее сколько столбцов пока не знаю
					m[row][col] = scn.next();                          //scn.nex() переход к следующему аргументу в файле. 
				}
			}
		}
		
		
	}

	private static void openFile() {                  //Метод в методе должен быть статичным!!!
		try{
		scn = new Scanner(new File("res//1.txt"));
		}catch(Exception e){JOptionPane.showMessageDialog(null, "Где файл блять?");}
	}

}
