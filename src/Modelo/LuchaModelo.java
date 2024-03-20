package Modelo;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class LuchaModelo extends Conector {
	
	public static Caballero calcularGanador(Caballero caballero1, Caballero caballero2) {
		
		//devuelve el ganador calculando 
		if (caballero1.getFuerzaLucha()-caballero2.getFuerzaLucha()>10) {
		
			System.out.println(caballero1.getNombre()+ " Es el ganador de esta batalla");
			return caballero1;
			
		} else if (caballero2.getFuerzaLucha()-caballero1.getFuerzaLucha()<10) {
			
			System.out.println(caballero2.getNombre()+ " Es el ganador de esta batalla");
			return caballero2;
			
		} else {
			
			System.out.println(" La lucha ha acabado en empate");
			return null;
		}
	
	}
	public static void aumentarValores(Caballero ganador) {
		
		//Aumentar los atributos del ganador
		ganador.setExperiencia(ganador.getExperiencia()+25);
		ganador.setDanioCaballero(ganador.getDanioCaballero()+5);
		ganador.setVelocidadCaballero(ganador.getVelocidadCaballero()+5);
		
		//Aumenta la experiencia del escudero asignado a un caballero
		ganador.getEscudero().setExperiencia(ganador.getEscudero().getExperiencia()+25);
	
	}
	
	//por hacer 
	public static void insertLucha (Caballero caballero1, Caballero caballero2) {
		String sql = "insert into luchas (Id, Caballero1, Caballero2, Fecha, Ganador) VALUES (?, ?, ?, ?, ?)";
	
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			Date fecha = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			
			pst.setInt(2, caballero1.getIdCaballero());
			pst.setInt(3, caballero2.getIdCaballero());
			pst.setString(4, formato.format(fecha));
			pst.setInt(5, (calcularGanador(caballero1, caballero2).getIdCaballero()));
			pst.execute();
		} 	
			catch (SQLException e) {
			System.out.println("El caballero no puede luchar contra si mismo");
		}
	}
	
	
	public static ArrayList<Lucha> selectAllLuchas() {
		ArrayList<Lucha> listaLuchas = new ArrayList<>();
		String sql = "select * from luchas";
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Lucha lucha = new Lucha();
				
				lucha.setId(rs.getInt(1));
				lucha.setCaballero1(CaballeroModelo.getUnCaballero(rs.getInt(2)));
				lucha.setCaballero2(CaballeroModelo.getUnCaballero(rs.getInt(3)));
				lucha.setFecha(rs.getDate(4));
				lucha.setGanador(rs.getString(5));
				
				listaLuchas.add(lucha);
			}
		return listaLuchas;
			
		} catch (SQLException e) {
			System.out.println("error sql mostrar");			
			e.printStackTrace();
		}		
		
		return null;
	}
	
}
