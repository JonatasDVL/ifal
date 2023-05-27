package ScriptsJava;

public class BalancoTrimestral2  {

	public static void main(String[] args) {
		
		//declarando o valor dos meses e do trimestre 
		int gastosJaneiro;
		gastosJaneiro = 15000;
		int gastosFevereiro;
		gastosFevereiro = 23000;
		int gastosMarço;
		gastosMarço = 17000;
		
		int gastosTrimestre;
		gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarço);
		
		int mediaMensal;
		mediaMensal = (gastosTrimestre/3);
		
		//imprimindo na tela o total do valor do trimestre e a média mensal
		System.out.println("O total do gasto do primeiro trimestre é de " + gastosTrimestre + " reais.");
		System.out.println("A média do gasto mensal é de " + mediaMensal + " reais.");
	}
}
