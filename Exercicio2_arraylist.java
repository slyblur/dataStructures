package Collection;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio2_arraylist {

	public static void main(String[] args) {
		
		int n, newnumber;
		Scanner leia = new Scanner(System.in);
		
		List <Integer> numeros = new ArrayList<>();
		
		numeros.add(9);
		numeros.add(40);	
		numeros.add(1);	
		numeros.add(2);	
		numeros.add(4);	
		numeros.add(51);	
		numeros.add(7);	
		numeros.add(8);	
		numeros.add(10);
		numeros.add(66);
		
				
		System.out.println("Please, insert an Integer number: ");
		n = leia.nextInt();
		
		
		
		if (n == numeros.size()) {
			System.out.println("\nO número "+n+" está localizado na posição: "+numeros.get(n));
		}	
		else if (n != numeros.size()) {
				System.out.println("\nSorry... "+n+" does not match any number.");
				while (n != numeros.size()) {
					System.out.println("\nInsert a new integer: ");
					newnumber = leia.nextInt();
					
					if (newnumber == numeros.size()) {
						System.out.println("\nO número "+newnumber+" está localizado na posição: "+numeros.get(n));
					}
											
		}
		
		} 			
			/* fim do programa.*/
		}}
		
		
		
	
