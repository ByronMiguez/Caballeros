package Modelo;

public class Arma {

	private String tipo;
	private int danio;
	private int idArma;

	public Arma() {
		
	}
	
	public Arma(String tipo, int danio) {
		super();
		this.tipo = tipo;
		this.danio = danio;
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
		return "Arma [tipo=" + tipo + ", danio=" + danio + ", idArma=" + idArma + "]";
	}

	
}
