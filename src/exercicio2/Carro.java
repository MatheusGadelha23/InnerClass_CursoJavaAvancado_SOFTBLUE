package exercicio2;

/**
 * @author Matheus Gadelha
 * Classe que tem como fun��o 'ligar o motor de um carro'
 */
public class Carro {
	
	//Cria a Regular Inner Class
	private class Motor{
		
		private boolean ligado = false;
		
		//Cria o m�todo 'ligar' que quando chamado, seta o valor do atributo 'ligado' para 'true'
		//e mostra na tela o valor do atributo
		void ligar(){
			ligado = true;
			System.out.println("Ligado = " + ligado);
		}
	}
	
	//Cria o m�todo 'ligarMotor' que internamente instancia um objeto da classe 'Motor'
	//e depois chama o m�todo 'ligar' dessa mesma classe
	public void ligarMotor() {
		Motor motor = new Motor();
		motor.ligar();
	}

}
