package Modelo;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.SQLException;

import Conector.Conector;

public class EscuderoModelo extends Conector{

	
	public static void insertEscudero(Escudero escudero) {
		
		String sql = "insert into Escuderos (Nombre, Experiencia) VALUES (?, ?)";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, escudero.getNombre());
			pst.setInt(2, escudero.getExperiencia());
			
			pst.execute();
		} 	
			catch (SQLException e) {
			System.out.println("Error en la Query");
			e.printStackTrace();
		}
	}

	public static void deleteEscudero(int id) {
		
		String sql ="delete from escuderos where Id_escudero=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("No puedes eliminar el escudero porque un caballero lo esta usando ");
			
		}
		
	}

	public static void updateEscudero(int id, Escudero escudero) {
		
		String sql ="update escuderos set Nombre=?,Experiencia=? where Id_escudero=?";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, escudero.getNombre());
			pst.setInt(2, escudero.getExperiencia());
			pst.setInt(3, id);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql modificar");
			e.printStackTrace();
		}
		
	}
	public static ArrayList<Escudero> selectAllEscuderos() {
		
		ArrayList<Escudero> listaEscudero = new ArrayList<>();
		String sql = "select * from escuderos";
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Escudero escudero = new Escudero();
				
				escudero.setIdEscudero(rs.getInt(1));
				escudero.setNombre(rs.getString(2));
				escudero.setExperiencia(rs.getInt(3));
				
				listaEscudero.add(escudero);
			}
		return listaEscudero;
			
		} catch (SQLException e) {
			System.out.println("error sql mostrar");			
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static Escudero getUnEscudero (int idEscudero ) {
		
		String sql ="SELECT * FROM escuderos WHERE Id_escudero=?";

		try {
			
			PreparedStatement pst = cn.prepareStatement(sql);
			
			pst.setInt(1, idEscudero);
		
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Escudero UnEscudero = new Escudero();
				UnEscudero.setIdEscudero(rs.getInt(1));
				UnEscudero.setNombre(rs.getString(2));
				UnEscudero.setExperiencia(rs.getInt(3));
				
				return UnEscudero;
			}
			
			
		} catch (SQLException e) {
			System.out.println("error sql eliminar");
			e.printStackTrace();
		}
		return null;
	
	}
}
