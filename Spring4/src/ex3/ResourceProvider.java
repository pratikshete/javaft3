package ex3;

public class ResourceProvider {
	public ResourceProvider() {
		System.out.println("Provider Constructor");
	}

	private static ResourceProvider provider;

	public static ResourceProvider getProvider() {
		System.out.println("Bacchi Bamai");
		if (provider == null)
			provider = new ResourceProvider();

		return provider;

	}

}
