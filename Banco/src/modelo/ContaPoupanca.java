package modelo;

public class ContaPoupanca extends Conta {

	private double jurosRend;

	public ContaPoupanca(double saldo, String dataAbert, Agencia agencia, double juros) {
		super(saldo, dataAbert, agencia);
		this.jurosRend = juros;

	}

	@Override
	public void sacar(double valor) {
		System.out.println("Realizando saque de R$: " + valor + " da conta");
		if (valor > 0) {
			if (jurosRend >= valor) {
				jurosRend = jurosRend - valor;

			}
		}
	}

	@Override
	public void depositar(double valor) {
		System.out.println("depositado R$: " + valor+"Na conta Poupanca");
		if (valor >= 0) {
			this.jurosRend = jurosRend + valor;

		} else {
			System.out.println("O valor do deposito deve ser positivo");
		}

	}

	public void mostrarPoupanca() {
		System.out.println("===== Rendimento da poupanca====");
		System.out.println("Saldo: " + jurosRend);

	}

}