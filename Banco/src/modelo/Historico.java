package modelo;

public class Historico {

	private double valor;
	private String tipo;
	private String data;
	private int destino;
	
	
	public Historico(double hValor,String hTipo, String hData,int hDest){
		this.valor = hValor;
		this.tipo = hTipo;
		this.data = hData;
		this.destino = hDest;
		
	}
	public void mostrarHistorico(){
		System.out.println("Valor: "+valor);
		System.out.println("Tipo: "+ tipo);
		System.out.println("Data: "+data);
		System.out.println("Destino: "+destino);
	}
}