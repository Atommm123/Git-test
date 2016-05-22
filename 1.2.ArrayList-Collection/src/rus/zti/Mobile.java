package rus.zti;

public class Mobile {
	private int number;
	private String name;
	
	public Mobile(int number, String name){
		this.name = name;
		this.number = number;
	}
	
	public int getNumber() {                    //Вот это все дело инкапсуляция, инкапсуляция это по сути создание метода, что бы брать значение переменой не прямо от нее,а  через публичный метод, который ее возращает
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
