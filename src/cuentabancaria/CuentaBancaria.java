package cuentabancaria;

import java.util.HashSet;

public class CuentaBancaria {
	private int numCuenta;
	private double saldo;
	private HashSet<Titular> Titulares;

	public CuentaBancaria(int numCuenta, double saldo, Titular titular) throws DniException, SaldoException {
		if (numCuenta > 0) {
			this.numCuenta = numCuenta;
		} else {
			throw new DniException();
		}
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			throw new SaldoException();
		}
		if (!Titulares.contains(titular)) {
			Titulares.add(titular);
		}
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
