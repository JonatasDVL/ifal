package ScriptsJava;

public class ScriptJava13 {
	//Fiz um programa que imprimi os números entre 1 e 1000
	public static void main(String[] args) {

	//criando uma váriavel
		
	int i = 1;
				
	//Imprimindo os números entre 1 e 1000 e criando o loop
		
		while ( i < 1001 ) {
			int soma = i + 1;
			System.out.println( " A soma entre " + i + " mais 1 é " + soma + ". " );
			i = i + 1;

		}
	}	
}

/*

resultado do console:

 A soma entre 1 mais 1 é 2. 
 A soma entre 2 mais 1 é 3. 
 A soma entre 3 mais 1 é 4.  
 ...                  ...
 A soma entre 997 mais 1 é 998. 
 A soma entre 998 mais 1 é 999. 
 A soma entre 999 mais 1 é 1000.

*/
