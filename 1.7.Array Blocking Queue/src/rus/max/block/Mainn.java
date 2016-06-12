package rus.max.block;

import java.util.ArrayList;

public class Mainn {
	private static ArrayList<Object> List = new ArrayList<Object>();
	static Object obj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addObject();
		proceed();
		prinLn();

	}
	
	private static void proceed() {
		System.out.println(List.size());
		
		
		
		
		while(List.size()!=0){
			Object obj = 3;
		for(Object element: List){          //Если в процессе перебирания элементов множества происходят измениния в количестве
			obj = element;                  //Их вида или содержимого, то будет ошибка, так как такое не допускается
			break;                          //Но если прервать цикл и удалить элемент или изменить его, а потом снова
		}                                   //Начать цикл, тот так прокатит! Изменения не допускаются именно в процессе цикла.
		
		List.remove(obj);
		
		
	}
		System.out.println(obj);
  }
	

	private static void prinLn() {
		
		System.out.println(List.size());
		
	
		
		

	}
	private static void addObject() {
		for (int i = 0; i < 5; i++){
			List.add(new Object());
		}
	}

}
