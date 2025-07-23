package patrones.lite.facade;

public class Persona {

	private String nombre;
	private String apellido;
	private String correo;

	public Persona(String nombre, String apellido, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
