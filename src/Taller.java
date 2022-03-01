import java.util.ArrayList;

public class Taller {
	private String nombre;
	private String direccion;
	private Propietario propietario;
	private ArrayList<Cliente> listaCliente;
	
	//Getter
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public Propietario getPropietario() {
		return propietario;
	}

	//Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	//Constructors
	public Taller(String nombre, String direccion, Propietario propietario) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.propietario = propietario;
	}
	public Taller(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
}

