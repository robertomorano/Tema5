package ej4;

public class Television extends Electrodomenstico{
	int resolucion = 20;
	boolean sintonizadorTDT = false;
	public Television(double precioBase, double peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	public Television(double precioBase, String color, char consumoEner, double peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEner, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	@Override
	public void precioFinal() {
		super.precioFinal();
		if (this.resolucion > 40) {
			this.setPrecioBase(this.getPrecioBase()+(this.getPrecioBase()*0.3));
		}
		if(this.sintonizadorTDT) {
			this.setPrecioBase(this.getPrecioBase()+50);
		}
	
	}
}
