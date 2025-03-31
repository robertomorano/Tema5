package interfaces.agenda;

public class Persona extends Contacto {
	String cumpleaños = "";

	public Persona(String nombre, int numero, String cumpleaños) {
		super(nombre, numero);
		this.cumpleaños = cumpleaños;
	}
	
}
