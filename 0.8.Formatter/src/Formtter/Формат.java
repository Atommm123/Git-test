package Formtter;

import java.util.Formatter;                          //Ot cuda berem metod(modul') formatt                
                                                      

                                                     //Metod printf - eto metod c cpecifikatorami:
import java.util.Scanner;                            //&s - ctroka; %d - celoe 4uclo; %f - 4bclo c плавающей точкой;\n - nova9 ctroka
                                                     //Cpecifikatori Zamen9uts9 potom argumentami.

public class Формат {
  
	static Formatter x;
    static Scanner scn;
    
    public static void main(String args[]){
    	try{
    		x =  new Formatter("res//2.txt");
    		scn = new Scanner(System.in);
    		System.out.println("Sol' Let");
    		int a = (int)Double.parseDouble(scn.next());    //kostovanue. Разпазнает цифры с точкой, как целое игнорируя то, что после запятой.
    		System.out.println("Kak zovut");
    		String b = scn.next();
    		System.out.println("Xde Jivete");
    		String c = scn.next();
    		x.format("Men9 zovut %s, mne %d  let, 9 jivu %s", b, a, c );
    		x.close();
    	}catch(Exception e){};
    	}
    }


