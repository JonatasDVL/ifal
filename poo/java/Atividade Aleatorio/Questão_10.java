package ScriptsJava;

public class ScriptJava21 {
	
	//Fiz um programa que imprimi a série de Fibonacci
	public static void main(String[] args) {

	//criando uma váriavel, o loop e imprimindo
		
		int n = 0;
		int x = 1;
		
		while(n + x < 100){
			System.out.println(" Série de Fibonacci " + n + ".");
			x = n + x ;
			System.out.println(" Série de Fibonacci " + x + "."); 
			n = x + n ;
	
		}
	
	}
			            
}              

/*

resultados do console:

 Série de Ficonacci 0.
 Série de Ficonacci 1.
 Série de Ficonacci 1.
 Série de Ficonacci 2.
 Série de Ficonacci 3.
 Série de Ficonacci 5.
 Série de Ficonacci 8.
 Série de Ficonacci 13.
 Série de Ficonacci 21.
 Série de Ficonacci 34.
 Série de Ficonacci 55.
 Série de Ficonacci 89.
 
*/
