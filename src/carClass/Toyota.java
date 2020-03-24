package carClass;

import globalData.GlobalFlag;

public class Toyota implements Car {

	private int maxSpeed = 100;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(maxSpeed);
		}
	}

	@Override
	public void info() {
		System.out.println("wheel = " + wheels);
		System.out.println("doors = " + doors);
		System.out.println("seats = " + seats);
		System.out.println("maxSpeed = " + maxSpeed);
	}

	@Override
	public void runSequence() {
		for (int i = 0; i < 10; i++) {
			while (GlobalFlag.flag != 1) {
				try {
					Thread.currentThread().sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(maxSpeed);
			GlobalFlag.flag = 0;
		}
	}
}
