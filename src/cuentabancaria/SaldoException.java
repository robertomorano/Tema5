package cuentabancaria;

public class SaldoException extends Exception {
	@Override
	public String toString() {

		return "Saldo no pude ser negativo";
	}

	@Override
	public String getMessage() {
		return "Saldo no pude ser negativo";
	}
}
