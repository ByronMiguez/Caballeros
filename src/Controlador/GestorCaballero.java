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
						CaballeroModelo.deleteCaballero(Formulario.leerId(scan));
						Visor.deleteCompletado();
						CaballeroModelo.cerrar();
						break;
				case Menu.UPDATE_CABALLERO:
						CaballeroModelo.conectar();
						Visor.mensajeUpdate();
						CaballeroModelo.updateCaballero(Formulario.leerId(scan), Formulario.leerCaballero(scan));
						Visor.updateCompletado();
						CaballeroModelo.cerrar();
					break;
				case Menu.READ_CABALLERO:
						CaballeroModelo.conectar();
						Visor.mensajeSelectAll();
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						CaballeroModelo.cerrar();
				default:
					break;
			}
		
		} while(opcion!=0);
		  System.out.println("ADIOS");
	      scan.close();
	}
	
}
