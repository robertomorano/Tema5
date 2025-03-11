package hora;

public class HoraExacta extends Hora{
	private int segundos;
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}
	
	public boolean setSegundos(int segundos) {

		boolean exito = (segundos > 59) ? false : true;
		if(exito) {
			this.segundos = segundos;
		}
		return exito;
	}
	@Override
	public void inc() {
		this.segundos++;
		if (this.segundos>59) {
		
			super.inc();
		}
		
	}
	
	@Override
	public String toString() {
		
		return super.toString()+":"+this.segundos;
	}


}
