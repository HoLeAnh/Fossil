package carClass;

import globalData.GlobalFlag;

public class Toyota extends Car {

	public Toyota() {
		maxSpeed = 100;
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
