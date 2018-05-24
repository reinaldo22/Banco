package modelo;

 public class Conta {
	
	private String codigo;
	private double saldo;
	private String dataAbert;
	private Agencia agencia;
	
	public Conta(String pCodigo,double pSaldo, String pDataAbert, Agencia pAgencia) {
		this.codigo = "";
		this.saldo = 0.0;
		this.dataAbert = "";
		this.agencia = getAgencia();
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
	
	public void mostrarHistorico() {
		
	}

	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public void mostrarSaldo() {
		System.out.println("==============Dados da Conta============================");
		System.out.println("Código:"+codigo);
		System.out.println("Saldo : R$"+ saldo);
		System.out.println("Data de abertura:"+dataAbert);
		System.out.println("Agencia: "+agencia.getCodigo());
		
		
	}
}
