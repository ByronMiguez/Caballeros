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
		
		double fuerzaLuchaCaballero1 = caballero1.getFuerzaLucha();
		double fuerzaLuchaCaballero2 = caballero2.getFuerzaLucha();
		
		if (fuerzaLuchaCaballero1>fuerzaLuchaCaballero2) {

			caballero1.setResultado("ganador");	
			aumentarValores(caballero1);
			insertLucha(caballero1, caballero2);
			
		} else if (fuerzaLuchaCaballero1<fuerzaLuchaCaballero2) {

			caballero2.setResultado("ganador");
			aumentarValores(caballero2);
			insertLucha(caballero2, caballero1);
			return caballero2;
			
		} else {

			caballero1.setResultado("empate");
			insertLucha(caballero1, caballero2);
			
		}
		return caballero1;
	}
	
	public static void aumentarValores(Caballero ganador) {

		ganador.setExperiencia(ganador.getExperiencia()+25);
		ganador.setDanioCaballero(ganador.getDanioCaballero()+5);
		ganador.setVelocidadCaballero(ganador.getVelocidadCaballero()+5);
		ganador.getEscudero().setExperiencia(ganador.getEscudero().getExperiencia()+25);
		
		}
	
	
	public static void insertLucha(Caballero ganador, Caballero perdedor) {
		String sql = "insert into luchas(Id_caballero1, Id_caballero2, Fecha, Ganador) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			Date fecha = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			
			pst.setInt(1, ganador.getIdCaballero());
			pst.setInt(2, perdedor.getIdCaballero());
			pst.setString(3, formato.format(fecha));
			
			if(ganador.getResultado().equalsIgnoreCase("empate")) {
			
				pst.setInt(4, (0));
			
			} else {
				
				pst.setInt(4, (ganador.getIdCaballero()));
			
			}
			pst.execute();
		} 	
			catch (SQLException e) {
			System.out.println("error insert lucha");
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
				lucha.setGanador(rs.getInt(5));
				
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
