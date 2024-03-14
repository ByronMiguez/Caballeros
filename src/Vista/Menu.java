package Vista;

public class Menu {
	
	//MENU GENERAL
	public static final int MENU_ARMA = 1;
	public static final int MENU_ESCUDERO = 2;
	public static final int MENU_CABALLERO = 3;
	public static final int MENU_CABALLO = 4;
	public static final int MENU_ESCUDO= 5;
	public static final int MENU_LUCHA= 6;
	
	//MENU ARMA
	public static final int INSERT_ARMA = 1;
	public static final int DELETE_ARMA = 2;
	public static final int UPDATE_ARMA = 3;
	public static final int READ_ARMA = 4;

	public static final int SALIR= 0;
	
	public static void menuGeneral() {
		
		System.out.println(MENU_ARMA +". Para acceder al menú de Armas");
		
	}
	
	public static void menuArma() {
		
		System.out.println(INSERT_ARMA+". Inserta una nueva arma");
		System.out.println(DELETE_ARMA+". Elimina una nueva arma");
		System.out.println(UPDATE_ARMA+". Modifica una nueva arma");
		System.out.println(READ_ARMA+". Muestra las armas disponibles");		
	}
}
