package ScriptsJava;

import java.util.Scanner;

public class Quest�o1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		L�mpada led = new L�mpada();
		led.pre�o = 15.99;
		led.marca = "Taschibra";
		led.modelo = "Taschibra Prime LED 900";
		led.serie = 14378526;
		led.voltagem = 200;
		led.ligada = true;
		
		System.out.println("O pre�o da l�mpada: " + led.pre�o + " reais.");
		System.out.println("A marca da l�mpada: " + led.marca + ".");
		System.out.println("O modelo da l�mpada: " + led.modelo + ".");
		System.out.println("A serie da l�mpada: " + led.serie + ".");
		System.out.println("O voltagem da l�mpada: " + led.voltagem + "volts.");

		int n = 0;
		
		led.mostrarEstado();

		if(led.ligada == false) {
			System.out.println("Voc� quer ligar a l�mpada? se sim digite 1:");
			n= ler.nextInt();
			if(n == 1) {
				led.alterarEstado();
				led.mostrarEstado();
			}else{
				System.out.println("Certo, a l�mpada continua desligada.");
				}
		}else{
			System.out.println("Voc� quer desligar a l�mpada? se sim digite 2:");
			n= ler.nextInt();
			if(n == 2) {
				led.alterarEstado();
				led.mostrarEstado();
			}else{
				System.out.println("Certo, a l�mpada continua ligada.");

			
			}
		}

}}
