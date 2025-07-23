package patrones.lite.adapter;

public class Cliente {
	public static void main(String[] args) {

		CuentaAdapter adapter = new CuentaAdapterImpl();
		Moneda dolares = adapter.getDolares();
		Moneda pesos = adapter.getPesos();
		
		System.out.println("Dolares: " + dolares.getCantidad());
		System.out.println("Pesos: " + pesos.getCantidad());

	}
}
