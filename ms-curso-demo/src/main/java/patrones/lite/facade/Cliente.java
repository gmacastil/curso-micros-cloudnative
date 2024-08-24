package patrones.lite.facade;

public class Cliente {
	public static void main(String[] args) {
		Factura f = new Factura();
		f.crearFactura();
		System.out.println(f.consultarFactura());
	}

}
