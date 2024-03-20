package Modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Conector.Conector;

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
			System.out.println("ERROR");
			System.out.println("El escudero o el caballo ya esta en uso, introduce otro por favor");

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
		ArrayList<Caballero> listaCaballeros = new ArrayList<>();
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
				caballero.setArma(ArmaModelo.getUnArma(rs.getInt(6)));
				caballero.setEscudo(EscudoModelo.getUnEscudo(rs.getInt(7)));
				caballero.setCaballo(CaballoModelo.getUnCaballo(rs.getInt(8)));
				caballero.setEscudero(EscuderoModelo.getUnEscudero(rs.getInt(9)));
				
				listaCaballeros.add(caballero);
			}
		return listaCaballeros;
			
		} catch (SQLException e) {
			System.out.println("error sql mostrar");			
			e.printStackTrace();
		}		
		
		return null;
	}
	
	public static ArrayList<Caballero> getCaballerosPorArma ( Arma arma ) {
		
		ArrayList<Caballero> listaCaballeros = new ArrayList<>();

		String sql ="SELECT * FROM caballeros WHERE Id_arma=?";

		try {
			
			PreparedStatement pst = cn.prepareStatement(sql);
			
			pst.setInt(1, arma.getIdArma());
		
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Arma UnArma = new Arma();
				UnArma.setIdArma(rs.getInt(1));
				UnArma.setTipo(rs.getString(2));
				UnArma.setDanio(rs.getInt(3));
	
				return listaCaballeros;
			}
			
			
		} catch (SQLException e) {
			System.out.println("error sql eliminar");
			e.printStackTrace();
		}
		return null;
	}
	public static Caballero getUnCaballero (int idCaballero ) {
		
		String sql ="SELECT * FROM caballeros WHERE Id_caballero=?";

		try {
			
			PreparedStatement pst = cn.prepareStatement(sql);
			
			pst.setInt(1, idCaballero);
		
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Caballero unCaballero = new Caballero();
				unCaballero.setIdCaballero(rs.getInt(1));
				unCaballero.setNombre(rs.getString(2));
				unCaballero.setExperiencia(rs.getInt(3));
				unCaballero.setDanioCaballero(rs.getInt(4));
				unCaballero.setVelocidadCaballero(rs.getInt(5));
				unCaballero.setArma(ArmaModelo.getUnArma(rs.getInt(6)));
				unCaballero.setEscudo(EscudoModelo.getUnEscudo(rs.getInt(7)));
				unCaballero.setCaballo(CaballoModelo.getUnCaballo(rs.getInt(8)));
				unCaballero.setEscudero(EscuderoModelo.getUnEscudero(rs.getInt(9)));
	
				return unCaballero;
			}	
			
		} catch (SQLException e) {
			System.out.println("error sql eliminar");
			e.printStackTrace();
		}
		return null;
	}

}
