package adivinheonumero;

import java.util.Scanner;
import java.lang.Math;
public class Numerosortiado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sortiado = (int)(Math.random() * 100 ) + 1;
int jogada;
int tentativas = 1;
Scanner teclado = new Scanner(System.in);

System.out.println("bem vindo ao jogo Sortiado " );
System.out.println("tente acertar o n�mero escolhido pelo computador ");
System.out.println("Digite um n�mero entre 0 e 100 ");
jogada = teclado.nextInt();

while(jogada < 0 ) {
System.out.println("ops voc� jogou um n�mero negativo , por favor digite um n�mero maior que 0 ");
jogada = teclado.nextInt();
}

while(jogada != sortiado ) {

if(jogada < 0) {
	System.out.println("ops voc� jogou um n�mero negativo , por favor digitar um n�mero maior que 0 ");
jogada = teclado.nextInt();
}
System.out.println("continue tentando");
if(jogada < sortiado ) {

System.out.println("o n�mero � maior ");
jogada = teclado.nextInt();
}
	else {
System.out.println("o n�mero � menor ");
jogada = teclado.nextInt();
	}
tentativas++;
}
System.out.println("voc� acertou ");
System.out.println("voc� jogou " + tentativas + "vezes");


	}

}
