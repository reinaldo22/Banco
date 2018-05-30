package execucao;

import modelo.Agencia;
import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Execucao {
	public static void main(String[] args) {
		Agencia ag1 = new Agencia("001");
		ContaCorrente cc1 = new ContaCorrente("002", 0.0, "15/12/98", ag1, 0.0);
		Cliente corrente1 = new Cliente("8798", "rua fulana", "090", "Eu", "12/10/99",cc1);
		ContaCorrente cc2 = new ContaCorrente("002", 0.0, "15/12/98", ag1, 0.0);
		Cliente corrente2 = new Cliente("8798", "rua ciclano", "090", "Eu", "12/10/99",cc2);
		
		
		ContaPoupanca cpp2 = new ContaPoupanca("002", 0.0, ag1, "13/9/00", 1.0);
		Cliente poupanca1 = new Cliente("94010390204", "Rua mogi", "p97709", "poupançudo", "12/10/99", cpp2);
		
		/*corrente1.mostrarDadosCliente();
		corrente1.depositarCorrente(500);
		corrente1.sacarCorrente(400);
		corrente1.saldoCorrente();
		
		corrente2.mostrarDadosCliente();
		corrente2.depositarCorrente(600);
		corrente2.sacarCorrente(550);
		corrente2.saldoCorrente();
		*/
		
		poupanca1.mostrarDadosCliente();
		poupanca1.depositoPoupanca(500);
		poupanca1.sacaPoupanca(100);
		poupanca1.mostrarPoupanca();
		
	

		
		
	}

}