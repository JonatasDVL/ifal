package ScriptsJava;

public class ScriptJava6 {

	//Fiz um programa que verifica se tenho mais de 18 anos e se eu posso dirigir 
	public static void main(String[] args) {

		//Definindo as variáveis
		int idade = 16;
		boolean habilitação = false;
		
		//Imprimindo as variáveis e os textos, segundo a condição.
		
		if (idade > 17 && habilitação == true) {
				System.out.println(" Você é maior de idade, pois você tem " + idade + " anos.");
				System.out.println(" Como você é maior de idade e tem habilitação, logo você pode dirigir!");
	}	if (idade > 17 && habilitação == false) {
				System.out.println(" Você tem "+ idade + " anos, logo você é maior de idade.");
				System.out.println(" Porém você não tem a habilitação, então você não pode dirigir!");
	}	if (idade < 18) {
				System.out.println(" Você tem "+ idade + " anos, logo você é menor de idade.");
				System.out.println(" Como você não tem a habilitação e é menor de idade, então você não pode dirigir!");

}
}
}	


//resultado do console:

// Você tem 16 anos, logo você é menor de idade.
// Como você não tem a habilitação e é menor de idade, então você não pode dirigir!

//O resultado do console foi esse, pois coloquei que tenho 16 anos, caso eu fosse maior de idade e tivesse habilitação o resultado seria esse:

// Você é maior de idade, pois você tem 18 anos.
// Como você é maior de idade e tem habilitação, logo você pode dirigir!

//Outro resultado do console poderia seria se eu fosse maior de idade e não tivesse habilitação, o resultado seria esse:

// Você tem 18 anos, logo você é maior de idade.
// Porém você não tem a habilitação, então você não pode dirigir!

