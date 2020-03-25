package carClass;

import globalData.GlobalFlag;

public class BMW extends Car {

	public BMW() {
		maxSpeed = 200;
	}

	@Override
	public void runSequence() {
		for (int i = 0; i < 10; i++) {
			while (GlobalFlag.flag != 0) {
				try {
					Thread.currentThread().sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(maxSpeed);
			GlobalFlag.flag = 1;
		}
	}
	
}
