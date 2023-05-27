package ScriptsJava;

import java.util.Scanner;

public class ScriptJava17 {
	
	//Fiz um programa que imprimi um mes do ano
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	//criando uma váriavel e utilizando o 
        
		int mesAno = 17;
		System.out.println("Digite 0, para parar o programa. ");
		
		while ( mesAno != 0 ) {
            System.out.println("Digite um número, entre 1 e 12: ");
            mesAno = ler.nextInt();
            switch (mesAno) {
            
            case 0:
            	System.out.println("Você digitou 0, logo você parou o programa. ");
                break;
            case 1:
                System.out.println("Como seu número foi 1, logo o mês do ano é Janeiro. ");
                break;
            case 2:  
            	System.out.println("Como seu número foi 2, logo o mês do ano é Fervereiro. ");
            	break;
            case 3:
		        System.out.println("Como seu número foi 3, logo o mês do ano é Março. ");
			    break;   
            case 4:
		        System.out.println("Como seu número foi 4, logo o mês do ano é Abril. ");	 
		        break;
            case 5:
		        System.out.println("Como seu número foi 5, logo o mês do ano é Maio. ");		
			    break;   
            case 6:
		        System.out.println("Como seu número foi 6, logo o dia da semana é Junho. ");
				break;                
            case 7:
				System.out.println("Como seu número foi 7, logo o mês do ano é Julho. ");
				break;
            case 8:
				System.out.println("Como seu número foi 8, logo o mês do ano é Agosto. ");
				break;
            case 9:
				System.out.println("Como seu número foi 9, logo o mês do ano é Setembro. ");
				break;
            case 10:
				System.out.println("Como seu número foi 10, logo o mês do ano é Outubro. ");
				break;
            case 11:
				System.out.println("Como seu número foi 11, logo o mês do ano é Novembro. ");
				break;
            case 12:
				System.out.println("Como seu número foi 12, logo o mês do ano é Dezembro. ");
				break;
			default:
		        System.out.println("Você não digitou o número, entre 1 e 12. ");
						           
        }
    }
}
}	
                

/*

resultados do console:

Digite um número, entre 1 e 12: 
0
Você digitou 0, logo você parou o programa. 

ou

Digite um número, entre 1 e 12: 
1
Como seu número foi 1, logo o mês do ano é Janeiro.

ou

Digite um número, entre 1 e 12: 
2
Como seu número foi 2, logo o mês do ano é Fervereiro.

ou

Digite um número, entre 1 e 12: 
3
Como seu número foi 3, logo o mês do ano é Março. 

ou

Digite um número, entre 1 e 12: 
4
Como seu número foi 4, logo o mês do ano é Abril. 

ou

Digite um número, entre 1 e 12: 
5
Como seu número foi 5,  logo o mês do ano é Maio. 

ou

Digite um número, entre 1 e 12: 
6
Como seu número foi 6, logo o mês do ano é Junho. 

ou

Digite um número, entre 1 e 12: 
7
Como seu número foi 7, logo o mês do ano é Julho.

ou

Digite um número, entre 1 e 12: 
8 
Como seu número foi 8, logo o mês do ano é Agosto.

ou

Digite um número, entre 1 e 12: 
9
Como seu número foi 8, logo o mês do ano é Setembro.

ou

Digite um número, entre 1 e 12: 
10
Como seu número foi 8, logo o mês do ano é Outubro.

ou

Digite um número, entre 1 e 12: 
11
Como seu número foi 8, logo o mês do ano é Novembro.

ou

Digite um número, entre 1 e 12: 
12 
Como seu número foi 8, logo o mês do ano é Dezembro.

ou

Digite um número, entre 1 e 12: 
13
Você não digitou o número, entre 1 e 12. 
 
*/
