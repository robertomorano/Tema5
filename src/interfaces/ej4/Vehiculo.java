package interfaces.ej4;

public class Vehiculo {

	private String marca;
	private String color;
	private String modelo;
	private String matricula;
	private boolean motor;
	private int marchaActual;
	private double velocidad;
	public Vehiculo(String marca, String color, String modelo, String matricula, boolean motor, int marchaActual,
			double velocidad) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.matricula = matricula;
		this.motor = motor;
		this.marchaActual = marchaActual;
		this.velocidad = velocidad;
	}
	public void parar() {
		
	}
	public void arrancar() {
		
	}
	private void subirMarcha() {
		
	}
	private void bajarMarcha() {
		
	}
	public void subirVelocidad(int velocidad) {
		
	}
	
}
