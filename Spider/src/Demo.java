
public class Demo<NJ> {
	private NJ data;

	public Demo(NJ data) {
		this.data = data;
	}

	public NJ getData() {
		return data;
	}

	public void setData(NJ data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Demo d1 = new Demo("Hello");
		System.out.println(d1.getData());

		Demo d2 = new Demo(5000);
		d2.setData("awesome");
		System.out.println(d2.getData());

	}

}
