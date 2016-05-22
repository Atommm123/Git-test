package boob;
import java.util.*;

public class Reader {
	int y;
	int d;
	public void Scan(){
		System.out.println("¬ведите первое число");
		Scanner scn = new Scanner(System.in);
		y = scn.nextInt();
		System.out.println("¬ведите второе число");
		d = scn.nextInt();
	}

}
