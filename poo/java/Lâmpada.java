package ScriptsJava;

public class L�mpada {
		
	double pre�o;
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
			System.out.println("A l�mpada est� ligada.");
		}else {
			System.out.println("A l�mpada est� desligada.");

	}}
	
	void alterarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
			
	}}
	
}