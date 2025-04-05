package interfaces.biblioteca;
enum Tipo {
	PELICULA, SERIE, DOCUMENTAL
}
public class DVD extends Ficha {
	String director = "";
	int año = 0;
	Tipo tipo = Tipo.DOCUMENTAL;
	public DVD(int codigo, String titulo, String director, int año, Tipo tipo) {
		super(codigo, titulo);
		this.director = director;
		this.año = año;
		this.tipo = tipo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getDirector() {
		return director;
	}
	public int getAño() {
		return año;
	}
	
	@Override
	public String toString() {
		return super.toString()+" DVD [director=" + director + ", año=" + año + ", tipo=" + tipo + "]";
	}
	@Override
	public int prestamo() {
		return 5;
	}
	
}
