package cuentabancaria;

public class Transaccion {
	private int dia;
	private int mes;
	private int año;
	private String concepto;
	private double importe;
	public Transaccion(int dia, int mes, int año, String concepto, double importe) {
	
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.concepto = concepto;
		this.importe = importe;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAño() {
		return año;
	}
	
}
