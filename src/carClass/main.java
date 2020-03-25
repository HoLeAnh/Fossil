package carClass;

import carClass.Car;

public class main {

	public static void main(String args[]) {

		question4();
	}

	public static void question1() {
		Car car1 = new Toyota();
		Car car2 = new BMW();

		car1.info();
		car2.info();

		car1.run();
		car2.run();
	}

	public static void question2() {
		Car car1 = new Toyota();
		Car car2 = new BMW();

		Thread t1 = new Thread(car1);
		Thread t2 = new Thread(car2);

		t1.start();
		t2.start();
	}

	public static void question4() {
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
