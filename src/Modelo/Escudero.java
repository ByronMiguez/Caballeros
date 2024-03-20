package Modelo;

public class Escudero {

	
	private int idEscudero;
	private String nombre;
	private int experiencia;
	
	public Escudero() {
		
	}
	
	public Escudero(int idEscudero, String nombre, int experiencia) {
		this.idEscudero = idEscudero;
		this.nombre = nombre;
		this.experiencia = experiencia;
	}
	public int getIdEscudero() {
		return idEscudero;
	}
	public void setIdEscudero(int idEscudero) {
		this.idEscudero = idEscudero;
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
	@Override
	public String toString() {
		return "Escudero [idEscudero=" + idEscudero + ", nombre=" + nombre + ", experiencia=" + experiencia + "]";
	}
}
