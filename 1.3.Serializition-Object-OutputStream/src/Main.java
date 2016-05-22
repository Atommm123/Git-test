import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;                   //Сериализация - это сохранение объекта класса, как массив байт на жетком диске.

import javax.swing.JOptionPane;


public class Main {
	private static ArrayList<Profile> profiles = new ArrayList<Profile>();

	@SuppressWarnings("unchecked")  //фиг знает для чего. Но переводиться подавить передупреждения не проверенные.
	public static void main(String[] args) {
		profiles =  (ArrayList<Profile>) deserData("profiles");                            //Метод считывает инфу с файла и записывает кк в аррайлист. Аррайлист написан перед десерДата, чтоб перевести из вида обджеккт обратно информацию в массив байт
		System.out.println(profiles.size());    //Показывает сколько записей записанно в программу до написания нового
		Profile profile = new Profile();
		profile.setName(JOptionPane.showInputDialog(null, "Vvedite um9"));
		profile.setSurname(JOptionPane.showInputDialog(null, "Vvedite famili|-o"));
		profiles.add(profile);
		for(Profile p: profiles){
			System.out.println(p.getName()+" "+p.getSurname());
		}
		System.out.println(profiles.size());      //Показывает сколько записей записанно в программу после написания нового
        serData("profiles",profiles);                                //метод записывает данные в файл         
	}

	private static void serData(String file_name, Object obj) {   //Обджекс, вроде как, принимает все объекты
      try {
			
			FileOutputStream fileOut = new FileOutputStream(file_name+".ser");   //ser(разрешение) это  ариавиатура типа сериализуемый, но можно передовать хоть что, цифры буквы это неважно, Файлаутпуттрим выводит данные в документ в данном случае
		    ObjectOutputStream out = new ObjectOutputStream(fileOut);           //будет записывать все массивы данных в байт в файлаут, файлаут в Файлаутпутстрим будет уже выводить это все в файлнейм, т.е. в документ.
			out.writeObject(obj);                       //Записываем в аут то что придет в скобках от serData(т.е. от сюда) 
			fileOut.close();
			out.close();
			   
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no file");
			System.exit(1);                                          //чтобы не было не правильно сериализации\путаницы надо закрывать при нахождении ошибки! Номер в скобках это для опеределения номера ошибки.
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error entry/out");
			System.exit(2);
			} 
		
	}

	private static Object deserData(String file_name) {     
		 
		Object retObject = null;  //retObject нужен чтоб записать туда то что запишем  из файла и вернем в desData, а тот в свою очередь запишет в аррайлист все это
		
		try {
			
			FileInputStream fileIn = new FileInputStream(file_name+".ser");   //Считываем то что в файле и записываем  вфайлин в виде массива байт
		    ObjectInputStream In = new ObjectInputStream(fileIn);          //преобразует массив байт из файлин в обджект и записывает в Ин 
			
			retObject = In.readObject();  //складываем в ретОбджект ин 
			
			                       
			fileIn.close();
			In.close();
			   
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no file");
			System.exit(1);                                       
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error entry/out");
			System.exit(2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Class's not found");
				System.exit(3);
			} 
            
		    return retObject;  //возвращаем ретОбджект этой функции.
}
}