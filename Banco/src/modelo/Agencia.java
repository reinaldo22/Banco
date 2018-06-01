package modelo;

public class Agencia {
	private String codigo;
	
	public Agencia(String pCodigo) {
		this.codigo = pCodigo;
	}

	public String getCodigo() {
		return codigo;
	}
	

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void mostrarAgencia() {
		System.out.println("Código da Agência: " + this.codigo);
	}

}