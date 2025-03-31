package interfaces.biblioteca;

public class Libros extends Ficha{
	String autor = "";
	String editorial = "";
	public Libros(int codigo, String titulo, String autor, String editorial) {
		super(codigo, titulo);
		this.autor = autor;
		this.editorial = editorial;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutor() {
		return autor;
	}
	@Override
	public String toString() {
		return super.toString()+"Libros [autor=" + autor + ", editorial=" + editorial + "]";
	}
	@Override
	public int prestamo() {
		// TODO Auto-generated method stub
		return 15;
	}
	
}
