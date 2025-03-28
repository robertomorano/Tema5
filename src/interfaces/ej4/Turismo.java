package interfaces.ej4;
enum Uso {
	PROFESIONAL, PARTICULAR
}
public class Turismo extends Vehiculo {
	
	private int numeroPlazas = 0;
	private Uso uso = Uso.PARTICULAR;
	public Turismo(String marca, String color, String modelo, String matricula, boolean motor, int marchaActual,
			double velocidad, int numeroPlazas, Uso uso) {
		super(marca, color, modelo, matricula, motor, marchaActual, velocidad);
		this.numeroPlazas = numeroPlazas;
		this.uso = uso;
	}
	
	
}
