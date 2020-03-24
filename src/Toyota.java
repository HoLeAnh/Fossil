
public class Toyota extends Car {

	private int maxSpeed = 100;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			print();
		}
	}

	public void print() {
		while (flag != 1) {
			try {
				Thread.currentThread().sleep(100);
			} catch (Exception e) {
			}
		}
		System.out.println(maxSpeed + " - this is thread : " + Thread.currentThread().getId());
		flag = 2;
	}

}
