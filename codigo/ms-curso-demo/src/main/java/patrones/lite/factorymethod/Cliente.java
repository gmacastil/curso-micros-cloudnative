package patrones.lite.factorymethod;

public class Cliente {
	private static Shop shop;

	public static void main(String[] args) {
		String method = "creditCard";


			
		if (method.equalsIgnoreCase("creditCard")) 
			shop = new CreditPayment();
		else if (method.equalsIgnoreCase("cash")) {
			shop = new CashPayment();
//		} else {
//			shop = new MercaPagoPayment();
//		}
		shop.buySomething();
		shop.adjustIvn();
		shop.irTesoreria();
		
		
		
		
	}
	}
}
