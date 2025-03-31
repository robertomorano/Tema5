package interfaces.agenda;

public class Empresa extends Contacto {
	String web = "";

	public Empresa(String nombre, int numero, String web) {
		super(nombre, numero);
		this.web = web;
	}
	
}
