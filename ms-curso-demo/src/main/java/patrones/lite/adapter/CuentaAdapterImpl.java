package patrones.lite.adapter;

public class CuentaAdapterImpl extends Cuenta implements CuentaAdapter {
	
	private static int TRM = 4000;
	
	@Override
	public Moneda getPesos() {
		return getPesos();
	}

	@Override
	public Moneda getDolares() {
		return new Moneda(getPesos().getCantidad() / TRM);
	}
}