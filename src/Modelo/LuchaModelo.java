package Modelo;

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
	
	
	
}
