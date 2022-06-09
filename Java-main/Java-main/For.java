//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

//for= ele tem um ponto inicial e vai ate o um ponto final se a condição ser verdadeira eu execulto o bloco se nao for ele sai do bloco

package LacoDeRepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		int x, divisao=11;
		
		for(x=1000;x<=1999;x++){
			System.out.printf("\n %d",x); // "%d" ele chama o valor do tipo inteiro, se nao colocar ele nao vai rodar
			
		}if (x!=5){
			
			System.out.printf("\n %d",divisao);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
