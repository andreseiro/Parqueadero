
public class Moto extends Vehiculo {
	private boolean limitador;

	// Métodos de Acceso
	public boolean getLimitador() {
		return this.limitador;
	}

	// Métodos Modificadores
	public void setLimitador(boolean nuevoLimitador) {
		this.limitador = nuevoLimitador;
	}

	// Constructores
	public Moto(String placa, String marca, int modelo, boolean limitador) {
		super(placa, marca, modelo);
		this.limitador = limitador;
	}

	public Moto(String placa) {
		super(placa);
	}
}