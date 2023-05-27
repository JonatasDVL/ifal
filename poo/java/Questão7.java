package ScriptsJava;

import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		AtributosAluno aluno = new AtributosAluno();
		
		System.out.println("Digite seu nome: ");
		aluno.nomeAluno = ler.next();
		
		System.out.println("Digite seu número de matrícula: ");
		aluno.numeroMatricula = ler.nextInt();
		
		System.out.println("Digite o nome do seu curso: ");
		aluno.curso = ler.next();
        
        for (int i=0; i<aluno.nomeDisciplina.length; i++) {
            System.out.println("Digite o nome da disciplina: ");
            aluno.nomeDisciplina[i] = ler.next();
        }
		
		for (int i=0; i<aluno.notaDisciplina.length; i++) {
			System.out.println("Notas da disciplina: " + aluno.nomeDisciplina[i]);
			for (int j=0; j<aluno.notaDisciplina[i].length; j++) {
				System.out.println("Digite a nota da disciplina: ");
				aluno.notaDisciplina[i][j] = ler.nextDouble();
				
		}
			}
		
		aluno.mostrarInfomaçãoAluno();
		
		for (int i=0; i<aluno.nomeDisciplina.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Na disciplina " +aluno.nomeDisciplina[i] + " o aluno foi aprovado!");
			} else {
				System.out.println("Na disciplina " +aluno.nomeDisciplina[i] + " o aluno foi reprovado!");
			}
		}

		

}
}

