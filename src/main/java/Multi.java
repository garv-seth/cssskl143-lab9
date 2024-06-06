public class Multi implements Runnable {
	private String name;

	public Multi(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if (Math.random() < 0.5) {
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name + " : " + i);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Multi("foo1"));
		Thread t2 = new Thread(new Multi("foo2"));

		t1.start();
		t2.start();
	}
}
