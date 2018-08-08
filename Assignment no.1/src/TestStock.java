import Lti.sharemarket.Broker;
import Lti.sharemarket.Holder;
import Lti.sharemarket.StockSingleton;

public class TestStock {

	public static void main(String[] args) {

			Holder h=StockSingleton.getStock();
			h.viewQoute();
			
			Broker b=StockSingleton.getStock();
			b.getQoute();
			
			System.out.println(h == b);
			
	}

}
