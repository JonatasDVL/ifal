package ScriptsJava;

public class Atividade {

	public static void main(String[] args) {
		
		//Definindo as variáveis, fazendo o Casting entre float e int e fazendo a promoção entre int e double e também com int e long
		float número1 = 1.1f;
		int número2 = (int) número1;
		long  número3 = número2 + 1111110;
		double número4 = número2 + 0.111111;
		
		//Imprimindo as variáveis e texto
		System.out.println(" Valor de int é " + número2);
		System.out.println(" Valor de float é " + número1);
		System.out.println(" Valor de long é " + número3);
		System.out.println(" Valor de double é " + número4);

	}
}
