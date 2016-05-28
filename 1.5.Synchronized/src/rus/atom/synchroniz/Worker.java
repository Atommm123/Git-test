package rus.atom.synchroniz;

public class Worker implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<2000;i++){
			Main.Uveli4eHue();       //Так как метод Увеличение статический, то необязательно создавать объект в классе мэйн, чтобы вызвать метод Увеличени.
		}

	}

}
