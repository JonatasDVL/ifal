package ScriptsJava;

public class Animais {

	public static void main(String[] args) {
		Cachorro c = new Cachorro(); 
		Gato g = new Gato();

		c.setNome("Toto");
		c.setIdade(7);
		c.setPeso(9.71f);
		c.setSexo("Macho");
		g.setNome("Mingau");
		g.setIdade(5);
		g.setPeso(5.67f); 
		g.setSexo("F�mea");

		System.out.println(c.toAn()); 
		
		System.out.println("Meu cachorro est�:");
		c.locomover();
		System.out.println("Meu cachorro est� fazendo:");
		c.emitirsom();
		System.out.println("Meu cachorro est�:");
		c.alimentar();
		
		System.out.println(g.toAn());
	
		System.out.println("Meu gato est�:");
		g.locomover();
		System.out.println("Meu gato est� fazendo:");
		g.emitirsom();		
		System.out.println("Meu gato est�:");
		g.alimentar();

		


	}
}