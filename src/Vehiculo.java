
public abstract class Vehiculo implements Identificacion{
	private String placa;
	private String marca;
	private int modelo;

	// Métodos de Acceso
	public String getPlaca() {
		return this.placa;
	}

	public String getMarca() {
		return this.marca;
	}

	public int getModelo() {
		return this.modelo;
	}

	// Métodos Modificadores
	public void setMarca(String nuevaMarca) {
		this.marca = nuevaMarca;
	}

	public void setModelo(int nuevoModelo) {
		this.modelo = nuevoModelo;
	}

	// Constructores
	public Vehiculo(String placa, String marca, int modelo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo(String placa) {
		this.placa = placa;
	}
	// ********************************************************
	// Metodo getter y setter

	@Override
	public boolean identificarte(String nombre, String codigo) {
		// TODO Auto-generated method stub
		return true;
	}

}
