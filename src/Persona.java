import java.util.ArrayList;

/**
 * 
 * @author andreseiro
 *
 *         Clase que implementa el propietario del vehiculo que usa el servicio
 *         del parqueadero.
 * 
 */

public abstract class Persona implements Identificacion {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<String> listaTelefonos;

	// Metodos de Acceso
	public String getCedula() {
		return this.cedula;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public ArrayList<String> getTelefono() {
		return this.listaTelefonos;
	}

	// Métodos de Modificación
	public void setcedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void addTelefono(String telefono) {
		this.listaTelefonos.add(telefono);
	}

	public void deleteTelefono(String telefono) {

	}

	// Constructores
	public Persona(String cedula, String nombre, String apellido, ArrayList<String> listaTelefonos) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaTelefonos = listaTelefonos;
	}

	public Persona(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public boolean identificarte(String nombre, String codigo) {
		// TODO Auto-generated method stub
		return true;
	}
}
