package execucao;

import modelo.Agencia;
import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Execucao {
	public static void main(String[] args) {
		
		Agencia ag = new Agencia("p99809");
		Conta conta = new Conta(0.0, "19/09/9", ag);
		ContaCorrente cc = new ContaCorrente(0.0, "12-1-22",ag);
		ContaPoupanca cp = new ContaPoupanca(0.0,"9869",ag,1.0);
		Cliente c1 = new Cliente("p89898", "Rua cogumelo","190", "joao", "18/05/1290",cc,cp);
		
		//Transações da conta corrente
		c1.mostrarDadosCliente();
		c1.depositarCorrente(1000);
		c1.sacarCorrente(200);
		c1.saldoCorrente();
		c1.trasnfereCorrente(100, cp);
		c1.saldoCorrente();
		
		//Transaçoes conta Poupanca
		c1.mostrarDadosCliente();
		c1.saldoPoupanca();
		c1.sacaPoupanca(50.0);
		c1.saldoPoupanca();
		
		
		
		
	}

}