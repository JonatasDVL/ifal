package ScriptsJava;

public class BalancoTrimestral  {

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
		
		//imprimindo na tela o total do valor do trimestre
		System.out.println("O total do gasto do primeiro trimestre é " + gastosTrimestre + " reais.");
	}
}
