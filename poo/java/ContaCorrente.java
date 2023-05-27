package ScriptsJava;

public class ContaCorrente {
	
	int numeroConta;
	int numeroBanco;
	double saldo;
	boolean eEspecial;
	double limiteEspecial;
	
		void saca(double quantidade) {
			double novoSaldo = this.saldo-quantidade;	
		this.saldo = novoSaldo; 	 	
		
		}
		
		void deposita(double quantidade) {
			double novoSaldo = this.saldo-quantidade;	
		this.saldo += quantidade;

		}

}
			            



