package ScriptsJava;

public class ScriptJava5 {

	//Fiz um programa colocando algumas informa��es sobre o Pi utilizando os comandos int, float, long e double
	public static void main(String[] args) {
		
		//Definindo as vari�veis, fazendo o Casting entre float e int e fazendo a promo��o entre int e double e tamb�m com int e long
		float n�mero1 = 3.14f;
		int n�mero2 = (int) n�mero1;
		long  n�mero3 = n�mero2*1000000 + 141592;
		double n�mero4 = n�mero2 + 0.141592;
		
		//Imprimindo as vari�veis e texto
		System.out.println(" O Pi tem o valor de " + n�mero4 + "...");
		System.out.println(" Os primeiros d�gitos do n�mero Pi � " + n�mero3 + "..." + ", por�m normalmente o Pi � arredondado para " + n�mero1 + " ou " + n�mero2 + ".");

	}
}
