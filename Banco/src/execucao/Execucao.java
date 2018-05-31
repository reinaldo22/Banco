package execucao;

import modelo.Agencia;
import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Execucao {
	public static void main(String[] args) {
		
		Agencia ag = new Agencia("p99809");
		ContaCorrente cc = new ContaCorrente(0.0, "12-1-22",ag);
		ContaPoupanca cp = new ContaPoupanca(0.0,"9869",ag,0.1);
		Cliente c1 = new Cliente("p89898", "Rua cogumelo","190", "joao", "18/05/1290",cc,cp);
		
		
		c1.depositarCorrente(500);
		c1.trasnfereCorrente(200, cp);
		c1.saldoCorrente();
		c1.saldoPoupanca();
	}

}