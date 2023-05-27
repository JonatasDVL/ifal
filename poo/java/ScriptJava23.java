package ScriptsJava;

public class ScriptJava23 {
	
	//Fiz um programa que imprimi a série de Fibonacci
	public static void main(String[] args) {

	//criando uma váriavel, o loop e imprimindo
		
		int num1 = 0;
		int num2 = 1;
		int fibonacci;
		
		for(int i = 0; i < 13;i++) {
			System.out.println(" Série de Fibonacci " + num1 + ".");
			fibonacci = num1;
			num1 = num1 + num2;
			num2 = fibonacci;

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
 Série de Fibonacci 144.
 
*/
