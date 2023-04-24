package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1_ArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);            						
		String cor;
		
		
		ArrayList<String> cores = new ArrayList<String>(); 
		/* inicializando a collection e o seu tipo*/	
		
		
		for (int i=0; i<5; i++) {
			System.out.println("Insira uma cor: ");
			cor = leia.next();
			cores.add(cor);
		}
		
		Iterator<String> iterator = cores.iterator();
		
		System.out.println("\n\nListar todas as cores: "+cores);	
		
		Collections.sort(cores);  /*modulo para ordenar*/
		System.out.println("\nOrdenar todas as cores: "+cores);
				
		
		
		/* fim do programa. */

	}

}
