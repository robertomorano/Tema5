package cuentabancaria;

import java.util.HashSet;

public class CuentaBancaria {
	private int numCuenta;
	private double saldo;
	private HashSet<Titular> Titulares;
	
	public CuentaBancaria(int numCuenta, double saldo,  Titular titular) {
	
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		Titulares.add(titular);
	}
	public boolean ingresar(double cantidad) {
		boolean exito = false;
		return exito;
	}
	public boolean retirar(double cantidad) {
		boolean exito = false;
		return exito;
	}
	public boolean añadirTitular(Titular nuevo) {
		boolean exito = false;
		return exito;
	}
	public boolean eliminarTitular(Titular eliminar) {
		boolean exito = false;
		return exito;
	}
}
