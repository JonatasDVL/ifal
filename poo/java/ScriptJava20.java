package ScriptsJava;

public class ScriptJava20 {
	
	//Fiz um programa que imprimi os fatoriais 1 a 10
	public static void main(String[] args) {

	//criando uma v�riavel
        
		int fatorial = 1;
			
		for ( int n = 1; n <= 10; n++ ) {
		    fatorial = n * fatorial;
			System.out.println("O fatorial de " + n + " � " + fatorial + ". ");

            
}
}	
}              

/*

resultados do console:

O fatorial de 1 � 1. 
O fatorial de 2 � 2. 
O fatorial de 3 � 6. 
O fatorial de 4 � 24. 
O fatorial de 5 � 120. 
O fatorial de 6 � 720. 
O fatorial de 7 � 5040. 
O fatorial de 8 � 40320. 
O fatorial de 9 � 362880. 
O fatorial de 10 � 3628800. 
 
*/
