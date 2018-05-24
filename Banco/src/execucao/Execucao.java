package execucao;

import modelo.Agencia;
import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

public class Execucao {
	public static void main(String[] args) {
		
		Agencia ag1 = new Agencia("91");
		Conta con1 = new Conta("001",0.0,"20/05/2017",ag1);
		Cliente c1 = new Cliente("94010390204","rua fulana","98879687","Reinaldo","10/07/88",con1);
		ContaCorrente cc = new ContaCorrente();
		
		
		
		cc.depositar(1000);
		cc.sacar(100);
		cc.imprimir();
	
			
	}

}
