package ScriptsJava;

public class Quest�o4 {

	public static void main(String[] args) {

		LivroDeBiblioteca livrinho = new LivroDeBiblioteca();
		livrinho.nome = "A raposa";
		livrinho.autor = "J�natas Duarte";
		livrinho.genero = "Fantasia";
		livrinho.paginas = 117;
		livrinho.emprestado = false;

		
		System.out.println(" O nome do livro: " + livrinho.nome + ".");
		System.out.println(" O autor do livro: " + livrinho.autor + ".");
		System.out.println(" O g�nero do livro: " + livrinho.genero + ".");
		System.out.println(" A quantidade de p�ginas do livro: " + livrinho.paginas + " paginas.");
		if(livrinho.emprestado == true){
			System.out.println(" O livro est� emprestado .");
		}else {
			System.out.println(" O livro n�o est� emprestado .");

	}

}
}