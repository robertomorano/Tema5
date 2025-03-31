package interfaces.agenda;

import java.util.Objects;

public class Contacto {
	String nombre;
	int numero;
	public Contacto(String nombre, int numero) {

		this.nombre = nombre;
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numero=" + numero + "]";
	}
	
}
