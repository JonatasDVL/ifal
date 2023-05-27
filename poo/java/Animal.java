package ScriptsJava;

public abstract class Animal {
	
	private String nome;
	private int idade;
	private float peso;
	private String sexo;

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
	public float getPeso() { 
		return peso;
}	
	public void setPeso(float peso) { 
		this.peso = peso;
}
	
	public String getSexo() { 
		return sexo;
}	
	public void setSexo(String sexo) { 
		this.sexo = sexo;
}
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirsom();
	
	public String toAn() {
		return "Dados{ "+"nome= "+ nome+ ", idade= "+ idade + ", peso= " + peso + ", sexo= " + sexo + "} ";
	}
}
