package ScriptsJava;

public class Quest�o3 {

	public static void main(String[] args) {

		LivroDeLivraria livrinho = new LivroDeLivraria();
		livrinho.pre�o = 21.99;
		livrinho.nome = "A raposa";
		livrinho.autor = "J�natas Duarte";
		livrinho.genero = "Fantasia";
		livrinho.paginas = 117;
		
		System.out.println(" O pre�o do livro: " + livrinho.pre�o + " reais.");
		System.out.println(" O nome do livro: " + livrinho.nome + ".");
		System.out.println(" O autor do livro: " + livrinho.autor + ".");
		System.out.println(" O g�nero do livro: " + livrinho.genero + ".");
		System.out.println(" A quantidade de p�ginas do livro: " + livrinho.paginas + " paginas.");

	}

}
