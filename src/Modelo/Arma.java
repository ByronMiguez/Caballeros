package Modelo;

public class Arma {

	private int idArma;
	private String tipo;
	private int danio;
	

	public Arma() {
		
	}
	
	public Arma(String tipo, int danio, int idArma) {
		this.tipo = tipo;
		this.danio = danio;
		this.idArma = idArma;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}

	public int getIdArma() {
		return idArma;
	}

	public void setIdArma(int idArma) {
		this.idArma = idArma;
	}

	@Override
	public String toString() {
		return "Arma [tipo=" + tipo + ", danio=" + danio + ", idArma=" + idArma + ", getTipo()=" + getTipo()
				+ ", getDanio()=" + getDanio() + ", getIdArma()=" + getIdArma() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
