package ScriptsJava;

public class ScriptJava6 {

	//Fiz um programa que verifica se tenho mais de 18 anos e se eu posso dirigir 
	public static void main(String[] args) {

		//Definindo as vari�veis
		int idade = 16;
		boolean habilita��o = false;
		
		//Imprimindo as vari�veis e os textos, segundo a condi��o.
		
		if (idade > 17 && habilita��o == true) {
				System.out.println(" Voc� � maior de idade, pois voc� tem " + idade + " anos.");
				System.out.println(" Como voc� � maior de idade e tem habilita��o, logo voc� pode dirigir!");
	}	if (idade > 17 && habilita��o == false) {
				System.out.println(" Voc� tem "+ idade + " anos, logo voc� � maior de idade.");
				System.out.println(" Por�m voc� n�o tem a habilita��o, ent�o voc� n�o pode dirigir!");
	}	if (idade < 18) {
				System.out.println(" Voc� tem "+ idade + " anos, logo voc� � menor de idade.");
				System.out.println(" Como voc� n�o tem a habilita��o e � menor de idade, ent�o voc� n�o pode dirigir!");

}
}
}	


//resultado do console:

// Voc� tem 16 anos, logo voc� � menor de idade.
// Como voc� n�o tem a habilita��o e � menor de idade, ent�o voc� n�o pode dirigir!

//O resultado do console foi esse, pois coloquei que tenho 16 anos, caso eu fosse maior de idade e tivesse habilita��o o resultado seria esse:

// Voc� � maior de idade, pois voc� tem 18 anos.
// Como voc� � maior de idade e tem habilita��o, logo voc� pode dirigir!

//Outro resultado do console poderia seria se eu fosse maior de idade e n�o tivesse habilita��o, o resultado seria esse:

// Voc� tem 18 anos, logo voc� � maior de idade.
// Por�m voc� n�o tem a habilita��o, ent�o voc� n�o pode dirigir!

