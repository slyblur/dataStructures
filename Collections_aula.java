package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections_aula {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner (System.in);
		ArrayList <String> estoque = new ArrayList<String>();
		
		estoque.add("morango");
		estoque.add("abacaxi");
		estoque.add("manga");
		estoque.add("pessego");
		estoque.add("uva");
		estoque.add("ameixa");
		estoque.add("caju");
		estoque.add("melancia");
		estoque.add("limao");
		estoque.add("cenoura");
		estoque.add("coco");
		estoque.add("jaca");
		
					/*comando .add é da biblioteca Collect*/
	
	do {
		
		System.out.println("Menu Estoque");
		System.out.println("\n1 - Para adicionar produtos ao estoque");
		System.out.println("2 - Para remover produtos ao estoque");
		System.out.println("3 - Para atualizar produtos ao estoque");
		System.out.println("4 - Deseja visualizar produtos ao estoque?");
		System.out.println("0 - Para encerrar o programa");
		System.out.println("\n\nDigite sua opção: ");
		
		op = leia.nextInt();	
		
		switch(op) {
		case 1:
			System.out.println("Digite o produto que quer adicionar ao estoque: ");
			String adicionarproduto = leia.nextLine();
			estoque.add(adicionarproduto);
			break;
			
		case 2:
			System.out.println("Digite o produto que quer remover do estoque: ");
			String removerproduto = leia.nextLine();
			
			if (estoque.contains(removerproduto)) {
				estoque.remove(removerproduto);    /* .remove é do Collections*/
			} else {
				System.out.println("Produto não existe no estoque!");
			}
			
			System.out.println("Estoque atualizado: "+estoque);
			break;
			
		case 3:
			System.out.println("Digite o produto que deseja atualizar: ");
			String verifica = leia.nextLine();
			
			System.out.println("Digite o produto que entrará no lugar do "+verifica+" : ");
			String novo = leia.nextLine();
			
			if (estoque.contains(verifica)) {	/*   .contains é do Collections*/
				estoque.remove(verifica);		/*   .remove é do Collections*/
				estoque.add(novo);
			} else {
				System.out.println("Produto não existe no estoque!");
				
			}
			
			System.out.println("Estoque atualizado: "+estoque);
			break;
			
		case 4:
			System.out.println("Consulta de Estoque: ");
			System.out.println(estoque);
			break;
			
		case 0:
			System.out.println("Agradecemos por utilizar nosso sistema.");
			break;	
			
			default:
				System.out.println("Opção inválida! Tente novamente.");
		}		
	} while (op !=0);
	
	

}}
