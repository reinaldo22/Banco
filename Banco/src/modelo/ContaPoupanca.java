package modelo;

public class ContaPoupanca extends Conta{

	private String dataAniver;
	private double jurosRend;

	
	
	public ContaPoupanca(String pCodigo,double pSaldo,Agencia pAgencia , String pDataAniver,double juros) {
		super("",0.0,"",pAgencia);
		this.dataAniver = pDataAniver;
		this.jurosRend = juros;
	}
	@Override
	public void sacar(double valor) {
		System.out.println("Realizando saque de R$: "+ valor +" da conta");
		if(valor > 0) {
			if(jurosRend >= valor) {
				jurosRend = jurosRend -  valor;		
				
			}	
		}
	}
	
	
	@Override
	public void depositar(double valor) {
		System.out.println("Realizando deposito de: "+valor);
		if(valor >= 0) {
			this.jurosRend = jurosRend+ valor;
			
		}else {
			System.out.println("O valor do deposito deve ser positivo");
		}
	
	}
	public void mostrarPoupanca() {
		System.out.println("===== Rendimento da poupanca====");
		System.out.println("Saldo: "+jurosRend);
		System.out.println("Data Aniversario "+ this.dataAniver);
		this.getAgencia().mostrarCodigo();
		
	}
	
}