package rus.max.cons;

public class Birds {
   private String name;
   private boolean canFly;
   
   public Birds(String name, boolean canFly){    //Конструктор особоый метод, который динамичен и не возращает, вызывается всегда при создании объекта, название должно совпадать с названием класса.
	   this.name = name;
	   this.canFly = canFly;
   }

   
 public boolean isCanFly() {
	return canFly;
}

public String getName() {
	return name;
}

}
