package interfaces.ej4;

public class Motocicleta {
	int cilindrada = 0;
	public boolean carnet() {
		return (this.cilindrada >= 125);
	}
	public int getCilindrada() {
		return cilindrada;
	}
	
}
