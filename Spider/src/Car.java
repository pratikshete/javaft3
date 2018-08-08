
public class Car {
	private String model;
	private String[] features;

	public Car(String model, String... features) {
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for (String features : features)
			System.out.println(features);
	}

	public static void main(String[] args) {
		Car alto = new Car("Alto", "Power Stearing", "Power Window", "Keyless Entry");
		alto.specs();

		Car jazz = new Car("Jazz", "Keyless Start", "ABS", "Pano Roof", "Auto Gears");
		jazz.specs();
	}

}
