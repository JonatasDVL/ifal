package ScriptsJava;

public class ScriptJava8 {

	public static void main(String[] args) {

		//Declarando as vari�veis caneta, corretivo e etc.
		float valorCaneta = 2.95f;
		float valorCorretivo = 3.50f;
		float valorTotal = valorCaneta + valorCorretivo;
		float taxaCalculada = valorTotal * 0.0825f ;
		float novaCaneta = valorCaneta + taxaCalculada ;
		float novoCorretivo = valorCorretivo + taxaCalculada;
		float novoCusto = novaCaneta + novoCorretivo ;
		boolean muitoCaro = novoCusto>10; 
		
		//Imprimindo as vari�veis e os textos.
		System.out.println(" A caneta custa " + valorCaneta + " reais. ");
		System.out.println(" O corretivo custa " + valorCorretivo + " reais. ");
		System.out.println(" O valor da caneta mais o corretivo � " + valorTotal + " reais. ");
		System.out.println(" O valor da taxa calculada do total � " + taxaCalculada + " reais. ");
		System.out.println(" O novo valor da caneta � " + novaCaneta + " reais. ");
		System.out.println(" O novo valor do corretivo � " + novoCorretivo + " reais. ");
		System.out.println(" O novo valor do custo total � " + novoCusto + " reais. ");
		System.out.println(" A soma total entre os valores � muito caro. ");
		System.out.println(" A afirma��o anterior est� " + muitoCaro +".");
		
//professora fiquei com d�vida se podia usar o if nesta quest�o ent�o n�o coloquei, mas se pudesse teria ficado assim:
    
	// if (muitoCaro == false) {
	//	 System.out.println(" O novo valor n�o est� t�o caro. ");
	// }else {
	//	 System.out.println(" O novo valor est� caro. ");
//}
		
}
}	


//resultado do console:

// A caneta custa 2.95 reais. 
// O corretivo custa 3.5 reais. 
// O valor da caneta mais o corretivo � 6.45 reais. 
// O valor da taxa calculada do total � 0.532125 reais. 
// O novo valor da caneta � 3.482125 reais. 
// O novo valor do corretivo � 4.032125 reais. 
// O novo valor do custo total � 7.51425 reais. 
// A soma total entre os valores � muito caro. 
// A afirma��o anterior est� false.