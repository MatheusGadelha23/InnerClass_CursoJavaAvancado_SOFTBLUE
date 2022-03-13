package exercicio1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Matheus Gadelha 
 * Classe principal da Aplicação
 */
public class Aplicacao {
	
	public static void main(String[] args) {
		
		System.out.println("----Utilizando classe anônima----");
		//Cria uma lista de números
		List<Integer> listaDeNumeros = Arrays.asList(23, 15, 21, 02, 10, 13);
		
		//Chama o método 'sort' da Classe 'Collections' passando uma lista e um Comparator como parâmetros
		Collections.sort(listaDeNumeros, new Comparator<Integer>(){	
			@Override
			//Implementa o método 'compare' da Interface 'Comparator'
			public int compare(Integer o1, Integer o2) {
				//Retorna um inteiro como resultado da comparação entre os objetos
				return o1.compareTo(o2);
			}	
		});
		
		//Itera sobre os elementos da lista mostrando os mesmos na tela
		for (Integer list: listaDeNumeros) {
			System.out.print(list + " ");
		}
		
		System.out.println("\n\n----Utilizando classe interna estática----");
		//Cria mais uma lista de números
		List<Integer> listaDeNumeros2 = Arrays.asList(23, 15, 21, 02, 10, 13);
		
		//Instancia um objeto do tipo da classe estática interna 'MyInner'
		MyInner classeEstaticaInterna = new MyInner();
		//Chama o método 'sort' da Classe 'Collections' passando uma lista e o objeto do tipo 'MyInner' instanciado
		Collections.sort(listaDeNumeros2, classeEstaticaInterna);
		
		//Itera sobre os elementos da lista 2 mostrando os mesmos na tela
		for (Integer list: listaDeNumeros2) {
			System.out.print(list + " ");
		}
		
		System.out.println("\n\n----Utilizando Method Local----");
		//Cria um classe do tipo 'Method Local' que implementa da Interface 'Comparator'
		class MyInner2 implements Comparator<Integer>{
			
			//Implementa o método 'compare' da Interface 'Comparator'
			@Override
			public int compare(Integer o1, Integer o2) {
				//Retorna um inteiro como resultado da comparação entre os objetos
				return o1.compareTo(o2);
			}	
		}
		
		//Cria mais uma lista de números
		List<Integer> listaDeNumeros3 = Arrays.asList(23, 15, 21, 02, 10, 13);
		
		//Instacia um objeto do tipo da classe Method Local 'MyInner2'
		MyInner2 methodLocal = new MyInner2();
		//Chama o método 'sort' da Classe 'Collections' passando uma lista e o objeto do tipo 'MyInner2' instanciado
		Collections.sort(listaDeNumeros3, methodLocal);
		
		//Itera sobre os elementos da lista 3 mostrando os mesmos na tela
		for (Integer list: listaDeNumeros3) {
			System.out.print(list + " ");
		}
	}
	
	//Cria classe estática 'MyInner' que implementa a Interface 'Comparator'
	public static class MyInner implements Comparator<Integer>{
		
		//Implementa o método 'compare' da Interface 'Comparator'
		@Override
		public int compare(Integer o1, Integer o2) {
			//Retorna um inteiro como resultado da comparação entre os objetos
			return o1.compareTo(o2);
		}
	}
}
