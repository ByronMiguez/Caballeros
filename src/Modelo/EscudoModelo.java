package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Vista.Visor;

public class EscudoModelo extends Conector{

	public static void insertEscudo(Escudo escudo) {
	
		String sql= "insert into escudos(tipo, defensa) values(?,?)";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, escudo.getTipo());
			pst.setInt(2, escudo.getDefensa());
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql insertar");
			e.printStackTrace();
		}
	}

	public static void deleteEscudo(int id) {
		
		String sql ="delete from escudos where Id_escudo=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql eliminar");
			e.printStackTrace();
		}
	}

	public static void updateEscudo(int id, Escudo escudo) {
		
		String sql ="update escudos set tipo=?,defensa=? where Id_escudo=?";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, escudo.getTipo());
			pst.setInt(2, escudo.getDefensa());
			pst.setInt(3, id);
			pst.execute();
			Visor.updateCompletado();
			
		} catch (SQLException e) {
			System.out.println("error sql modificar");
			e.printStackTrace();
		}	
	}

	public static ArrayList<Escudo> selectAllEscudos() {
		ArrayList<Escudo> listaEscudos = new ArrayList<>();
		String sql = "select * from escudos";
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Escudo escudo = new Escudo();
				
				escudo.setIdEscudo(rs.getInt(1));
				escudo.setTipo(rs.getString(2));
				escudo.setDefensa(rs.getInt(3));
				
				listaEscudos.add(escudo);
			}
		return listaEscudos;
			
		} catch (SQLException e) {
			System.out.println("error sql mostrar");			
			e.printStackTrace();
		}
			
		return null;
	}
}
