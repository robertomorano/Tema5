package interfaces.ej2;

import java.util.Comparator;

public class CompareEdad implements Comparator<Futbolista>{
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o2.getEdad() - o1.getEdad();
	}

}
