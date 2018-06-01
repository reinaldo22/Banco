package modelo;

import java.util.Calendar;

public class ContaCorrente extends Conta {

	private double taxa;
	private double saldoCor;

	public ContaCorrente(double pSaldo, String pDataAbert, Agencia pAgencia) {
		super(pSaldo, pDataAbert, pAgencia);
		this.taxa = taxa;
		this.saldoCor = saldoCor;
	}

	public double getJurosRend() {
		return taxa;
	}

	public void setJurosRend(double jurosRend) {
		this.taxa = jurosRend;
	}

	@Override
	public void depositar(double valor) {
		Calendar dia = Calendar.getInstance();
		System.out.println("Realizando deposito de: R$" + valor + " Na conta corrente");
		if (valor >= 0) {
			this.taxa = taxa + valor;

			// Descontar 30 reais no dia 30 de cada mês
			if (dia.get(Calendar.DAY_OF_MONTH) == 20) {
				System.out.println("Menos Taxa de manutenção de 30 reais");
				this.taxa -= 30;
			}
		} else {
			System.out.println("O valor do deposito deve ser positivo");
		}
	}

	@Override
	public void sacar(double valor) {

		System.out.println("Realizando saque de R$: " + valor + " da conta");
		if (valor > 0) {
			if (taxa >= valor) {
				taxa = taxa - valor;
			}
		}
	}
	@Override
	public void transferir(double valor, ContaPoupanca cp) {
		if (cp instanceof ContaPoupanca) {
			if (taxa >= valor) {
				taxa = taxa - valor;
				cp.depositar(valor);
			} else {
				System.out.println("não foi possivel");
			}

		}
	}

	public void imprimirContaCorrente() {
		System.out.println("============Dados da conta corrente===========");
		System.out.println("saldo: " + this.taxa);
		this.getAgencia().mostrarAgencia();
	}

}
