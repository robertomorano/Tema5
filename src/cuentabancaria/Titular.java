package cuentabancaria;

public class Titular implements Comparable<String>{
	private String dni;
	private String nombre;
	private String apellidos;
	private int telefono;
	public Titular(String dni, String nombre, String apellidos, int telefono) {
	
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public String getApellidos() {
		return apellidos;
	}
	@Override
	public String toString() {
		return "Titular [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ "]";
	}
	@Override
	public int compareTo(String o) {
		int res = o.compareTo(this.dni);
		return res;
	}
	
	
	
}
