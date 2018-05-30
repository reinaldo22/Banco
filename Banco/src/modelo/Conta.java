package modelo;

import java.util.ArrayList;

public  class Conta {
	
	
	private double saldo;
	private String dataAbert;
	private Agencia agencia;
	
	
	public Conta(String pCodigo,double pSaldo, String pDataAbert, Agencia pAgencia) {
		this.saldo = 0.0;
		this.dataAbert = "";
		this.agencia = pAgencia;
		
	}
	public Conta() {
		
	}
	public void sacar(double valor) {
		System.out.println("Realizando saque de R$: "+ valor +" da conta");
		if(valor > 0) {
			if(saldo >= valor) {
				saldo = saldo -  valor;	
				
				
			}
			
		}
	}
	public void depositar(double valor ) {
		System.out.println("Realizando deposito de: "+valor);
		if(valor >= 0) {
			this.saldo = saldo + valor;
			
		}else {
			System.out.println("O valor do deposito deve ser positivo");
		}
		
	}
	
	public void mostrarHistorico(Historico histo ) {
		
		this.historico.add(histo);
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDataAbert() {
		return dataAbert;
	}
	public void setDataAbert(String dataAbert) {
		this.dataAbert = dataAbert;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public ArrayList<Historico> getHistorico() {
		return historico;
	}
	public void setHistorico(ArrayList<Historico> historico) {
		this.historico = historico;
	}
	public void mostrarSaldo() {
		System.out.println("==============Dados da Conta============================");
		System.out.println("Saldo : R$"+ saldo);
		System.out.println("Data de abertura:"+dataAbert);
		System.out.println("agencia:"+agencia.getCodigo());
		
		
		
	}
	public void transferir(double valor,Conta c1){
		if (c1 instanceof ContaCorrente){
			if(valor >= this.saldo){
				saldo-=valor;
				c1.saldo += valor;
			}
			else{
				System.out.println("não foi possivel");
			}
				
		}		
	}
	
	
}