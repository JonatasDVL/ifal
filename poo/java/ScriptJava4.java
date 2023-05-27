package ScriptsJava;

public class ScriptJava4 {

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
		
		//imprimir na tela o total do valor
		System.out.println("O total do gasto do primeiro trimestre é "+ gastosTrimestre +" reais.");
	}
}
