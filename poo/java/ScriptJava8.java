package ScriptsJava;

public class ScriptJava8 {

	public static void main(String[] args) {

		//Declarando as variáveis caneta, corretivo e etc.
		float valorCaneta = 2.95f;
		float valorCorretivo = 3.50f;
		float valorTotal = valorCaneta + valorCorretivo;
		float taxaCalculada = valorTotal * 0.0825f ;
		float novaCaneta = valorCaneta + taxaCalculada ;
		float novoCorretivo = valorCorretivo + taxaCalculada;
		float novoCusto = novaCaneta + novoCorretivo ;
		boolean muitoCaro = novoCusto>10; 
		
		//Imprimindo as variáveis e os textos.
		System.out.println(" A caneta custa " + valorCaneta + " reais. ");
		System.out.println(" O corretivo custa " + valorCorretivo + " reais. ");
		System.out.println(" O valor da caneta mais o corretivo é " + valorTotal + " reais. ");
		System.out.println(" O valor da taxa calculada do total é " + taxaCalculada + " reais. ");
		System.out.println(" O novo valor da caneta é " + novaCaneta + " reais. ");
		System.out.println(" O novo valor do corretivo é " + novoCorretivo + " reais. ");
		System.out.println(" O novo valor do custo total é " + novoCusto + " reais. ");
		System.out.println(" A soma total entre os valores é muito caro. ");
		System.out.println(" A afirmação anterior está " + muitoCaro +".");
		
//professora fiquei com dúvida se podia usar o if nesta questão então não coloquei, mas se pudesse teria ficado assim:
    
	// if (muitoCaro == false) {
	//	 System.out.println(" O novo valor não está tão caro. ");
	// }else {
	//	 System.out.println(" O novo valor está caro. ");
//}
		
}
}	


//resultado do console:

// A caneta custa 2.95 reais. 
// O corretivo custa 3.5 reais. 
// O valor da caneta mais o corretivo é 6.45 reais. 
// O valor da taxa calculada do total é 0.532125 reais. 
// O novo valor da caneta é 3.482125 reais. 
// O novo valor do corretivo é 4.032125 reais. 
// O novo valor do custo total é 7.51425 reais. 
// A soma total entre os valores é muito caro. 
// A afirmação anterior está false.