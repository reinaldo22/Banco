package modelo;

import java.util.ArrayList;

public class Cliente {

	private String cpf;
	private String end;
	private String tel;
	private String nome;
	private String dataNasc;
	private ContaCorrente cc;
	private ContaPoupanca cp;
	private ArrayList<Historico> history;

	public Cliente(String pCpf, String pEnd, String pTel, String pNome, String pDataNasc) {
		this.cpf = pCpf;
		this.end = pEnd;
		this.tel = pTel;
		this.nome = pNome;
		this.dataNasc = pDataNasc;
	}

	public Cliente(String pCpf, String pEnd, String pTel, String pNome, String pDataNasc, ContaCorrente cc,ContaPoupanca cp) {
		this.cpf = pCpf;
		this.end = pEnd;
		this.tel = pTel;
		this.nome = pNome;
		this.dataNasc = pDataNasc;
		this.cc = cc;
		this.cp = cp;
	}
	public Cliente(String pCpf, String pEnd, String pTel, String pNome, String pDataNasc, ContaCorrente cc) {
		this.cpf = pCpf;
		this.end = pEnd;
		this.tel = pTel;
		this.nome = pNome;
		this.dataNasc = pDataNasc;
		this.cc = cc;
	}
	public Cliente(String pCpf, String pEnd, String pTel, String pNome, String pDataNasc,ContaPoupanca cp) {
		this.cpf = pCpf;
		this.end = pEnd;
		this.tel = pTel;
		this.nome = pNome;
		this.dataNasc = pDataNasc;
		this.cp = cp;
	}

	public Cliente() {
		this.cpf = "";
		this.end = "";
		this.tel = "";
		this.nome = "";
		this.dataNasc = "";

	}

	public void depositarCorrente(double valor) {
		this.cc.depositar(valor);
	}

	public void sacarCorrente(double valor) {
		this.cc.sacar(valor);
	}

	public void saldoCorrente() {
		cc.imprimirContaCorrente();
	}

	public void trasnfereCorrente(double valor, ContaPoupanca cp) {
		cc.transferir(valor, cp);
	}

	public void saldoPoupanca() {
		cp.mostrarPoupanca();
	}

	public void depositoPoupanca(double valor) {
		cp.depositar(valor);
	}

	public void sacaPoupanca(double valor) {
		cp.sacar(valor);
	}

	public void mostrarPoupanca() {
		cp.mostrarPoupanca();

	}

	public void mostrarDadosCliente() {
		System.out.println("==============Dados do Cliente==================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf:" + this.cpf);
		System.out.println("Endereco:" + this.end);
		System.out.println("Telefone:" + this.tel);
		System.out.println("Data de Nascimento:" + this.dataNasc);
		System.out.println("");

	}
}