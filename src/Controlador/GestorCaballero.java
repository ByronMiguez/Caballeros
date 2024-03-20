package Controlador;

import java.util.Scanner;

import Modelo.CaballeroModelo;
import Modelo.CaballoModelo;
import Vista.Formulario;
import Vista.Menu;
import Vista.Visor;

public class GestorCaballero {

	public static void main(String[] args) {
		run();
	}

	public static void run() {

		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.menuCaballero();
			
			System.out.println("Ingrese su opcion");
			
			opcion= Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
				case Menu.INSERT_CABALLERO:
						CaballeroModelo.conectar();
						Visor.mensajeInsert();
						CaballeroModelo.insertCaballero(Formulario.leerCaballero(scan));
						Visor.insertCompletado();
						CaballeroModelo.cerrar();
					break;
				case Menu.DELETE_CABALLERO:
						CaballeroModelo.conectar();
						Visor.mensajeDelete();
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						CaballeroModelo.deleteCaballero(Formulario.leerIdCaballero(scan));
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						Visor.deleteCompletado();
						CaballeroModelo.cerrar();
						break;
				case Menu.UPDATE_CABALLERO:
						CaballeroModelo.conectar();
						Visor.mensajeUpdate();
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						CaballeroModelo.updateCaballero(Formulario.leerIdCaballero(scan), Formulario.leerCaballero(scan));
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						Visor.updateCompletado();
						CaballeroModelo.cerrar();
					break;
				case Menu.READ_CABALLERO:
						CaballeroModelo.conectar();
						Visor.mensajeSelectAll();
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						CaballeroModelo.cerrar();
					break;
				default:
					break;
			}
		
		} while(opcion!=0);
	}
	
}
