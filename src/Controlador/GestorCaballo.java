package Controlador;

import java.util.Scanner;

import Modelo.CaballoModelo;
import Modelo.EscuderoModelo;
import Modelo.EscudoModelo;
import Vista.Formulario;
import Vista.Menu;
import Vista.Visor;

public class GestorCaballo {

	public static void main(String[] args) {
		run();
		
	}

	public static void run() {
	 
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.menuCaballo();
			
			System.out.println("Ingrese su opcion");
			
			opcion= Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
				case Menu.INSERT_CABALLO:
						CaballoModelo.conectar();
						Visor.mensajeInsert();
						CaballoModelo.insertCaballo(Formulario.leerCaballo(scan));
						Visor.insertCompletado();
						CaballoModelo.cerrar();
					break;
				case Menu.DELETE_CABALLO:
						CaballoModelo.conectar();
						Visor.mensajeDelete();
						Visor.mostrarCaballos(CaballoModelo.selectAllCaballos());
						CaballoModelo.deleteCaballo(Formulario.leerId(scan));
						Visor.mostrarCaballos(CaballoModelo.selectAllCaballos());
						Visor.deleteCompletado();
						CaballoModelo.cerrar();
						break;
				case Menu.UPDATE_CABALLO:
						CaballoModelo.conectar();
						Visor.mensajeUpdate();
						Visor.mostrarCaballos(CaballoModelo.selectAllCaballos());
						CaballoModelo.updateCaballo(Formulario.leerId(scan), Formulario.leerCaballo(scan));
						Visor.mostrarCaballos(CaballoModelo.selectAllCaballos());
						Visor.updateCompletado();
						CaballoModelo.cerrar();
					break;
				case Menu.READ_CABALLO:
						CaballoModelo.conectar();
						Visor.mensajeSelectAll();
						Visor.mostrarCaballos(CaballoModelo.selectAllCaballos());
						CaballoModelo.cerrar();
					break;
				default:
					break;
			}
		
		} while(opcion!=0);
	}
	

}
