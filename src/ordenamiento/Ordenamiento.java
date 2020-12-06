package ordenamiento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Ordenamiento {
	
	public void imprimirArray(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println();
	}
	
	//Iterativa
	public int[] seleccion(int[] a){
		int minimo;
		int aux;
		int indice;
		
		for (int i=0; i<a.length; i++) {
			minimo = a[i];
			indice = i;
			
			for (int y=i; y<a.length; y++) {
				if (a[y] < minimo) {
					minimo = a[y];
					indice = y;
				}
					
			}
			
			aux = a[i];
			a[i] = minimo;
			a[indice] = aux;	
		}
		
		return a;
	}
	
	public int[] insercion(int[] a) {
		int aux;
		
		for (int i=0; i<a.length; i++) {
			for (int j = i; j != 0; j--) {
				if (a[j] < a[j - 1]) {
					aux = a[j];
					a[j] = a[j - 1];
					a[j - 1] = aux;
				}
			}
		}
		
		return a;
	}
	
	
	public int[] burbuja(int[] a) {
		int aux;
		
		for (int i=0; i<a.length - 1; i++) {
			for (int j=0; j<a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
		
		return a;
	}
	
	public int[] QuickSort(int[] a) {
		if (a.length <= 1) {
			return a;
		}
		
		int pivote = a[0];
		List<Integer> derecha_lista = new ArrayList<Integer>();
		List<Integer> izquierda_lista = new ArrayList<Integer>();
		int[] ordenados = new int[a.length], izquierda, derecha;
		
		for (int i=1; i<a.length; i++) {
			if (pivote > a[i])
				izquierda_lista.add(a[i]);
			else
				derecha_lista.add(a[i]);
			
		}
		
		izquierda = izquierda_lista.stream().mapToInt(i->i).toArray();
		izquierda = QuickSort(izquierda);
		derecha = derecha_lista.stream().mapToInt(i->i).toArray();
		derecha = QuickSort(derecha);
		
		System.arraycopy(izquierda, 0, ordenados, 0, izquierda.length);
		ordenados[izquierda.length] = pivote;
		System.arraycopy(derecha, 0, ordenados, izquierda.length + 1, derecha.length);
		
		return ordenados;
	}
	
}
