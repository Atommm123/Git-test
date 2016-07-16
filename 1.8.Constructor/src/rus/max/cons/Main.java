package rus.max.cons;

public class Main {

	public static void main(String[] args) {   // Можно ставить после String...(троеточие) Троеточие позволяет принимать неопределенное количество параметров одного и того же типа, и скручивает их в массив, о запись String[] говорит о том, что мы хотим принять уже ГОТОВЫЙ массив как параметр.﻿
		// TODO Auto-generated method stub
		Birds birds = new Birds("sinii", true);   //в скобках(если создан конструктор), вписываются аргументы для этого конструктора

       	System.out.println(birds.getName());
       	System.out.println(birds.isCanFly());
	
	}
	
}
