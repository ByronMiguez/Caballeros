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

	//MENU ESCUDERO
	public static final int INSERT_ESCUDERO = 1;
	public static final int DELETE_ESCUDERO = 2;
	public static final int UPDATE_ESCUDERO = 3;
	public static final int READ_ESCUDERO = 4;
	
	//MENU CABALLERO
	public static final int INSERT_CABALLERO = 1;
	public static final int DELETE_CABALLERO = 2;
	public static final int UPDATE_CABALLERO = 3;
	public static final int READ_CABALLERO = 4;
	
	//MENU CABALLO
	public static final int INSERT_CABALLO = 1;
	public static final int DELETE_CABALLO = 2;
	public static final int UPDATE_CABALLO = 3;
	public static final int READ_CABALLO = 4;
	
	//MENU ESCUDO
	public static final int INSERT_ESCUDO = 1;
	public static final int DELETE_ESCUDO = 2;
	public static final int UPDATE_ESCUDO = 3;
	public static final int READ_ESCUDO = 4;
	
	//MENU LUCHA
	public static final int LUCHA_ELIGIENDO = 1;
	public static final int LUCHA_RANDOM = 2;
	
	//SALIR
	public static final int SALIR= 0;
	
	
	public static void menuGeneral() {
		
		System.out.println(MENU_ARMA +". Para acceder al menú de Armas");
		
	}
	
	public static void menuArma() {
		
		System.out.println(INSERT_ARMA+". Inserta una nueva arma");
		System.out.println(DELETE_ARMA+". Elimina un arma");
		System.out.println(UPDATE_ARMA+". Modifica un arma");
		System.out.println(READ_ARMA+". Muestra las armas disponibles");		
	}
	
	public static void menuEscudero() {
		System.out.println(INSERT_ESCUDERO+". Inserta un nuevo escudero");
		System.out.println(DELETE_ESCUDERO+". Elimina un escudero");
		System.out.println(UPDATE_ESCUDERO+". Modifica un escudero");
		System.out.println(READ_ESCUDERO+". Muestra los escuderos disponibles");
	}
	public static void menuCaballero() {
		System.out.println(INSERT_CABALLERO+". Inserta un nuevo caballero");
		System.out.println(DELETE_CABALLERO+". Elimina un caballero");
		System.out.println(UPDATE_CABALLERO+". Modifica un caballero");
		System.out.println(READ_CABALLERO+". Muestra los caballeros disponibles");
	}
	public static void menuCaballo() {
		System.out.println(INSERT_CABALLO+". Inserta un nuevo caballo");
		System.out.println(DELETE_CABALLO+". Elimina un caballo");
		System.out.println(UPDATE_CABALLO+". Modifica un caballo");
		System.out.println(READ_CABALLO+". Muestra los caballo disponibles");
	}
	public static void menuEscudo() {
		System.out.println(INSERT_ESCUDO+". Inserta un nuevo escudo");
		System.out.println(DELETE_ESCUDO+". Elimina un escudo");
		System.out.println(UPDATE_ESCUDO+". Modifica un escudo");
		System.out.println(READ_ESCUDO+". Muestra los escudo disponibles");	
	}
	public static void menuLucha() {
		System.out.println(LUCHA_ELIGIENDO+". Elige 2 caballeros para que luchen entre ellos");
		System.out.println(LUCHA_RANDOM+". 2 caballeros aleatorios lucharan entre si");
	}
}
