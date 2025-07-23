package patrones.lite.facade;

import java.util.ArrayList;
import java.util.List;

public class Factura {

	private int codigo;
	private List<Articulo> articulos;
	private int valor;
	private Persona persona;

	public void crearFactura() {
		articulos = new ArrayList<>();
		articulos.add(new Articulo("ropa", 2));
		articulos.add(new Articulo("zapatos", 1));
		persona = new Persona("Juan", "Zapata", "a@a.com");
		valor = 100;
		codigo = 1;
	}

	public String consultarFactura() {
		return "codigo: " + codigo + ", valor: " + valor + ", cantidad articulos: " + articulos.size() + ", correo: "
				+ persona.getCorreo();
	}

}
