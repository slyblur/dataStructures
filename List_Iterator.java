package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class List_Iterator {

	public static void main(String[] args) {
		
		/* Próxima linha: Criando uma Collection do tipo List */
		
		List<Integer> minhalista = new ArrayList<Integer>();
		
		minhalista.add(15);
		minhalista.add(22);
		minhalista.add(17);
		minhalista.add(66);
		minhalista.add(33);
		minhalista.add(12);
		minhalista.add(-9);
		minhalista.add(-17);
		
		
		for (Integer listaElementos:minhalista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\n Removendo um elemento da Lista");
		minhalista.remove(0);
		
		for (Integer listaElementos:minhalista) {
			System.out.println(listaElementos);

		}
		
		int primeiroElemento = minhalista.get(0); /* chama o elemento do ArrayList pelo índice*/
		System.out.println("\nO primeiro elemento é: "+primeiroElemento);
		
		for (int i =1; i<minhalista.size(); i++) {
			System.out.println("Elemento: "+minhalista.get(i));
		}
		
		Collections.sort(minhalista);  /*    .sort ordena os elementos da lista*/
		
		System.out.println("\nDepois de ordenado...");
		System.out.println(minhalista);
		
		for (Integer listaElementos:minhalista) {
			System.out.println("\n"+listaElementos);
		}
		
		
		
		/* Próxima linha: Criando uma Collection do tipo HashSet*/
		
		
		Set <Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(7);
		meuSet.add(5);
		meuSet.add(10);
		meuSet.add(8);
		meuSet.add(8);
		meuSet.add(5);
		meuSet.add(3);
		
		
		
		System.out.println("\nMy Setlist: "+meuSet);
		
		Iterator<Integer> iMeuset = meuSet.iterator(); /*
		
		 Invocando a Iterator,
		 que é é uma API para poder manipular o HashSet.*/
		
		while(iMeuset.hasNext()) {
			System.out.println(iMeuset.next());
		}
		
		

}}
