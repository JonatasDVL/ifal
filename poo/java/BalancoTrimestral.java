package ScriptsJava;

public class BalancoTrimestral  {

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
		
		//imprimindo na tela o total do valor do trimestre
		System.out.println("O total do gasto do primeiro trimestre � " + gastosTrimestre + " reais.");
	}
}
