package runTest;

import carClass.BMW;
import carClass.Car;
import carClass.Toyota;

public class Question4 {

	public static void main(String args[]) {
		Car toyota = new Toyota();
		Car bmw = new BMW();
		
		Thread thread1 = new Thread() {
			public void run() {
				toyota.runSequence();
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				bmw.runSequence();
			}
		};

		thread1.start();
		thread2.start();
	}
}
