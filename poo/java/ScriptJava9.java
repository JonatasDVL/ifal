package ScriptsJava;

public class ScriptJava9 {

	public static void main(String[] args) {

		//Declarando as variaveis.
		long long1 = 100;
		int int1 = 200;
		//int int2 = long1 + int1; - esse c�digo est� errado, pois int2 � uma condi��o do tipo int e com isso n�o consegue adicionar
		long int2 = long1 + int1;  //uma vari�vel do tipo long, por�m se murdamos o int pelo long, ai sim poder� adicionar o outro long
		
		//Imprimindo as vari�veis e o textos.
		System.out.println(" O valor long1 � " + long1 + ". ");
		System.out.println(" O valor int1 � " + int1 + ". ");
		System.out.println(" O valor entre a soma de long1 e int1 � " + int2 + ". ");
		
}
}
	


//resultado do console:

// O valor long1 � 100. 
//O valor int1 � 200. 
//O valor entre a soma de long1 e int1 � 300. 
