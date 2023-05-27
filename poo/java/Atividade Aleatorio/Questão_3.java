package ScriptsJava;

import java.util.Scanner;

public class ScriptJava17 {
	
	//Fiz um programa que imprimi um mes do ano
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	//criando uma v�riavel e utilizando o 
        
		int mesAno = 17;
		System.out.println("Digite 0, para parar o programa. ");
		
		while ( mesAno != 0 ) {
            System.out.println("Digite um n�mero, entre 1 e 12: ");
            mesAno = ler.nextInt();
            switch (mesAno) {
            
            case 0:
            	System.out.println("Voc� digitou 0, logo voc� parou o programa. ");
                break;
            case 1:
                System.out.println("Como seu n�mero foi 1, logo o m�s do ano � Janeiro. ");
                break;
            case 2:  
            	System.out.println("Como seu n�mero foi 2, logo o m�s do ano � Fervereiro. ");
            	break;
            case 3:
		        System.out.println("Como seu n�mero foi 3, logo o m�s do ano � Mar�o. ");
			    break;   
            case 4:
		        System.out.println("Como seu n�mero foi 4, logo o m�s do ano � Abril. ");	 
		        break;
            case 5:
		        System.out.println("Como seu n�mero foi 5, logo o m�s do ano � Maio. ");		
			    break;   
            case 6:
		        System.out.println("Como seu n�mero foi 6, logo o dia da semana � Junho. ");
				break;                
            case 7:
				System.out.println("Como seu n�mero foi 7, logo o m�s do ano � Julho. ");
				break;
            case 8:
				System.out.println("Como seu n�mero foi 8, logo o m�s do ano � Agosto. ");
				break;
            case 9:
				System.out.println("Como seu n�mero foi 9, logo o m�s do ano � Setembro. ");
				break;
            case 10:
				System.out.println("Como seu n�mero foi 10, logo o m�s do ano � Outubro. ");
				break;
            case 11:
				System.out.println("Como seu n�mero foi 11, logo o m�s do ano � Novembro. ");
				break;
            case 12:
				System.out.println("Como seu n�mero foi 12, logo o m�s do ano � Dezembro. ");
				break;
			default:
		        System.out.println("Voc� n�o digitou o n�mero, entre 1 e 12. ");
						           
        }
    }
}
}	
                

/*

resultados do console:

Digite um n�mero, entre 1 e 12: 
0
Voc� digitou 0, logo voc� parou o programa. 

ou

Digite um n�mero, entre 1 e 12: 
1
Como seu n�mero foi 1, logo o m�s do ano � Janeiro.

ou

Digite um n�mero, entre 1 e 12: 
2
Como seu n�mero foi 2, logo o m�s do ano � Fervereiro.

ou

Digite um n�mero, entre 1 e 12: 
3
Como seu n�mero foi 3, logo o m�s do ano � Mar�o. 

ou

Digite um n�mero, entre 1 e 12: 
4
Como seu n�mero foi 4, logo o m�s do ano � Abril. 

ou

Digite um n�mero, entre 1 e 12: 
5
Como seu n�mero foi 5,  logo o m�s do ano � Maio. 

ou

Digite um n�mero, entre 1 e 12: 
6
Como seu n�mero foi 6, logo o m�s do ano � Junho. 

ou

Digite um n�mero, entre 1 e 12: 
7
Como seu n�mero foi 7, logo o m�s do ano � Julho.

ou

Digite um n�mero, entre 1 e 12: 
8 
Como seu n�mero foi 8, logo o m�s do ano � Agosto.

ou

Digite um n�mero, entre 1 e 12: 
9
Como seu n�mero foi 8, logo o m�s do ano � Setembro.

ou

Digite um n�mero, entre 1 e 12: 
10
Como seu n�mero foi 8, logo o m�s do ano � Outubro.

ou

Digite um n�mero, entre 1 e 12: 
11
Como seu n�mero foi 8, logo o m�s do ano � Novembro.

ou

Digite um n�mero, entre 1 e 12: 
12 
Como seu n�mero foi 8, logo o m�s do ano � Dezembro.

ou

Digite um n�mero, entre 1 e 12: 
13
Voc� n�o digitou o n�mero, entre 1 e 12. 
 
*/
