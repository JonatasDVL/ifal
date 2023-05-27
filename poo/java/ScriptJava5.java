package ScriptsJava;

public class ScriptJava5 {

	//Fiz um programa colocando algumas informações sobre o Pi utilizando os comandos int, float, long e double
	public static void main(String[] args) {
		
		//Definindo as variáveis, fazendo o Casting entre float e int e fazendo a promoção entre int e double e também com int e long
		float número1 = 3.14f;
		int número2 = (int) número1;
		long  número3 = número2*1000000 + 141592;
		double número4 = número2 + 0.141592;
		
		//Imprimindo as variáveis e texto
		System.out.println(" O Pi tem o valor de " + número4 + "...");
		System.out.println(" Os primeiros dígitos do número Pi é " + número3 + "..." + ", porém normalmente o Pi é arredondado para " + número1 + " ou " + número2 + ".");

	}
}
