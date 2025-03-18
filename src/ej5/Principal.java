package ej5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion;
		int a;
		int b;
		int c;
		Poligono p  = null;
		do {
			menu();
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1 -> {
				a = pedirLado();
				b = pedirLado();
				c = pedirLado();
				p = new Triangulo(a, b, c);
				ListaPoligono.añadir(p);
			}
			case 2 ->{
				b = pedirLado();
				c = pedirLado();
				ListaPoligono.añadir(new Recatangulo(b, c));
			}
			case 3 ->{
				
			}
			default ->{
				System.out.println("Saliendo del sistema");
			}
			}
		}while(opcion != 0);

	}
	static void menu() {
		System.out.println("1. Introducir triángulo.\n"
				+ "2. Introducir rectángulo.\n"
				+ "3. Mostrar polígonos.\n");
	}
	
	
	private static int pedirLado() {
		System.out.println("Dame el lado");
		return sc.nextInt();
	}

}
