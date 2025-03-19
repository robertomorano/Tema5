package ej5;

public abstract class Poligono {
	/**
	 * 
	 */
	int numeroLados = 0; 
	
	public int getNumeroLados() {
		return numeroLados;
	}


	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}


	/**
	 * 
	 * @param numeroLados
	 */
	public Poligono(int numeroLados) {
		if (numeroLados>0) {
			this.numeroLados = numeroLados;
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Poligono: "+this.numeroLados;
	}
	public abstract double area();
	
	
}
