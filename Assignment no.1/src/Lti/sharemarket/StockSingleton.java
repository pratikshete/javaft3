package Lti.sharemarket;

public final class StockSingleton {
	
	
	
	public StockSingleton() {
	}

	private static Stock lti =null; 
	public static Stock getStock() {
		
		if (lti==null)
			lti=new Stock();
		return lti;
		
		
	}

}
