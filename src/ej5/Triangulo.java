package ej5;

public class Triangulo extends Poligono {
	/**
	 * 
	 */
	private double lado1 = 1;
	/**
	 * 
	 */
	private double lado2 = 1;
	/**
	 * 
	 */
	private double lado3 = 1;

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		double s = semiperimetro();
		return Math.sqrt((s-this.lado1)*(s-this.lado2)*(s-this.lado3));

	}
	private double semiperimetro() {
		return (this.lado1+this.lado2+this.lado3)/2;
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
