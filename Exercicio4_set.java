package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4_set {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Set <Integer> numeros = new HashSet<Integer>();
		
		numeros.add(2);
		numeros.add(5);	
		numeros.add(1);	
		numeros.add(3);	
		numeros.add(4);	
		numeros.add(9);	
		numeros.add(7);	
		numeros.add(8);	
		numeros.add(10);
		numeros.add(6);
		
		
		System.out.println("Digite o número que você quer encontrar: ");
		int n = leia.nextInt();
		
		
		boolean verifica;
		verifica = numeros.contains(n);
		
		if (verifica == true) {
			System.out.println("\n\nO número "+n+" foi encontrado.");
		}
		else {
			System.out.println("O número "+n+" não foi encontrado.");
		}
		
				
		/* fim do programa.*/

	}

}
