package runTest;

import carClass.BMW;
import carClass.Car;
import carClass.Toyota;

public class Question2 {

	public static void main(String args[]) {
		Car car1 = new Toyota();
		Car car2 = new BMW();

		Thread thread1 = new Thread() {
			public void run() {
				car1.run();
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				car2.run();
			}
		};
		
		thread1.start();
		thread2.start();
	}
}
