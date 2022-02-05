package notaaluno;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int nota1;
		int nota2;
		float media;

		System.out.println("digite a primeira nota ");
		nota1 = teclado.nextInt();
		while (nota1 < 0  ||    nota1 > 10)  {
			System.out.println("digite uma nota de 0 a 10 ");
			nota1 = teclado.nextInt();
		}
		System.out.println("digite a segunda nota ");
		nota2 = teclado.nextInt();
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("digite uma nota de 0 a 10 ");
			nota2 = teclado.nextInt();
		}
		media = (nota1 + nota2)/2;
		System.out.println("sua nota foi " + media);
		if((media >= 7)) {
			System.out.println("parabéns!! você foi aprovado ");
		}
		else { 
		if((media >= 5) &&  (media < 7) ) {
			System.out.println("vocÊ ficou de recuperação ");
		}
		else {
		System.out.println("você foi reprovado , estude mais e tente novamente ");


		}

		}
			}

		}

	


