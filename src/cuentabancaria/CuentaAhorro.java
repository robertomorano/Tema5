package cuentabancaria;

public class CuentaAhorro extends CuentaBancaria {
	private double mantenimiento;
	private double interesAnual;
	public CuentaAhorro(int numCuenta, double saldo, Titular titular, double mantenimiento, double interesAnual) throws DniException, SaldoException {
		super(numCuenta, saldo, titular);
		this.mantenimiento = mantenimiento;
		this.interesAnual = interesAnual;
	}
	public double getMantenimiento() {
		return mantenimiento;
	}
	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	public double getInteresAnual() {
		return interesAnual;
	}
	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}
	
}
