
public class BMW extends Car {

	private int maxSpeed = 200;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			print();
		}
	}

	public void print() {
		while (flag != 2) {
			try {
				Thread.currentThread().sleep(100);
			} catch (Exception e) {
			}
		}
		System.out.println(maxSpeed + " - this is thread : " + Thread.currentThread().getId());
		flag = 1;
	}

}
