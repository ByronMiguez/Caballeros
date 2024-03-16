package Modelo;

public class Caballero {

	private int idCaballero;
	private String nombre;
	private int experiencia;
	private int danioCaballero;
	private int velocidadCaballero;
	private Arma arma;
	private Escudo escudo;
	private Caballo caballo;
	private Escudero escudero;
	
	public Caballero(){
		
	}

	

	public Caballero(int idCaballero, String nombre, int experiencia, int danioCaballero, int velocidadCaballero,
			Arma arma, Escudo escudo, Caballo caballo, Escudero escudero) {
		this.idCaballero = idCaballero;
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.danioCaballero = danioCaballero;
		this.velocidadCaballero = velocidadCaballero;
		this.arma = arma;
		this.escudo = escudo;
		this.caballo = caballo;
		this.escudero = escudero;
	}



	public int getIdCaballero() {
		return idCaballero;
	}



	public void setIdCaballero(int idCaballero) {
		this.idCaballero = idCaballero;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getExperiencia() {
		return experiencia;
	}



	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}



	public int getDanioCaballero() {
		return danioCaballero;
	}



	public void setDanioCaballero(int danioCaballero) {
		this.danioCaballero = danioCaballero;
	}



	public int getVelocidadCaballero() {
		return velocidadCaballero;
	}



	public void setVelocidadCaballero(int velocidadCaballero) {
		this.velocidadCaballero = velocidadCaballero;
	}



	public Arma getArma() {
		return arma;
	}



	public void setArma(Arma arma) {
		this.arma = arma;
	}



	public Escudo getEscudo() {
		return escudo;
	}



	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}



	public Caballo getCaballo() {
		return caballo;
	}



	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}



	public Escudero getEscudero() {
		return escudero;
	}



	public void setEscudero(Escudero escudero) {
		this.escudero = escudero;
	}



	@Override
	public String toString() {
		return "Caballero [idCaballero=" + idCaballero + ", nombre=" + nombre + ", experiencia=" + experiencia
				+ ", danioCaballero=" + danioCaballero + ", velocidadCaballero=" + velocidadCaballero + ", arma=" + arma
				+ ", escudo=" + escudo + ", caballo=" + caballo + ", escudero=" + escudero + "]";
	}
	
	
	
}
