package interfaces.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
	static List<Socio> listaSocios = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = 0;
		Socio n = new Socio(1, "a", 12);
		listaSocios.add(n);
		n = new Socio(2, "asd", 7123);
		listaSocios.add(n);
		n = new Socio(3, "zzd", 321);
		listaSocios.add(n);
		do {
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1 ->{
				print();
			}
			
			case 2 ->{
				System.out.println("Antes: ");
				print();
				
				ordenar();
				System.out.println("Despues: ");
				print();
			}
			case 3->{
				System.out.println("Antes: ");
				print();
				
				ordenarEdad();
				System.out.println("Despues: ");
				print();
			}
			default ->
			throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while(opcion != 0);
	}
	static void menu() {
		System.out.println("1. Mostrar.\n"
				+ "2. Ordenar.\n"
				+ "3. Mostrar polígonos.\n");
	}
	static void print() {
		for(Socio soc: listaSocios) {
			System.out.println(soc);
		}
	}
	static void ordenarEdad() {
		listaSocios.sort(new CçomparaEdad());
	}
	static void ordenar() {
		
		/*for(Socio soc: listaSocios) {
			soc.compareTo(soc);
		}*/
		Collections.sort(listaSocios);
		
		
	}
}
