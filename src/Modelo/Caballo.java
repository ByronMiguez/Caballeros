package Modelo;

public class Caballo {
	
	private int idCaballo;
	private String nombre;
	private int velocidad;
	private int resistencia;
	
	
	public Caballo() {
		
	}
	
	public Caballo(int idCaballo, String nombre, int velocidad, int resistencia) {
		this.idCaballo = idCaballo;
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.resistencia = resistencia;
	}
	
	public int getIdCaballo() {
		return idCaballo;
	}
	public void setIdCaballo(int idCaballo) {
		this.idCaballo = idCaballo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	@Override
	public String toString() {
		return "Caballo [idCaballo=" + idCaballo + ", nombre=" + nombre + ", velocidad=" + velocidad + ", resistencia="
				+ resistencia + "]";
	}
}
