package ScriptsJava;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Lâmpada led = new Lâmpada();
		led.preço = 15.99;
		led.marca = "Taschibra";
		led.modelo = "Taschibra Prime LED 900";
		led.serie = 14378526;
		led.voltagem = 200;
		led.ligada = true;
		
		System.out.println("O preço da lâmpada: " + led.preço + " reais.");
		System.out.println("A marca da lâmpada: " + led.marca + ".");
		System.out.println("O modelo da lâmpada: " + led.modelo + ".");
		System.out.println("A serie da lâmpada: " + led.serie + ".");
		System.out.println("O voltagem da lâmpada: " + led.voltagem + "volts.");

		int n = 0;
		
		led.mostrarEstado();

		if(led.ligada == false) {
			System.out.println("Você quer ligar a lâmpada? se sim digite 1:");
			n= ler.nextInt();
			if(n == 1) {
				led.alterarEstado();
				led.mostrarEstado();
			}else{
				System.out.println("Certo, a lâmpada continua desligada.");
				}
		}else{
			System.out.println("Você quer desligar a lâmpada? se sim digite 2:");
			n= ler.nextInt();
			if(n == 2) {
				led.alterarEstado();
				led.mostrarEstado();
			}else{
				System.out.println("Certo, a lâmpada continua ligada.");

			
			}
		}

}}
