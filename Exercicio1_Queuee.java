package Collection;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio1_Queuee {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		Queue <String> fila = new LinkedList<>();		
		
		do {
			
			System.out.println("Menu de opções: ");
			System.out.println("\n1. Adicionar um Cliente na Fila: ");
			System.out.println("\n2. Listar todos os clientes da Fila  ");
			System.out.println("\n3. Remover um Cliente da Fila ");
			System.out.println("\n0. Sair do programa ");
			
			System.out.println("\nEscolha uma opção: ");
			op = leia.nextInt();
			
			
			
			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do Cliente que deseja adicionar: ");
				String cliente = leia.next();
				fila.add(cliente);
				break;
				
			case 2:
				System.out.println("\nConsulta de Clientes na fila: ");
				System.out.println(fila);
				break;		
				
			case 3:
				System.out.println ("\nDigite o nome do Cliente que deseja remover: ");
				String clienteremover = leia.nextLine();
				
				if (fila.contains(clienteremover)) {
					fila.remove(clienteremover);
				} else {
					System.out.println("\nCliente não existe na fila.");
				}
				
				System.out.println("\nCliente adicionado: "+fila);
				break;
			
			case 0:
				System.out.print("\n\nObrigado por utilizar nosso sistema.");
				break;
				
				default:
					System.out.println("\nOpção inválida.");
			}	
		}while (op !=0);
			
		}	/*          fim do programa.        */

	}


