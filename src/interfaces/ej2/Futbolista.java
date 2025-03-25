package interfaces.ej2;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {
	int dorsal = 0;
	String nombre = "";
	int edad = 0;
	int goles =0;
	public Futbolista(int dorsal, String nombre, int edad, int goles) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.edad = edad;
		this.goles = goles;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dorsal);
	}
	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		if (obj instanceof Futbolista f) {
			if (f.dorsal == this.dorsal && f.nombre.equals(this.nombre)) {
				equal = true;
			}
		}
		return equal;
	}
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", nombre=" + nombre + ", edad=" + edad + ", goles=" + goles + "]";
	}
	@Override
	public int compareTo(Futbolista o) {
		int res = 0;
		if(o.dorsal > this.dorsal) {
			res = 1;
		}else if(o.dorsal < this.dorsal){
			res = -1;
		}else {
			if (o.nombre.compareTo(this.nombre)>0) {
				res = 1;
			} else {
				res = -1;
			}
		}
		return res;
		
	}
	
	
	
}

