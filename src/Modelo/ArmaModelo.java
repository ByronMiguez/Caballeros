package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArmaModelo extends Conector{

	public static void insertarArma(Arma arma) {
		
		String sql= "insert into armas(tipo, daño) values(?,?) ";
		try {
			System.out.println("antes de ejecutar");
			PreparedStatement pst = cn.prepareStatement(sql);
			
			pst.setString(1, arma.getTipo());
			pst.setInt(2, arma.getDaño());
			
			pst.execute();
		} catch (SQLException e) {
			System.out.println("error sql");
			e.printStackTrace();
		}
		
	}

}
