package ScriptsJava;

public class ProjetoPessoas {
	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
	
		p1.setNome("João");
		p2.setNome("Maria");
		p3.setNome("Paulo");
		p4.setNome("Eduarda");
		
		p1.setIdade(12);
		p2.setIdade(15);
		p3.setIdade(27);
		p4.setIdade(23);
		
		p1.setSexo("Masculino");
		p2.setSexo("Feminino");
		p3.setSexo("Masculino");
		p4.setSexo("Feminino");
		
		p2.setMatricula(15745841);
		p2.setCurso("Informática");
		
		p3.setEspecialidade("Informática");
		p3.setSalario(3500);
		
		p4.setSetor("Limpeza");
		p4.setTrabalhando(true);
		
		
		p2.cancelarMatri();
		p3.receberAumento(234.50f);
		p4.mudaTrabalho();
		
		
		System.out.println("1 " + p1.toPe());
		System.out.println("2 " + p2.toPe());
		System.out.println("2 " + p2.toAl());
		System.out.println("3 " + p3.toPe());
		System.out.println("3 " + p3.toPr());
		System.out.println("4 " + p4.toPe());
		System.out.println("4 " + p4.toFu());

		
	}
	
}
