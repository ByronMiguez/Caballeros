package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CaballoModelo extends Conector{

	public static void insertCaballo(Caballo caballo) {
		String sql = "insert into caballos (Nombre, Velocidad, Resistencia) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, caballo.getNombre());
			pst.setInt(2, caballo.getVelocidad());
			pst.setInt(3, caballo.getResistencia());
			
			pst.execute();
		} 	
			catch (SQLException e) {
			System.out.println("Error en la Query");
			e.printStackTrace();
		}
	}

	public static void deleteCaballo(int id) {
		String sql ="delete from caballos where Id_caballo=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("No puedes eliminar el caballo porque hay un caballero usandolo ");
		}
	}

	public static void updateCaballo(int id, Caballo caballo) {
		String sql ="update caballos set Nombre=?,Velocidad=?,Resistencia=? where Id_caballo=?";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, caballo.getNombre());
			pst.setInt(2, caballo.getVelocidad());
			pst.setInt(3, caballo.getResistencia());
			pst.setInt(4, id);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql modificar");
			e.printStackTrace();
		}
	}

	public static ArrayList<Caballo> selectAllCaballos() {
		ArrayList<Caballo> listaCaballo = new ArrayList<>();
		String sql = "select * from caballos";
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Caballo caballo = new Caballo();
				
				caballo.setIdCaballo(rs.getInt(1));
				caballo.setNombre(rs.getString(2));
				caballo.setVelocidad(rs.getInt(3));
				caballo.setResistencia(rs.getInt(4));
				
				listaCaballo.add(caballo);
			}
		return listaCaballo;
			
		} catch (SQLException e) {
			System.out.println("error sql mostrar");			
			e.printStackTrace();
		}		
		
		return null;
	}

	public static Caballo getUnCaballo (int idCaballo ) {
		
		String sql ="SELECT * FROM caballos WHERE Id_caballo=?";

		try {
			
			PreparedStatement pst = cn.prepareStatement(sql);
			
			pst.setInt(1, idCaballo);
		
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Caballo UnCaballo = new Caballo();
				UnCaballo.setIdCaballo(rs.getInt(1));
				UnCaballo.setNombre(rs.getString(2));
				UnCaballo.setVelocidad(rs.getInt(3));
				UnCaballo.setResistencia(rs.getInt(4));
				
				return UnCaballo;
			}
			
			
		} catch (SQLException e) {
			System.out.println("error sql eliminar");
			e.printStackTrace();
		}
		return null;
	}
}
