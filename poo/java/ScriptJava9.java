package ScriptsJava;

public class ScriptJava9 {

	public static void main(String[] args) {

		//Declarando as variaveis.
		long long1 = 100;
		int int1 = 200;
		//int int2 = long1 + int1; - esse código está errado, pois int2 é uma condição do tipo int e com isso não consegue adicionar
		long int2 = long1 + int1;  //uma variável do tipo long, porém se murdamos o int pelo long, ai sim poderá adicionar o outro long
		
		//Imprimindo as variáveis e o textos.
		System.out.println(" O valor long1 é " + long1 + ". ");
		System.out.println(" O valor int1 é " + int1 + ". ");
		System.out.println(" O valor entre a soma de long1 e int1 é " + int2 + ". ");
		
}
}
	


//resultado do console:

// O valor long1 é 100. 
//O valor int1 é 200. 
//O valor entre a soma de long1 e int1 é 300. 
