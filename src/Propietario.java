import java.util.ArrayList;

public class Propietario extends Persona {
	private String direccion;

	// Métodos de Acceso
	public String getDireccion() {
		return this.direccion;
	}

	// Métodos Modificadores
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Constructores
	public Propietario(String cedula, String nombre, String apellido, ArrayList<String> telefonos, String direccion) {
		super(cedula, nombre, apellido, telefonos);
		this.direccion = direccion;
	}

	public Propietario(String cedula, String nombre, String apellido) {
		super(cedula, nombre, apellido);
	}
}
