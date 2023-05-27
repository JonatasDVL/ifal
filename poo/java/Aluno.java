package ScriptsJava;

public class Aluno extends Pessoa {

	private int matricula;
	private String curso;

	public void cancelarMatri() {
		System.out.println("Mátricula será cancelada! ");
}
	
	public int getMatricula() { 
		return matricula;
}	
	public void setMatricula(int matricula) { 
		this.matricula = matricula;		
}	
	public String getCurso() { 
		return curso;
}	
	public void setCurso(String curso) { 
		this.curso = curso;		

}
	
	public String toAl() {
		return "Dados{ " + "matricula= " + matricula + ", curso= " + curso + "} ";
	}
}