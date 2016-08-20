package rus.max.cons;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 1;
		
		switch (a) {
		
		case 1:    //Условия "а" ровно ли (в данном случае)  1 или нет.
			System.out.println("1");
			break;           //Прерырвает блок свитч
			//return;        Если написать вместо break, то прервется все метод, т.е. в даненом случае метод main и Hello Не напишется.   
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			// no break;     Если не написать break, то в блоке свитч продолжится выполнятся далнейшие условия независимо соответсвуют ли они условию или нет. 
		default: 
			System.out.println("Nothing");
				
		
		}
		
		System.out.println("Hello");
		

	}

}
