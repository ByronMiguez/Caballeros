package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conector.Conector;

public class EscuderoModelo extends Conector{

	public static void insertarEscudero(Escudero escudero) {
		String sql = "INSERT INTO clientes (Id_escudero, Nombre, Experiencia) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, escudero.getIdEscudero());
			pst.setString(2, escudero.getNombre());
			pst.setInt(3, escudero.getExperiencia());
			
			pst.execute();
		} 	
			catch (SQLException e) {
			System.out.println("Error en la Query");
			e.printStackTrace();
		}
	}
}
