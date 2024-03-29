package Modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Conector.Conector;

public class ArmaModelo extends Conector{

	public static void insertArma(Arma arma) {
		
		String sql= "insert into armas(tipo, danio) values(?,?)";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, arma.getTipo());
			pst.setInt(2, arma.getDanio());
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql insertar");
			e.printStackTrace();
		}
	}
	public static void deleteArma(int idArma) {
		
		String sql ="delete from armas where Id_arma=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, idArma);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql eliminar");
			e.printStackTrace();
		}
	}
	//Recibe un id y un arma, se modifica la fila que corresponda con el id dado, con la información del arma recibido.
	public static void updateArma(int id, Arma arma) {
		
		String sql ="update armas set tipo=?,danio=? where Id_arma=?";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, arma.getTipo());
			pst.setInt(2, arma.getDanio());
			pst.setInt(3, id);
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("error sql modificar");
			e.printStackTrace();
		}	
	}
	public static  ArrayList<Arma> selectAllArmas() {
		
		ArrayList<Arma> listaArmas = new ArrayList<>();
		String sql = "select * from armas";
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Arma arma = new Arma();
				
				arma.setIdArma(rs.getInt(1));
				arma.setTipo(rs.getString(2));
				arma.setDanio(rs.getInt(3));
				
				listaArmas.add(arma);
			}
		return listaArmas;
			
		} catch (SQLException e) {
			System.out.println("error sql mostrar");			
			e.printStackTrace();
		}
		return null;
	}

	public static Arma getUnArma (int idArma ) {
		
		String sql ="SELECT * FROM armas WHERE Id_arma=?";

		try {
			
			PreparedStatement pst = cn.prepareStatement(sql);
			
			pst.setInt(1, idArma);
		
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				Arma UnArma = new Arma();
				UnArma.setIdArma(rs.getInt(1));
				UnArma.setTipo(rs.getString(2));
				UnArma.setDanio(rs.getInt(3));
	
				return UnArma;
			}
			
			
		} catch (SQLException e) {
			System.out.println("error sql eliminar");
			e.printStackTrace();
		}
		return null;
	}
	

}
