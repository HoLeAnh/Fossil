package runTest;

import carClass.BMW;
import carClass.Car;
import carClass.Toyota;

public class Question1 {

	public static void main(String args[]) {
		Car car1 = new Toyota();
		Car car2 = new BMW();

		car1.info();
		car2.info();

		car1.run();
		car2.run();
	}
}
