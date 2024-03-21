package Modelo;

import java.util.Date;

public class Lucha {


	private int id;
	private Caballero caballero1;
	private Caballero caballero2;
	private Date fecha;
	private int ganador;
	
	public Lucha() {
		
	}
	public Lucha(int id, Caballero caballero1, Caballero caballero2, Date fecha, int ganador) {
		this.id = id;
		this.caballero1 = caballero1;
		this.caballero2 = caballero2;
		this.fecha = fecha;
		this.ganador = ganador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Caballero getCaballero1() {
		return caballero1;
	}
	public void setCaballero1(Caballero caballero1) {
		this.caballero1 = caballero1;
	}
	public Caballero getCaballero2() {
		return caballero2;
	}
	public void setCaballero2(Caballero caballero2) {
		this.caballero2 = caballero2;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getGanador() {
		return ganador;
	}
	public void setGanador(int i) {
		this.ganador = i;
	}
	
	@Override
	public String toString() {
		return "Lucha [id=" + id + ", caballero1=" + caballero1 + ", caballero2=" + caballero2 + ", fecha=" + fecha
				+ ", ganador=" + ganador + "]";
	}
	
}
