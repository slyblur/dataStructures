package Collection;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;


public class Queue_FILA {

	public static void main(String[] args) {
		
		Queue <Integer> fila = new LinkedList <Integer>();
		
		for (int i=0; i<=10; i++) {
			fila.add(i);		
		}
		
		System.out.println("\nElementos da fila: "+fila);
		System.out.println("\nremovendo Elementos "+fila.remove());
		System.out.println("\nElementos da fila depois de remover: "+fila);
		System.out.println("\nAdicionando o elemento 11: "+fila.add(11));
		System.out.println("\nElementos da fila depois de adicionar: "+fila);
		System.out.println("\nPegar um elemento da fila: "+fila.peek());
		System.out.println("\nPegar o tamanho da fila: "+fila.size());
		System.out.println("\nVerificar um elemento da fila: "+fila.contains(37));
		System.out.println("\nExibir e retirar o primeiro elemento da fila: "+fila.poll());
		System.out.println("\nFila atual: "+fila);
		
		Iterator<Integer> iterator = fila.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Limpar a fila: ");
		fila.clear();
		System.out.println(fila);
		
		System.out.println("Verificar se a fila está vazia: "+fila.isEmpty());
		
		
		
	

	}

}
