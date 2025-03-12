package ej4;

public class Electrodomenstico {
	/**
	 * 
	 */
	enum Colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * 
	 */
	enum Energuia {
		A, B, C, D, E, F
	}

	/**
	 * 
	 */
	private double precioBase = 100;
	/**
	 * 
	 */
	private Colores color = Colores.BLANCO;
	/**
	 * 
	 */
	private Energuia consumoEner = Energuia.F;
	/**
	 * 
	 */
	private double peso = 5;

	/**
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomenstico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomenstico(double precioBase, String color, char consumoEner, double peso) {

		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		this.color = stringToColore(color);
		this.consumoEner = stringToEnerguia(consumoEner);
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * 
	 * @param color
	 * @return
	 */
	private Colores stringToColore(String color) {
		Colores colo;
		switch (color.toLowerCase()) {
		case "rojo" -> colo = Colores.ROJO;
		case "azul" -> colo = Colores.AZUL;
		case "negro" -> colo = Colores.NEGRO;
		case "gris" -> colo = Colores.GRIS;
		default -> colo = Colores.BLANCO;

		}
		return colo;
	}

	/**
	 * 
	 * @param energ
	 * @return
	 */
	private Energuia stringToEnerguia(char energ) {
		Energuia consumo;
		switch (energ) {
		case 'A' -> consumo = Energuia.A;
		case 'B' -> consumo = Energuia.B;
		case 'C' -> consumo = Energuia.C;
		case 'D' -> consumo = Energuia.D;
		case 'E' -> consumo = Energuia.E;
		default -> consumo = Energuia.F;

		}
		return consumo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return String.valueOf(this.color);
	}

	public void setColor(String color) {
		this.color = stringToColore(color);
	}

	public char getConsumoEner() {
		return String.valueOf(consumoEner).charAt(0);
	}

	public void setConsumoEner(char consumoEner) {
		this.consumoEner = stringToEnerguia(consumoEner);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void precioFinal() {
		switch (this.consumoEner) {
			case A -> this.precioBase += 100;
			case B -> this.precioBase += 80;		
			case C -> this.precioBase += 60;
			case D -> this.precioBase += 50;
			case E -> this.precioBase += 30;
			default -> this.precioBase += 10;
		}
		
		if(this.peso > 0 && this.peso < 20) {
			this.precioBase += 10; 
		}else if(this.peso >= 19 && this.peso < 50) {
			this.precioBase += 50;
		}else if(this.peso >= 50 && this.peso < 80) {
			this.precioBase += 80;
		}else if(this.peso >= 80) {
			this.precioBase += 100;
		}
	}

}
