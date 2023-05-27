package ScriptsJava;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ContaCorrente conta = new ContaCorrente();
		conta.numeroConta = 1732586248;
		conta.numeroBanco = 0057;
		conta.saldo = 567.50;
		conta.eEspecial = true;
		conta.limiteEspecial = 2500;
		
		System.out.println("O número da conta: " + conta.numeroConta + ".");
		System.out.println("O número do banco: " + conta.numeroBanco + ".");
		System.out.println("O saldo da conta: " + conta.saldo + " reais.");
		if(conta.eEspecial == true){
			System.out.println("A conta é especial.");
			System.out.println("O limite da conta especial: " + conta.limiteEspecial + " reais.");
		}else {
			System.out.println("A conta não é especial.");
		}	
		
		double valor = 0;
		int n = 0;
		
		if(conta.saldo > 0) {
			System.out.println("Você quer sacar algum valor? se sim digite 1:");
			n= ler.nextInt();
			if(n == 1) {
				System.out.println("Você quer sacar quanto?");
				valor= ler.nextInt();
				if(valor < conta.saldo) {
					conta.saca(valor);
					System.out.println("O saldo da após o saque: " + conta.saldo + " reais.");
				}else { }
					System.out.println("Não foi possivel solicitar o saque, pois o valor do saque é maior que o saldo.");
			}else {
				System.out.println(" Certo, o saldo da conta continua sendo" + conta.saldo + " reais.");
			}
			}
			
			System.out.println("Você quer depositar algum valor? se sim digite 1:");
			n= ler.nextInt();
			if(n == 1) {
				System.out.println("Você quer depositar quanto?");
				valor= ler.nextInt();
				conta.deposita(valor);
				System.out.println("O saldo da após o depósito: " + conta.saldo + " reais.");
			}else {
				System.out.println(" Certo, o saldo da conta continua sendo" + conta.saldo + " reais.");
			}
		
}
}