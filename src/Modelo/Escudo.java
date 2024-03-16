package Modelo;

public class Escudo {
	
	private int idEscudo;
	private String tipo;
	private int defensa;
	
	public Escudo() {
		
	}
	
	public Escudo(int idEscudo, String tipo, int defensa) {
		this.idEscudo = idEscudo;
		this.tipo = tipo;
		this.defensa = defensa;
	}
	
	public int getIdEscudo() {
		return idEscudo;
	}
	public void setIdEscudo(int idEscudo) {
		this.idEscudo = idEscudo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	@Override
	public String toString() {
		return "Escudo [idEscudo=" + idEscudo + ", tipo=" + tipo + ", defensa=" + defensa + "]";
	}
}
