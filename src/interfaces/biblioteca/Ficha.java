package interfaces.biblioteca;

import java.util.Objects;

public abstract class Ficha implements Comparable<Ficha>{
	int codigo = 0;
	String titulo = "";
	
	public Ficha(int codigo, String titulo) {
	
		this.codigo = codigo;
		this.titulo = titulo;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	@Override
	public int compareTo(Ficha o) {
		int res = 0;
		if(this.codigo < o.getCodigo()) {
			res = -1;
		}else {
			res = 1;
		}
		return res;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
	
		Ficha other = (Ficha) obj;
		return codigo == other.codigo;
	}
	@Override
	public String toString() {
		return "Ficha [codigo=" + codigo + ", titulo=" + titulo + "]";
	}
	public abstract int prestamo();
}
