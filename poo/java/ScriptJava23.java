package ScriptsJava;

public class ScriptJava23 {
	
	//Fiz um programa que imprimi a s�rie de Fibonacci
	public static void main(String[] args) {

	//criando uma v�riavel, o loop e imprimindo
		
		int num1 = 0;
		int num2 = 1;
		int fibonacci;
		
		for(int i = 0; i < 13;i++) {
			System.out.println(" S�rie de Fibonacci " + num1 + ".");
			fibonacci = num1;
			num1 = num1 + num2;
			num2 = fibonacci;

		}
	
	}
			            
}              

/*

resultados do console:

 S�rie de Ficonacci 0.
 S�rie de Ficonacci 1.
 S�rie de Ficonacci 1.
 S�rie de Ficonacci 2.
 S�rie de Ficonacci 3.
 S�rie de Ficonacci 5.
 S�rie de Ficonacci 8.
 S�rie de Ficonacci 13.
 S�rie de Ficonacci 21.
 S�rie de Ficonacci 34.
 S�rie de Ficonacci 55.
 S�rie de Ficonacci 89.
 S�rie de Fibonacci 144.
 
*/
