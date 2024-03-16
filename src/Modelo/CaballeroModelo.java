package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CaballeroModelo extends Conector{

	public static void insertCaballero(Caballero caballero) {
		String sql = "insert into caballeros (Nombre, Experiencia, Danio_caballero, Velocidad_caballero, Id_arma, Id_escudo, Id_caballo, Id_escudero  ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, caballero.getNombre());
			pst.setInt(2, caballero.getExperiencia());
			pst.setInt(3, caballero.getDanioCaballero());
			pst.setInt(4, caballero.getVelocidadCaballero());
			pst.setInt(5, caballero.getArma().getIdArma());
			pst.setInt(6, caballero.getEscudo().getIdEscudo());
			pst.setInt(7, caballero.getCaballo().getIdCaballo());
			pst.setInt(8, caballero.getEscudero().getIdEscudero());
			
			pst.execute();
		} 	
			catch (SQLException e) {
			System.out.println("Error en la Query");
			e.printStackTrace();
		}
	}

	public static void deleteCaballero(int id) {
		String sql ="delete from caballeros where Id_caballero=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql eliminar");
			e.printStackTrace();
		}
	}

	public static void updateCaballero(int id, Caballero caballero) {
		String sql ="update caballeros set Nombre=?,Experiencia=?,Danio_caballero=?,Velocidad_caballero=?,Id_arma=?, Id_escudo=?, Id_caballo=?, Id_escudero=? where Id_caballero=?";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, caballero.getNombre());
			pst.setInt(2, caballero.getExperiencia());
			pst.setInt(3, caballero.getDanioCaballero());
			pst.setInt(4, caballero.getVelocidadCaballero());
			pst.setInt(5, caballero.getArma().getIdArma());
			pst.setInt(6, caballero.getEscudo().getIdEscudo());
			pst.setInt(7, caballero.getCaballo().getIdCaballo());
			pst.setInt(8, caballero.getEscudero().getIdEscudero());
			pst.setInt(9, id);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql modificar");
			e.printStackTrace();
		}
	}

	public static ArrayList<Caballero> selectAllCaballeros() {
		ArrayList<Caballero> listaCaballero = new ArrayList<>();
		String sql = "select * from caballeros";
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Caballero caballero = new Caballero();
				
				caballero.setIdCaballero(rs.getInt(1));
				caballero.setNombre(rs.getString(2));
				caballero.setExperiencia(rs.getInt(3));
				caballero.setDanioCaballero(rs.getInt(4));
				caballero.setVelocidadCaballero(rs.getInt(5));
				caballero.getArma().setIdArma(rs.getInt(6));
				caballero.getEscudo().setIdEscudo(rs.getInt(7));
				caballero.getCaballo().setIdCaballo(rs.getInt(8));
				caballero.getEscudero().setIdEscudero(rs.getInt(9));
				
				listaCaballero.add(caballero);
			}
		return listaCaballero;
			
		} catch (SQLException e) {
			System.out.println("error sql mostrar");			
			e.printStackTrace();
		}		
		
		return null;
	}

}
