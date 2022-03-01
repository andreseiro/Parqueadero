import java.util.ArrayList;

public class Cliente extends Persona {
	private ArrayList<Moto> listaMoto;
	private ArrayList<Carro> listaCarro;

	// Métodos de Acceso
	public ArrayList<Moto> getListaMotos() {
		return this.listaMoto;
	}

	public ArrayList<Carro> getListaCarro() {
		return this.listaCarro;
	}

	// Métodos Modificadores
	public void addCarro(Carro nuevoCarro) {
		this.listaCarro.add(nuevoCarro);
	}

	public void addMoto(Moto nuevaMoto) {
		this.listaMoto.add(nuevaMoto);
	}

	// Constructores
	public Cliente(String cedula, String nombre, String apellido, ArrayList<String> listaTelefonos,
			ArrayList<Moto> listaMoto, ArrayList<Carro> listaCarro) {
		super(cedula, nombre, apellido, listaTelefonos);
		this.listaMoto = listaMoto;
		this.listaCarro = listaCarro;
	}

	public Cliente(String cedula, String nombre, String apellido) {
		super(cedula, nombre, apellido);
	}

}