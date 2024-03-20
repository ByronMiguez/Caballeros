package Vista;

public class Menu {


    // MENÚ GENERAL
    public static final int MENU_ARMA = 1;
    public static final int MENU_ESCUDERO = 2;
    public static final int MENU_CABALLERO = 3;
    public static final int MENU_CABALLO = 4;
    public static final int MENU_ESCUDO = 5;
    public static final int MENU_LUCHA = 6;

    // MENÚ ARMA
    public static final int INSERT_ARMA = 1;
    public static final int DELETE_ARMA = 2;
    public static final int UPDATE_ARMA = 3;
    public static final int READ_ARMA = 4;

    // MENÚ ESCUDERO
    public static final int INSERT_ESCUDERO = 1;
    public static final int DELETE_ESCUDERO = 2;
    public static final int UPDATE_ESCUDERO = 3;
    public static final int READ_ESCUDERO = 4;

    // MENÚ CABALLERO
    public static final int INSERT_CABALLERO = 1;
    public static final int DELETE_CABALLERO = 2;
    public static final int UPDATE_CABALLERO = 3;
    public static final int READ_CABALLERO = 4;

    // MENÚ CABALLO
    public static final int INSERT_CABALLO = 1;
    public static final int DELETE_CABALLO = 2;
    public static final int UPDATE_CABALLO = 3;
    public static final int READ_CABALLO = 4;

    // MENÚ ESCUDO
    public static final int INSERT_ESCUDO = 1;
    public static final int DELETE_ESCUDO = 2;
    public static final int UPDATE_ESCUDO = 3;
    public static final int READ_ESCUDO = 4;

    // MENÚ LUCHA
    public static final int LUCHA_ELIGIENDO = 1;
    public static final int MOSTRAR_LUCHAS = 2;

    // SALIR
    public static final int SALIR = 0;

    public static void menuGeneral() {
        System.out.println("\n------------- MENÚ PRINCIPAL -------------");
        System.out.printf("%d. Administrar Armas\n", MENU_ARMA);
        System.out.printf("%d. Administrar Escuderos\n", MENU_ESCUDERO);
        System.out.printf("%d. Administrar Caballeros\n", MENU_CABALLERO);
        System.out.printf("%d. Administrar Caballos\n", MENU_CABALLO);
        System.out.printf("%d. Administrar Escudos\n", MENU_ESCUDO);
        System.out.printf("%d. Simulación de Luchas\n", MENU_LUCHA);
        System.out.printf("%d. Salir\n", SALIR);
    }

    public static void menuArma() {
        System.out.println("\n------------- MENÚ DE ARMAS -------------");
        System.out.printf("%d. Agregar un arma\n", INSERT_ARMA);
        System.out.printf("%d. Eliminar un arma\n", DELETE_ARMA);
        System.out.printf("%d. Actualizar información de un arma\n", UPDATE_ARMA);
        System.out.printf("%d. Ver armas disponibles\n", READ_ARMA);
    }

    public static void menuEscudero() {
        System.out.println("\n------------- MENÚ DE ESCUDEROS -------------");
        System.out.printf("%d. Contratar un nuevo escudero\n", INSERT_ESCUDERO);
        System.out.printf("%d. Despedir un escudero\n", DELETE_ESCUDERO);
        System.out.printf("%d. Actualizar información de un escudero\n", UPDATE_ESCUDERO);
        System.out.printf("%d. Ver escuderos disponibles\n", READ_ESCUDERO);
    }

    public static void menuCaballero() {
        System.out.println("\n------------- MENÚ DE CABALLEROS -------------");
        System.out.printf("%d. Contratar un nuevo caballero\n", INSERT_CABALLERO);
        System.out.printf("%d. Despedir un caballero\n", DELETE_CABALLERO);
        System.out.printf("%d. Actualizar información de un caballero\n", UPDATE_CABALLERO);
        System.out.printf("%d. Ver caballeros disponibles\n", READ_CABALLERO);
    }

    public static void menuCaballo() {
        System.out.println("\n------------- MENÚ DE CABALLOS -------------");
        System.out.printf("%d. Adquirir un nuevo caballo\n", INSERT_CABALLO);
        System.out.printf("%d. Vender un caballo\n", DELETE_CABALLO);
        System.out.printf("%d. Actualizar información de un caballo\n", UPDATE_CABALLO);
        System.out.printf("%d. Ver caballos disponibles\n", READ_CABALLO);
    }

    public static void menuEscudo() {
        System.out.println("\n------------- MENÚ DE ESCUDOS -------------");
        System.out.printf("%d. Adquirir un nuevo escudo\n", INSERT_ESCUDO);
        System.out.printf("%d. Vender un escudo\n", DELETE_ESCUDO);
        System.out.printf("%d. Actualizar información de un escudo\n", UPDATE_ESCUDO);
        System.out.printf("%d. Ver escudos disponibles\n", READ_ESCUDO);
    }

    public static void menuLucha() {
        System.out.println("\n------------- SIMULACIÓN DE LUCHAS -------------");
        System.out.printf("%d. Elegir dos caballeros para una lucha\n", LUCHA_ELIGIENDO);
        System.out.printf("%d. Mostrar las luchas disponibles\n", MOSTRAR_LUCHAS);
    }
}
