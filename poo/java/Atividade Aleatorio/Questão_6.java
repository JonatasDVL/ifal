package ScriptsJava;

public class ScriptJava20 {
	
	//Fiz um programa que imprimi os fatoriais 1 a 10
	public static void main(String[] args) {

	//criando uma váriavel
        
		int fatorial = 1;
			
		for ( int n = 1; n <= 10; n++ ) {
		    fatorial = n * fatorial;
			System.out.println("O fatorial de " + n + " é " + fatorial + ". ");

            
}
}	
}              

/*

resultados do console:

O fatorial de 1 é 1. 
O fatorial de 2 é 2. 
O fatorial de 3 é 6. 
O fatorial de 4 é 24. 
O fatorial de 5 é 120. 
O fatorial de 6 é 720. 
O fatorial de 7 é 5040. 
O fatorial de 8 é 40320. 
O fatorial de 9 é 362880. 
O fatorial de 10 é 3628800. 
 
*/
