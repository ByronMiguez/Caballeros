package Modelo;

public class Caballero {

	private int idCaballero;
	private String nombre;
	private int experiencia;
	private int dañoCaballero;
	private int velocidadCaballero;
	private Arma idArma;
	private Escudo idEscudo;
	private Caballo idCaballo;
	private Escudero idEscudero;
	
	
	
	public Caballero(){
		
	}

	public Caballero(String nombre, int idCaballero, Arma idArma, Escudo idEscudo, Caballo idCaballo,
			Escudero idEscudero, int experiencia, int dañoCaballero, int velocidadCaballero) {
		this.nombre = nombre;
		this.idCaballero = idCaballero;
		this.idArma = idArma;
		this.idEscudo = idEscudo;
		this.idCaballo = idCaballo;
		this.idEscudero = idEscudero;
		this.experiencia = experiencia;
		this.dañoCaballero = dañoCaballero;
		this.velocidadCaballero = velocidadCaballero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdCaballero() {
		return idCaballero;
	}
	public void setIdCaballero(int idCaballero) {
		this.idCaballero = idCaballero;
	}
	public Arma getIdArma() {
		return idArma;
	}
	public void setIdArma(Arma idArma) {
		this.idArma = idArma;
	}
	public Escudo getIdEscudo() {
		return idEscudo;
	}
	public void setIdEscudo(Escudo idEscudo) {
		this.idEscudo = idEscudo;
	}
	public Caballo getIdCaballo() {
		return idCaballo;
	}
	public void setIdCaballo(Caballo idCaballo) {
		this.idCaballo = idCaballo;
	}
	public Escudero getIdEscudero() {
		return idEscudero;
	}
	public void setIdEscudero(Escudero idEscudero) {
		this.idEscudero = idEscudero;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public int getDañoCaballero() {
		return dañoCaballero;
	}
	public void setDañoCaballero(int dañoCaballero) {
		this.dañoCaballero = dañoCaballero;
	}
	public int getVelocidadCaballero() {
		return velocidadCaballero;
	}
	public void setVelocidadCaballero(int velocidadCaballero) {
		this.velocidadCaballero = velocidadCaballero;
	}
	
	@Override
	public String toString() {
		return "Caballero [nombre=" + nombre + ", idCaballero=" + idCaballero + ", idArma=" + idArma + ", idEscudo="
				+ idEscudo + ", idCaballo=" + idCaballo + ", idEscudero=" + idEscudero + ", experiencia=" + experiencia
				+ ", dañoCaballero=" + dañoCaballero + ", velocidadCaballero=" + velocidadCaballero + "]";
	}
	
	
}
