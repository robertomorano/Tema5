package hora;

public class Hora {
	private int hora;
	private int minutos;
		public Hora(int hora, int minutos) {
			this.hora = hora;
			this.minutos = minutos;
		}
		public void inc() {
			this.minutos++;
			if(this.minutos > 59) {
				this.minutos = 0;
				this.hora = (this.hora >= 23) ? 0: this.hora++;
			}
		}
		
		public int getHora() {
			return this.hora;
		}
		public boolean setHora(int hora) {
			boolean exito = (hora > 23) ? false : true;
			if(exito) {
				this.hora = hora;
			}
			return exito;
		}
		public int getMinutos() {
			return minutos;
		}
		public boolean setMinutos(int minutos) {
			boolean exito = (minutos > 59) ? false : true;
			if(exito) {
				this.minutos = minutos;
			}
			return exito;
		}
		@Override
		public String toString() {
		return this.hora+":"+this.minutos;
		}


}
