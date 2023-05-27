package ScriptsJava;

public class Lâmpada {
		
	double preço;
	String modelo;
	String marca;
	int serie;
	double voltagem;
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if(ligada) {
			System.out.println("A lâmpada está ligada.");
		}else {
			System.out.println("A lâmpada está desligada.");

	}}
	
	void alterarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
			
	}}
	
}