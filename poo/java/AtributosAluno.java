package ScriptsJava;

public class AtributosAluno {
	
	String nomeAluno;
	int numeroMatricula;
	String curso;	
	String [] nomeDisciplina = new String [3];
	double [] [] notaDisciplina = new double [3][4];

	void mostrarInfomaçãoAluno() {
		System.out.println("Nome: " + nomeAluno);
		System.out.println("Nome do curso: " + curso);
		System.out.println("Matrícula: " + numeroMatricula);

		for (int i = 0; i< notaDisciplina.length; i++) {
			System.out.println("Notas da disciplina: " + nomeDisciplina[i]);
			for (int j=0; j<notaDisciplina[i].length; j++) {
				System.out.println(notaDisciplina[i][j] + " ");
			}
		}
			System.out.println();

	}
	
	boolean verificarAprovado(int indice) {
		double soma = 0;
		for (int i = 0; i<notaDisciplina[indice].length; i++) {
			soma += notaDisciplina[indice][i];
		}
			
		double media = soma / 4;
		if (media >=7) {
			return true;
		} else {
			return false;
		}
	
	
}
}			            



