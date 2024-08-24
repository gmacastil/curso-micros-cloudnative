package patrones.lite.factorymethod;

public abstract class Shop {
	
	public void buySomething() {
		Payment payment = makePayment();
		payment.paymentMethod();
	}
	
	public void adjustIvn() {
		
	}
	
	public void irTesoreria() {
		
	}

	public abstract Payment makePayment();
}