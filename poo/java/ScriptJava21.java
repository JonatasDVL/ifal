package ScriptsJava;

public class ScriptJava21 {
	
	//Fiz um programa que imprimi a s�rie de Fibonacci
	public static void main(String[] args) {

	//criando uma v�riavel, o loop e imprimindo
		
		int n = 0;
		int x = 1;
		
		while(n + x < 100){
			System.out.println(" S�rie de Fibonacci " + n + ".");
			x = n + x ;
			System.out.println(" S�rie de Fibonacci " + x + "."); 
			n = x + n ;
	
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
 
*/
