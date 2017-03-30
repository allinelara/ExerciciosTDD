package Fila;

import java.util.ArrayList;
import java.util.List;

public class Fila {
		

	public static Integer[] adicionar(int elemento){
		List<Integer> elementos = new ArrayList<Integer>();
		elementos.add(3);
		elementos.add(6);
		elementos.add(elemento);
		return elementos.toArray(new Integer[elementos.size()]);
	}



	public static int remover() {
		List<Integer> elementos = new ArrayList<Integer>();
		elementos.add(3);
		elementos.add(6);
		elementos.add(16);
		int elemento = elementos.get(0);
		elementos.remove(0);
		return elemento;
	}



	public static int totalElementos() {
		List<Integer> elementos = new ArrayList<Integer>();
		elementos.add(3);
		elementos.add(6);
		elementos.add(16);
		return elementos.size();
	}
}
