package interfaces.biblioteca;

public class Revista extends Ficha {
	int numRevista = 0;
	int añoPub = 0;
	public Revista(int codigo, String titulo, int numRevista, int añoPub) {
		super(codigo, titulo);
		this.numRevista = numRevista;
		this.añoPub = añoPub;
	}
	
	public int getNumRevista() {
		return numRevista;
	}

	public int getAñoPub() {
		return añoPub;
	}

	@Override
	public String toString() {
		return super.toString() + " Revista [numRevista=" + numRevista + ", añoPub=" + añoPub + "]";
	}

	@Override
	public int prestamo() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}
