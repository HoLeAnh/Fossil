package carClass;

public class Car implements Runnable {

	public int wheels = 4;
	public int doors = 4;
	public int seats = 5;
	public int maxSpeed = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(maxSpeed);
		}
	};
	
	

	public void runSequence() {
	};

	public void info() {
		System.out.println("wheel = " + wheels);
		System.out.println("doors = " + doors);
		System.out.println("seats = " + seats);
		System.out.println("maxSpeed = " + maxSpeed);
	};

}
