package modelo;

public class Conta {

	private double saldo;
	private String dataAbert;
	private Agencia agencia;

	public Conta(double pSaldo, String pDataAbert, Agencia pAgencia) {
		this.saldo = 0.0;
		this.dataAbert = pDataAbert;
		this.agencia = pAgencia;

	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public void sacar(double valor) {
		System.out.println("Realizando saque de R$: " + valor + " da conta");
		if (valor > 0) {
			if (saldo >= valor) {
				saldo = saldo - valor;

			}

		}
	}
	public void transferir(double valor, ContaPoupanca cp) {
		if (cp instanceof ContaPoupanca) {
			if (saldo >= valor) {
				saldo = saldo - valor;
				cp.depositar(valor);
			} else {
				System.out.println("não foi possivel");
			}

		}
	}

	public void depositar(double valor) {
		System.out.println("Realizando deposito de: " + valor);
		if (valor >= 0) {
			this.saldo = saldo + valor;

		} else {
			System.out.println("O valor do deposito deve ser positivo");
		}

	}

	public void mostrarSaldo() {
		System.out.println("==============Dados da Conta============================");
		System.out.println("Data de abertura:" + dataAbert);
		this.getAgencia().mostrarAgencia();

	}

}