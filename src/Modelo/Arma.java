package Modelo;

public class Arma {

	private int idArma;
	private String tipo;
	private int daño;
	

	public Arma() {
		
	}
	
	public Arma(String tipo, int daño, int idArma) {
		this.tipo = tipo;
		this.daño = daño;
		this.idArma = idArma;
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
	public int getIdArma() {
		return idArma;
	}

	public void setIdArma(int idArma) {
		this.idArma = idArma;
	}

	@Override
	public String toString() {
		return "Arma [tipo=" + tipo + ", daño=" + daño + ", idArma=" + idArma + "]";
	}

	
	
	
}
