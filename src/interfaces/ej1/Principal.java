package interfaces.ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	static List<Socio> listaSocios = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
	}
	static void menu() {
		System.out.println("1. Introducir triángulo.\n"
				+ "2. Introducir rectángulo.\n"
				+ "3. Mostrar polígonos.\n");
	}
}
