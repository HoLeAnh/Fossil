package runTest;

import carClass.BMW;
import carClass.Car;
import carClass.Toyota;

public class Question1 {

	public static void main(String args[]) {
		Car toyota = new Toyota();
		Car bmw = new BMW();

		toyota.info();
		bmw.info();

		toyota.run();
		bmw.run();
	}
}
