package ej4;

public class Lavadora extends Electrodomenstico{
	double carga = 5;

	public Lavadora(double precioBase, double peso, double carga) {
		super(precioBase, peso);
		this.carga = carga;
	}

	public Lavadora(double precioBase, String color, char consumoEner, double peso, double carga) {
		super(precioBase, color, consumoEner, peso);
		if (carga >0) {
			this.carga = carga;
		}
		
	}
	/**
	 * 
	 * @return
	 */
	public double getCarga() {
		return carga;
	}
	/**
	 * 
	 * @param carga
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.setPrecioBase(this.getPrecioBase()+50);
		}
	}
	
}
