package comparar.ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparaNumero implements Comparator<Integer> {
	@Override
	public int compare(Integer o, Integer o2) {

		return o2 - o;
	}

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lista.add((int) (Math.random() * 11));
		}
		for (Integer integer : lista) {
			System.out.print(integer + " ");
		}
		System.out.println();
		lista.sort(new ComparaNumero());
		for (Integer integer : lista) {
			System.out.print(integer + " ");
		}
	}
}
