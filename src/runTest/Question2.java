package runTest;

import carClass.BMW;
import carClass.Car;
import carClass.Toyota;

public class Question2 {

	public static void main(String args[]) {
		Car toyota = new Toyota();
		Car bmw = new BMW();

		Thread thread1 = new Thread() {
			public void run() {
				toyota.run();
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				bmw.run();
			}
		};
		
		thread1.start();
		thread2.start();
	}
}
