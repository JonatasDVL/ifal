package ScriptsJava;

public class Quest�o2 {

	public static void main(String[] args) {

		Livro livrinho = new Livro();
		livrinho.pre�odeFabrica = 15.99;
		livrinho.nome = "A raposa";
		livrinho.autor = "J�natas Duarte";
		livrinho.genero = "Fantasia";
		livrinho.paginas = 117;
		
		System.out.println(" O pre�o de fabrica do livro: " + livrinho.pre�odeFabrica + " reais.");
		System.out.println(" O nome do livro: " + livrinho.nome + ".");
		System.out.println(" O autor do livro: " + livrinho.autor + ".");
		System.out.println(" O g�nero do livro: " + livrinho.genero + ".");
		System.out.println(" A quantidade de p�ginas do livro: " + livrinho.paginas + " paginas.");

	}

}
