package ScriptsJava;

public class BalancoTrimestral2  {

	public static void main(String[] args) {
		
		//declarando o valor dos meses e do trimestre 
		int gastosJaneiro;
		gastosJaneiro = 15000;
		int gastosFevereiro;
		gastosFevereiro = 23000;
		int gastosMar�o;
		gastosMar�o = 17000;
		
		int gastosTrimestre;
		gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMar�o);
		
		int mediaMensal;
		mediaMensal = (gastosTrimestre/3);
		
		//imprimindo na tela o total do valor do trimestre e a m�dia mensal
		System.out.println("O total do gasto do primeiro trimestre � de " + gastosTrimestre + " reais.");
		System.out.println("A m�dia do gasto mensal � de " + mediaMensal + " reais.");
	}
}
