package Collection;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Exercicio3_Set {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x = 0;
		Set <Integer> numeros = new HashSet<Integer>();
		
		for (int i=0; i<10; i++ ) {
			System.out.println("Insira um número não repetido: ");
			x = leia.nextInt();
			numeros.add(x);
		}
		
		Iterator<Integer> iterator = numeros.iterator();
		Collections.sort(numeros);
		
		System.out.println("\nNúmeros do Set: ");
		
		for (Integer total:numeros) {
			System.out.println(total);
			
		}
		
		/* fim do programa*/
		

	}

}
