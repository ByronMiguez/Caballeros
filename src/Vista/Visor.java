package Vista;

import java.util.ArrayList;

import Modelo.Arma;
import Modelo.Escudo;

public class Visor {
	
	public static void mensajeInsert() {
		System.out.println("Usted ha seleccionado la opción de Insertar una nueva fila");	
	}
	
	public static void mensajeDelete() {
		System.out.println("Usted ha seleccionado la opción de Eliminar la fila del id dado");	
	}
	
	public static void mensajeUpdate() {
		System.out.println("Usted ha seleccionado la opción de modificar toda la información del id introducido");	
	}
	
	public static void mensajeSelectAll() {
		System.out.println("Usted ha seleccionado la opción de mostrar todas las filas");	
	}
	
	public static void mostrarArmas(ArrayList<Arma> listaArmas) {
		
		for (Arma arma : listaArmas) {
			System.out.println(arma);
		}
	}

	public static void mostrarEscudos(ArrayList<Escudo> listaEscudos) {
		
		for (Escudo escudo : listaEscudos) {
			System.out.println(escudo);
		}
		
	}
}
