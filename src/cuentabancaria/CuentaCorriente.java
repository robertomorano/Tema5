package cuentabancaria;

import java.util.HashSet;

public class CuentaCorriente extends CuentaBancaria {
	private static double porcentaje;
	private HashSet<Transaccion> transacciones;
	
	
	
	public CuentaCorriente(int numCuenta, double saldo, Titular titular, HashSet<Transaccion> transacciones) throws DniException, SaldoException {
		super(numCuenta, saldo, titular);
		this.transacciones = transacciones;
	}



	public int getNumberTransacciones() {
		return this.transacciones.size();
	}
}
