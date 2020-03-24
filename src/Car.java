
public abstract class Car {
	
	public static int flag = 1 ;
	private int wheels = 4;
	private int doors = 4;
	private int seats = 5;
	private int maxSpeed;

	abstract void run();

	void info() {
		System.out.println("wheel = " + wheels);
		System.out.println("doors = " + doors);
		System.out.println("seats = " + seats);
	}

	
	

}
