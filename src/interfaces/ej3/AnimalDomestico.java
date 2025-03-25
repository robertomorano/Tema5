package interfaces.ej3;

import java.util.Objects;

public abstract class AnimalDomestico implements Animal{
	private String nombre = "";
	private String raza = "";
	private double peso = 0;
	private String color = "";
	
	
	
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void vacunar() {
		
	}
	
	abstract public boolean hacerCaso();
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	abstract public void hacerRuido();
	
	
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalDomestico other = (AnimalDomestico) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "AnimalDomestico [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", color=" + color + "]";
	}
	

}
