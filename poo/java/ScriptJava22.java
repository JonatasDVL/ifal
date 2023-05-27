package ScriptsJava;

public class ScriptJava22 {
	
	//Fiz um programa que imprimi um calculo caso for par e outro calculo caso for impar
	public static void main(String[] args) {

	//criando uma váriavel, comando e imprimindo
		
		
		int x = 7;
		
		while(x != 1) {
			
		if(x % 2 == 0){
			x = x / 2;
			System.out.println(x); 
		}else {
			x = 3 * x + 1;
			System.out.println(x); 

		}
	
	}
			            
}
	
}
/*

resultados do console:

22
11
34
17
52
26
13
40
20
10
5
16
8
4
2
1


*/
