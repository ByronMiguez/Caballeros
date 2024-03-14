package Modelo;

import java.util.Date;

public class Lucha {

	private int lucha;
	private Caballero idCaballero1;
	private Caballero idCaballero2;
	private Date fecha;
	private String ganador;
	
	public Lucha() {
		
	}
	
	public Lucha(int lucha, Caballero idCaballero1, Caballero idCaballero2, Date fecha, String ganador) {
		this.lucha = lucha;
		this.idCaballero1 = idCaballero1;
		this.idCaballero2 = idCaballero2;
		this.fecha = fecha;
		this.ganador = ganador;
	}
	
	public int getLucha() {
		return lucha;
	}
	public void setLucha(int lucha) {
		this.lucha = lucha;
	}
	public Caballero getIdCaballero1() {
		return idCaballero1;
	}
	public void setIdCaballero1(Caballero idCaballero1) {
		this.idCaballero1 = idCaballero1;
	}
	public Caballero getIdCaballero2() {
		return idCaballero2;
	}
	public void setIdCaballero2(Caballero idCaballero2) {
		this.idCaballero2 = idCaballero2;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	@Override
	public String toString() {
		return "Lucha [lucha=" + lucha + ", idCaballero1=" + idCaballero1 + ", idCaballero2=" + idCaballero2
				+ ", fecha=" + fecha + ", ganador=" + ganador + "]";
	}
	
	
}
