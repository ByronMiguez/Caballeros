package Modelo;

public class Arma {

	private String tipo;
	private int daño;
	
	public Arma() {
		
	}
	
	public Arma(String tipo, int daño) {
		super();
		this.tipo = tipo;
		this.daño = daño;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDaño() {
		return daño;
	}
	public void setDaño(int daño) {
		this.daño = daño;
	}

	@Override
	public String toString() {
		return "Arma [tipo=" + tipo + ", daño=" + daño + "]";
	}
	
	
}
