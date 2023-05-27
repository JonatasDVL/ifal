package ScriptsJava;

public class Questão2 {

	public static void main(String[] args) {

		Livro livrinho = new Livro();
		livrinho.preçodeFabrica = 15.99;
		livrinho.nome = "A raposa";
		livrinho.autor = "Jônatas Duarte";
		livrinho.genero = "Fantasia";
		livrinho.paginas = 117;
		
		System.out.println(" O preço de fabrica do livro: " + livrinho.preçodeFabrica + " reais.");
		System.out.println(" O nome do livro: " + livrinho.nome + ".");
		System.out.println(" O autor do livro: " + livrinho.autor + ".");
		System.out.println(" O gênero do livro: " + livrinho.genero + ".");
		System.out.println(" A quantidade de páginas do livro: " + livrinho.paginas + " paginas.");

	}

}
