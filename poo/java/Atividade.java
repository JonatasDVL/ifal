package ScriptsJava;

public class Atividade {

	public static void main(String[] args) {
		
		//Definindo as vari�veis, fazendo o Casting entre float e int e fazendo a promo��o entre int e double e tamb�m com int e long
		float n�mero1 = 1.1f;
		int n�mero2 = (int) n�mero1;
		long  n�mero3 = n�mero2 + 1111110;
		double n�mero4 = n�mero2 + 0.111111;
		
		//Imprimindo as vari�veis e texto
		System.out.println(" Valor de int � " + n�mero2);
		System.out.println(" Valor de float � " + n�mero1);
		System.out.println(" Valor de long � " + n�mero3);
		System.out.println(" Valor de double � " + n�mero4);

	}
}
