package modelo;

public class Agencia {
	private String codigo;
	
	
	public  Agencia(String pCodigo) {
		this.codigo = pCodigo;
		
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void mostrarCodigo() {
		System.out.println("Mostrando codigo da Agência: "+codigo);
	}

}
