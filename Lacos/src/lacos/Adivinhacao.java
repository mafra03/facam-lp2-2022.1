package lacos;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(100) + 1;

		int palpite = 0;
		
		System.out.println("Jogo da Adivinha��o");
		System.out.println();
		System.out.println("Estou pensando em um n�mero de 1 a 100.");
		
		Scanner teclado = new Scanner(System.in);
		
		while (palpite != numero) {
		
			System.out.print("Qual �? ");
			palpite = teclado.nextInt();
			
			if (palpite == numero) {
				System.out.println("Voc� acertou!");
				System.out.print("Quer tentar novamente (S/N)? ");
				String resposta = teclado.next();
				if (resposta.equals("S")) {
					numero = aleatorio.nextInt(100) + 1;
					palpite = 0;
				}
			}
			else if (palpite < numero) {
				System.out.println("Voc� errou. O n�mero � maior.");
			}
			else {
				System.out.println("Voc� errou. O n�mero � menor.");
			}
			
		}
		
		
		System.out.println("Obrigado por participar.");
		
		teclado.close();

	}

}
