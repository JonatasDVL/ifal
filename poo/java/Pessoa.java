package ScriptsJava;

public class Pessoa {

	//Atributo
	private String nome;
	private int idade;
	private String sexo;

	public void fazerAniversario() {
		this.idade ++;
	}
	
		public String getNome() { 
			return nome;
	}	
		public void setNome(String nome) { 
			this.nome = nome;		
	}
		public int getIdade() { 
			return idade;
	}	
		public void setIdade(int idade) { 
			this.idade = idade;		
	}	
		public String getSexo() { 
			return sexo;
	}	
		public void setSexo(String sexo) { 
			this.sexo = sexo;		
}
	
		public String toPe() {
			return "Dados{ "+"nome= "+ nome+ ", idade= "+ idade + ", sexo= " + sexo + "} ";
		}
	
	
}
