package ScriptsJava;

import java.util.Scanner;

public class ScriptJava14 {
	
	//Fiz um programa que imprimi um dia da semana 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	//criando uma v�riavel
		        
        int diaSemana;
            System.out.println("Digite um n�mero, entre 1 e 7: ");
            diaSemana = ler.nextInt();
            
            //Imprimindo os n�meros e o dia da semana
            if( diaSemana == 1 ){
                System.out.println("Como seu n�mero foi " + diaSemana + ", logo o dia da semana � Domingo. ");
            }else{ 
                if( diaSemana == 2 ){
	                System.out.println("Como seu n�mero foi " + diaSemana + ", logo o dia da semana � Segunda-Feira. ");
                }else{ 
	                if( diaSemana == 3 ){
		                System.out.println("Como seu n�mero foi " + diaSemana + ", logo o dia da semana � Ter�a-Feira. ");
	                }else{ 
		                if( diaSemana == 4 ){
			                System.out.println("Como seu n�mero foi " + diaSemana + ", logo o dia da semana � Quarta-Feira. ");	 
		                }else{ 
			                if( diaSemana == 5 ){
				                System.out.println("Como seu n�mero foi " + diaSemana + ", logo o dia da semana � Quinta-Feira. ");		
			                }else{ 
				                if( diaSemana == 6 ){
					                System.out.println("Como seu n�mero foi " + diaSemana + ", logo o dia da semana � Sexta-Feira. ");
				                }else{ 
					                if( diaSemana == 7 ) {
						            	System.out.println("Como seu n�mero foi " + diaSemana + ", logo o dia da semana � S�bado. ");
						            }else {
						            	System.out.println("Voc� n�o digitou o n�mero, entre 1 e 7. ");
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

Digite um n�mero, entre 1 e 7: 
1
Como seu n�mero foi 1, logo o dia da semana � Domingo. 

ou

Digite um n�mero, entre 1 e 7: 
2
Como seu n�mero foi 2, logo o dia da semana � Segunda-Feira. 

ou

Digite um n�mero, entre 1 e 7: 
3
Como seu n�mero foi 3, logo o dia da semana � Ter�a-Feira. 

ou

Digite um n�mero, entre 1 e 7: 
4
Como seu n�mero foi 4, logo o dia da semana � Quarta-Feira. 

ou

Digite um n�mero, entre 1 e 7: 
5
Como seu n�mero foi 5, logo o dia da semana � Quinta-Feira. 

ou

Digite um n�mero, entre 1 e 7: 
6
Como seu n�mero foi 6, logo o dia da semana � Sexta-Feira. 

ou

Digite um n�mero, entre 1 e 7: 
7
Como seu n�mero foi 7, logo o dia da semana � S�bado. 

ou

Digite um n�mero, entre 1 e 7: 
8 
Voc� n�o digitou o n�mero, entre 1 e 7. 
 
*/
