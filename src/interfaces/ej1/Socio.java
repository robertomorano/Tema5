package interfaces.ej1;

public class Socio implements Comparable<Socio> {
	int id;
	String nombre;
	int edad;
	public Socio(int id, String nombre, int edad) {
	
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	
	}
	
	@Override
		public String toString() {
			
			return this.nombre+" Edad: "+ this.edad;
		}

	@Override
	public int compareTo(Socio o) {
		int res = 0;
		if(o.id > this.id) {
			res = 1;
		}else {
			res = -1;
		}
		return res;
	}
	
}
