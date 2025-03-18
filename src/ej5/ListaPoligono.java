package ej5;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligono {
	static List<Poligono> listaPolifonos = new ArrayList<>();
	
	public static boolean añadir(Poligono figura) {
		return listaPolifonos.add(figura);
	}
	private void mostrarPoligo() {
		for (Poligono p: listaPolifonos) {
			System.out.println(p + p,);
		}
		
	}

}
