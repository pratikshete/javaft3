
public class MyThread extends Thread {
	private int data;

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String name = currentThread().getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name + ":" + ++data);

	}

	public static void main(String[] args) {

		MyThread mt1 = new MyThread("Bala");
		MyThread mt2 = new MyThread("Guru");
		MyThread mt3 = new MyThread("Swami");

		mt1.start();
		mt2.start();
		mt3.start();

		String name = currentThread().getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name + ":" + c);

	}

}
