package Vista;

import java.util.ArrayList;

import Modelo.Arma;
import Modelo.Caballero;
import Modelo.Caballo;
import Modelo.Escudero;
import Modelo.Escudo;

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
		
		for (Arma arma : listaArmas) {
			System.out.println(arma);
		}
	}

	public static void mostrarEscudos(ArrayList<Escudo> listaEscudos) {
		
		for (Escudo escudo : listaEscudos) {
			System.out.println(escudo);
		}
	}
	public static void mostrarEscuderos(ArrayList<Escudero> listaEscuderos) {
		
		for (Escudero escudero : listaEscuderos) {
			System.out.println(escudero);
		}
	}
	public static void mostrarCaballos(ArrayList<Caballo> listaCaballos) {
		
		for (Caballo caballo : listaCaballos) {
			System.out.println(caballo);
		}
	}
	public static void mostrarCaballeros(ArrayList<Caballero> listaCaballeros) {
		
		for (Caballero caballero : listaCaballeros) {
			System.out.println(caballero);
		}
	}
}
