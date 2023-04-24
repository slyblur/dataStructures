package Collection;

import java.util.Stack;
import java.util.Iterator;

public class Stack_PILHA {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack <String>();
		
		pilha.push("Livro verde");
		pilha.push("Livro vermelho");
		pilha.push("Livro preto");
		pilha.push("Livro dourado");
		pilha.push("Livro azul");
		
		
		System.out.println("Elementos da pilha: "+pilha);
		
		System.out.println("\nRetirar elemento: "+pilha.pop());  /*pop retira o elemento*/
		
		System.out.println("\nElemento no topo da pilha: "+pilha.peek()); /* peek vazio mostra o topo da pilha*/
		
		System.out.println("\nAdicionar um elemento específico na pilha: "+pilha.push("Livro rosa"));
		
		System.out.println("\nVisualizar pilha: "+pilha);
		
		System.out.println("\nTamanho da pilha: "+pilha.size());
		
		System.out.println("\nO livro laranja está dentro da pilha? "+pilha.contains("Livro laranja"));
		
		System.out.println("\nAdicionar um elemento específico na pilha: "+pilha.push("Livro laranja"));
		
		System.out.println("\nO livro laranja está dentro da pilha? "+pilha.contains("Livro laranja"));
		
		
		
		System.out.println("\n\nExibir os Elementos com o Iterator...\n");
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		pilha.clear();   /* .clear vazio no Iterator remove todos os elementos da pilha*/
		System.out.println("\n\nVerificar se a pilha está vazia...: "+pilha.isEmpty());


	}

}
