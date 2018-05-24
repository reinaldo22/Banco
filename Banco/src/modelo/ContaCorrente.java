package modelo;

public class ContaCorrente extends Conta {

	private String dataAniver;
	private double jurosRend;
	
	public ContaCorrente(String pCodigo, double pSaldo, String pDataAbert, Agencia pAgencia,String pDataNiver, double pJuros) {
		super("001",0.0, "", pAgencia);
		this.jurosRend = pJuros;
		this.dataAniver = pDataNiver;
		
		
	}
	public ContaCorrente() {
		this.dataAniver = "";
		
	}

	

	public String getDataAniver() {
		return dataAniver;
	}
	public void setDataAniver(String dataAniver) {
		this.dataAniver = dataAniver;
	}
	public double getJurosRend() {
		return jurosRend;
	}
	public void setJurosRend(double jurosRend) {
		this.jurosRend = jurosRend;
	}
	
	@Override
	public void depositar(double valor) {
		System.out.println("Realizando deposito de: "+valor);
		if(valor >= 0) {
			this.jurosRend = jurosRend + valor;
			
		}else {
			System.out.println("O valor do deposito deve ser positivo");
		}
	}
	@Override
	public void sacar(double valor) {
		System.out.println("Realizando saque de R$: "+ valor +" da conta");
		if(valor > 0) {
			if(jurosRend > valor) {
				this.jurosRend = (jurosRend -  valor);
				System.out.println("Menos Taxa de manutenção de 30 reais");
				this.jurosRend -= 30;
				
	}
	}
	}
	public void imprimir() {
		System.out.println("dados da conta corrente!!!");
		System.out.println("data do aniversario da conta: "+this.dataAniver);
		System.out.println("saldo: "+ this.jurosRend);
		
	}
}


