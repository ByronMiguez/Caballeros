package Vista;

import java.util.ArrayList;

import Modelo.Arma;
import Modelo.Caballero;
import Modelo.CaballeroModelo;
import Modelo.Caballo;
import Modelo.Escudero;
import Modelo.Escudo;
import Modelo.Lucha;

public class Visor {
	
	public static void mensajeInsert() {
		System.out.println("Usted ha seleccionado la opción de Insertar una nueva fila");	
	}
	public static void insertCompletado() {
		System.out.println("El objeto ha sido insertada");	
	}
	
	public static void mensajeDelete() {
		System.out.println("Usted ha seleccionado la opción de Eliminar la fila del id dado");	
	}
	public static void deleteCompletado() {
		System.out.println("El objeto ha sido eliminado");	
	}
	
	public static void mensajeUpdate() {
		System.out.println("Usted ha seleccionado la opción de modificar toda la información del id introducido");	
	}
	public static void updateCompletado() {
		System.out.println("El objeto ha sido modificado");	
	}
	
	public static void mensajeSelectAll() {
		System.out.println("Usted ha seleccionado la opción de mostrar todas las filas");	
	}
	
	public static void mostrarArmas(ArrayList<Arma> listaArmas) {
		
		System.out.println("Lista de Armas:");

		System.out.printf("%-15s%-20s%-20s\n", "Id", "Tipo", "Daño");

        System.out.println("--------------------------------------------------");

		for (Arma arma : listaArmas) {
			
            System.out.printf("%-15s%-20s%-20s\n", arma.getIdArma(), arma.getTipo(), arma.getDanio());

		}
		System.out.println("--------------------------------------------------");
	}

	public static void mostrarEscudos(ArrayList<Escudo> listaEscudos) {
		
		System.out.println("Lista de Escudos:");

		System.out.printf("%-15s%-20s%-20s\n", "Id", "Tipo", "Defensa");

        System.out.println("--------------------------------------------------");
        
		for (Escudo escudo : listaEscudos) {
            System.out.printf("%-15s%-20s%-20s\n", escudo.getIdEscudo(), escudo.getTipo(), escudo.getDefensa());
		}
        System.out.println("--------------------------------------------------");

	}
	public static void mostrarEscuderos(ArrayList<Escudero> listaEscuderos) {
		
		System.out.println("Lista de Escuderos:");

		System.out.printf("%-15s%-20s%-20s\n", "Id", "Nombre", "Experiencia");

        System.out.println("--------------------------------------------------");
        
		for (Escudero escudero : listaEscuderos) {
            System.out.printf("%-15s%-20s%-20s\n", escudero.getIdEscudero(), escudero.getNombre(), escudero.getExperiencia());
		}
	}
	public static void mostrarCaballos(ArrayList<Caballo> listaCaballos) {
		
		System.out.println("Lista de Caballos:");

		System.out.printf("%-15s%-20s%-20s%-20s\n", "Id", "Nombre", "Velocidad", "Resistencia");

        System.out.println("--------------------------------------------------");
        
		for (Caballo caballo : listaCaballos) {
            System.out.printf("%-15s%-20s%-20s%-20s\n", caballo.getIdCaballo(), caballo.getNombre(), caballo.getVelocidad(), caballo.getResistencia());
		}
	}
	public static void mostrarCaballeros(ArrayList<Caballero> listaCaballeros) {
		
		System.out.println("Lista de Caballeros:");

		System.out.printf("%-15s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Nombre", "Experiencia", "Daño", "Velocidad", "Arma", "Escudo", "Caballo", "Escudero");

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
		for (Caballero caballero : listaCaballeros) {
            System.out.printf("%-15s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", caballero.getIdCaballero(), caballero.getNombre(), caballero.getExperiencia(), caballero.getDanioCaballero(), caballero.getVelocidadCaballero(), caballero.getArma().getTipo(), caballero.getEscudo().getTipo(), caballero.getCaballo().getNombre(), caballero.getEscudero().getNombre());
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}
	public static void bienvenidaLucha() {
		
		System.out.println("¡Bienvenido a la Lucha de Caballeros!");
        System.out.println("Prepárate para enfrentarte a emocionantes batallas llenas de honor y valentía.");
        System.out.println("Que la fuerza esté contigo en esta épica contienda.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
	
	}
	public static void mostrarLuchas(ArrayList<Lucha> selectAllLuchas) {
		
		String resultado = "";
		
		System.out.println("Historial de Luchas:");
        System.out.printf("%-15s%-20s%-20s%-20s%-20s\n", "Id", "Caballero 1", "Caballero 2", "Fecha", "Ganador");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        for (Lucha lucha : selectAllLuchas) {
        	
    		if (lucha.getGanador()==0) {
    			resultado="empate";
    			
    		} else {
    			
    			resultado=CaballeroModelo.getUnCaballero(lucha.getGanador()).getNombre();
    		}
    		
            System.out.printf("%-15s%-20s%-20s%-20s%-20s\n", lucha.getId(), lucha.getCaballero1().getNombre(), lucha.getCaballero2().getNombre(), lucha.getFecha(), resultado);
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
    
	}
	public static void mensajeResultado(Caballero caballero) {
		
		String resultado = caballero.getResultado();
		
		if(!resultado.equalsIgnoreCase("empate")) {
			
			System.out.println("¡Enhorabuena " + caballero.getNombre() + " es el ganador de esta batalla!");
			System.out.println("¡Gracias por participar!");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		
		} else {
		
			System.out.println("La lucha ha acabado en EMPATE, vuelve a intentarlo para obtener un GANADOR");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		
		}
	}

}