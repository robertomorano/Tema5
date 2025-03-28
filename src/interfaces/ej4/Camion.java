package interfaces.ej4;

public class Camion extends Vehiculo{
	private double mma = 0;
	private boolean peligrosa = false;
	
	
	public Camion(String marca, String color, String modelo, String matricula, boolean motor, int marchaActual,
			double velocidad, double mma, boolean peligrosa) {
		super(marca, color, modelo, matricula, motor, marchaActual, velocidad);
		this.mma = mma;
		this.peligrosa = peligrosa;
	}


	public boolean isPeligrosa() {
		return peligrosa;
	}


	public void setPeligrosa(boolean peligrosa) {
		this.peligrosa = peligrosa;
	}


	public double getMma() {
		return mma;
	}
	
}
