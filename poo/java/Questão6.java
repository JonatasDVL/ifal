package ScriptsJava;

public class Quest�o6 {

	public static void main(String[] args) {

		ContatoCelular contato = new ContatoCelular();
		contato.numero = "82993745093";
		contato.nome = "J�natas Duarte";
		contato.email = "jonatasdvl@hotmail.com";
		contato.redeSocial = true;
		contato.instagram = "jonatasdvl";
		contato.facebook = "J�natas Duarte";

		
		System.out.println(" O n�mero de celular: " + contato.numero + ".");
		System.out.println(" O nome do us�ario: " + contato.nome + ".");
		System.out.println(" O email cadastrado no aparelho: " + contato.email + ".");
		if(contato.redeSocial == true){
			System.out.println(" O instagram registrado no aparelho: " + contato.instagram + ".");
			System.out.println(" O facebook registrado no aparelho: " + contato.facebook + ".");
		}else {
			System.out.println(" N�o t�m rede sociais registrado no aparelho.");

}
}
}