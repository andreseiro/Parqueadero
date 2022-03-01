
public class Carro extends Vehiculo {
	private int ancho;
	private int altura;

	// Métodos de Acceso
	public int getAncho() {
		return this.ancho;
	}

	public int getAltura() {
		return this.altura;
	}

	// Métodos Modificadores
	public void setAncho(int nuevoAncho) {
		this.ancho = nuevoAncho;
	}

	public void setAltura(int nuevaAltura) {
		this.altura = nuevaAltura;
	}

	// Constructores
	public Carro(String placa, String marca, int modelo, int ancho, int altura) {
		super(placa, marca, modelo);
		this.ancho = ancho;
		this.altura = altura;
	}

	public Carro(String placa) {
		super(placa);
	}

}
