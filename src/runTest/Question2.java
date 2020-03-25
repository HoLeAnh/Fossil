package runTest;

import carClass.BMW;
import carClass.Car;
import carClass.Toyota;

public class Question2 {

	public static void main(String args[]) {
		Car toyota = new Toyota();
		Car bmw = new BMW();

		Thread t1 = new Thread(toyota);
		Thread t2 = new Thread(bmw);

		t1.start();
		t2.start();
	}
}
