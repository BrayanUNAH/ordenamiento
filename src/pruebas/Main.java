package pruebas;

import java.util.*;
import ordenamiento.Ordenamiento;

public class Main {

	public static void main(String[] args) {
		Ordenamiento o = new Ordenamiento();
		int a[] = {8, 2, 6, 8, 1, 4, 3, 7, 5, 8, 9, 0};
		//o.imprimirArray(o.seleccion(a));
		//o.imprimirArray(o.insercion(a));
		//o.imprimirArray(o.burbuja(a));
		o.imprimirArray(o.QuickSort(a));
		
		
//		ArrayList<Integer> l = new ArrayList;
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		
//		System.out.println(l.stream().flatMapToInt(null).toArray());
		
        
	}

}
