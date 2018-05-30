package modelo;

import java.util.Calendar;

public class ContaCorrente extends Conta {

	
	private double taxa;
			
	public ContaCorrente(String pCodigo,double pSaldo, String pDataAbert, Agencia pAgencia,double jurosTaxa) {
		this.taxa = jurosTaxa;
	}
	

	public double getJurosRend() {
		return taxa;
	}
	public void setJurosRend(double jurosRend) {
		this.taxa= jurosRend;
	}
	
	@Override
	public void depositar(double valor) {
		Calendar dia = Calendar.getInstance();
		System.out.println("Realizando deposito de: R$"+valor+" Na conta corrente");
		if(valor >= 0) {
			this.taxa = taxa + valor;
			
			//Descontar 30 reais no dia 30 de cada mês
			if(dia.get(Calendar.DAY_OF_MONTH) == 30) {
				System.out.println("Menos Taxa de manutenção de 30 reais");	
				this.taxa -= 30;	
			}
		}else {
			System.out.println("O valor do deposito deve ser positivo");
		}
	}
	@Override
	public void sacar(double valor) {
		
		System.out.println("Realizando saque de R$: "+ valor +" da conta");
		if(valor > 0) {
			if(taxa >= valor) {
				taxa = taxa -  valor;
			}
		}
	}
	public void imprimirContaCorrente() {
		System.out.println("============Dados da conta corrente===========");
		System.out.println("saldo: "+ this.taxa);
		
	}
}

