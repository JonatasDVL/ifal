package ScriptsJava;

import java.util.Scanner;

public class ScriptJava14 {
	
	//Fiz um programa que imprimi um dia da semana 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	//criando uma váriavel
		        
        int diaSemana;
            System.out.println("Digite um número, entre 1 e 7: ");
            diaSemana = ler.nextInt();
            
            //Imprimindo os números e o dia da semana
            if( diaSemana == 1 ){
                System.out.println("Como seu número foi " + diaSemana + ", logo o dia da semana é Domingo. ");
            }else{ 
                if( diaSemana == 2 ){
	                System.out.println("Como seu número foi " + diaSemana + ", logo o dia da semana é Segunda-Feira. ");
                }else{ 
	                if( diaSemana == 3 ){
		                System.out.println("Como seu número foi " + diaSemana + ", logo o dia da semana é Terça-Feira. ");
	                }else{ 
		                if( diaSemana == 4 ){
			                System.out.println("Como seu número foi " + diaSemana + ", logo o dia da semana é Quarta-Feira. ");	 
		                }else{ 
			                if( diaSemana == 5 ){
				                System.out.println("Como seu número foi " + diaSemana + ", logo o dia da semana é Quinta-Feira. ");		
			                }else{ 
				                if( diaSemana == 6 ){
					                System.out.println("Como seu número foi " + diaSemana + ", logo o dia da semana é Sexta-Feira. ");
				                }else{ 
					                if( diaSemana == 7 ) {
						            	System.out.println("Como seu número foi " + diaSemana + ", logo o dia da semana é Sábado. ");
						            }else {
						            	System.out.println("Você não digitou o número, entre 1 e 7. ");
						            }
				                }
			                }
		                }
	                }
                }
            }
        }
	}
	
                

/*

resultado do console:

Digite um número, entre 1 e 7: 
1
Como seu número foi 1, logo o dia da semana é Domingo. 

ou

Digite um número, entre 1 e 7: 
2
Como seu número foi 2, logo o dia da semana é Segunda-Feira. 

ou

Digite um número, entre 1 e 7: 
3
Como seu número foi 3, logo o dia da semana é Terça-Feira. 

ou

Digite um número, entre 1 e 7: 
4
Como seu número foi 4, logo o dia da semana é Quarta-Feira. 

ou

Digite um número, entre 1 e 7: 
5
Como seu número foi 5, logo o dia da semana é Quinta-Feira. 

ou

Digite um número, entre 1 e 7: 
6
Como seu número foi 6, logo o dia da semana é Sexta-Feira. 

ou

Digite um número, entre 1 e 7: 
7
Como seu número foi 7, logo o dia da semana é Sábado. 

ou

Digite um número, entre 1 e 7: 
8 
Você não digitou o número, entre 1 e 7. 
 
*/
