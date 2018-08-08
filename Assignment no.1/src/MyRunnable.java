
public class MyRunnable implements Runnable {

	private int data;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name + ":" + ++data);

	}

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread mt1 = new Thread(mr, "Bala");
		Thread mt2 = new Thread(mr, "Guru");
		Thread mt3 = new Thread(mr, "Swami");

		mt1.start();
		mt2.start();
		mt3.start();

	}

}
