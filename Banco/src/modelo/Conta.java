package modelo;

import java.util.ArrayList;

public class Conta {

	private double saldo;
	private String dataAbert;
	private Agencia agencia;

	private ArrayList<Historico> history;

	public Conta(double pSaldo, String pDataAbert, Agencia pAgencia) {
		this.saldo = 0.0;
		this.dataAbert = "";
		this.agencia = pAgencia;

	}

	public Conta() {

	}

	public void sacar(double valor) {
		System.out.println("Realizando saque de R$: " + valor + " da conta");
		if (valor > 0) {
			if (saldo >= valor) {
				saldo = saldo - valor;

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

	public void mostrarHistorico(Historico histo) {

	}

	public void mostrarSaldo() {
		System.out.println("==============Dados da Conta============================");
		System.out.println("Saldo : R$" + saldo);
		System.out.println("Data de abertura:" + dataAbert);
		System.out.println("agencia:" + agencia.getCodigo());

	}

}