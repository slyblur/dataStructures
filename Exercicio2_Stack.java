package Collection;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2_Stack {

	public static void main(String[] args) {
		
		int op = 0;
		
		Scanner leia = new Scanner (System.in);
		
		Stack <String> pilha = new Stack<String>();
		
		
		do {
			
			System.out.println("Menu de opções: ");
			System.out.println("\n1. Adicionar um livro na pilha ");
			System.out.println("\n2. Listar todos os livros da Pilha  ");
			System.out.println("\n3. Remover um Livro da Pilha ");
			System.out.println("\n0. Sair do programa ");
			
			
			
			System.out.println("\nEscolha uma opção: ");
			op = leia.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do Livro que deseja adicionar: ");
				String livro = leia.next();
				pilha.add(livro);
				
				System.out.println("\nPilha atualizada"+pilha);
				break;
				
			case 2:
				System.out.println("\nConsulta de Livros na Pilha: ");
				System.out.println(pilha);
				break;
				
			case 3:
				System.out.println ("\nDigite o nome do Livro que deseja remover: ");
				String livroremover = leia.nextLine();
				
				if (pilha.contains(livroremover)) {
					pilha.remove(livroremover);
				} else {
					System.out.println("\nLivro não existente na pilha.");
				}
				
				System.out.println("\nNovo livro adicionado: "+pilha);
				break;
			case 0:
				System.out.print("\n\nObrigado por utilizar nosso sistema.");
				break;
				
				default:
					System.out.println("\nOpção Inválida.");
						
			
		}
		

	}while (op !=0);
		
		/*			fim do programa.	*/

}}
