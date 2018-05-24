package modelo;

public class Cliente {

	private String cpf;
	private String end;
	private String tel;
	private String nome;
	private String dataNasc;
	private Conta contaPessoal;
	
	public 	Cliente (String pCpf,String pEnd,String pTel,String pNome,String pDataNasc,Conta pContaPessoal) {
		this.cpf = pCpf;
		this.end = pEnd;
		this.tel = pTel;
		this.nome = pNome;
		this.dataNasc = pDataNasc;
		this.dataNasc = pDataNasc;
		this.contaPessoal = pContaPessoal;
		
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEnd() {
		return end;
	}



	public void setEnd(String end) {
		this.end = end;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getDataNasc() {
		return dataNasc;
	}



	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}



	public Conta getContaPessoal() {
		return contaPessoal;
	}



	public void setContaPessoal(Conta contaPessoal) {
		this.contaPessoal = contaPessoal;
	}



	public void mostrarDados() {
		System.out.println("==============Dados do Cliente==================");
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf:"+this.cpf);
		System.out.println("Endereco:"+this.end);
		System.out.println("Telefone:"+this.tel);
		System.out.println("Data de Nascimento:"+this.dataNasc);
		System.out.println("");
		
	}
}
