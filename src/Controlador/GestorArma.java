package Controlador;

import java.util.Scanner;

import Modelo.Arma;
import Modelo.ArmaModelo;
import Vista.Formulario;
import Vista.Menu;
import Vista.Visor;

public class GestorArma {

	public static void main(String[] args) {
			run();
		}

	public static void run() {
		
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.menuArma();
			
			opcion= Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
			case Menu.INSERT_ARMA:
				ArmaModelo.conectar();
				Visor.mensajeInsert();
				ArmaModelo.insertArma(Formulario.leerArma(scan));
				Visor.insertCompletado();
				ArmaModelo.cerrar();
			break;
			case Menu.DELETE_ARMA :
				ArmaModelo.conectar();
				Visor.mensajeDelete();
				Visor.mostrarArmas(ArmaModelo.selectAllArmas());
				ArmaModelo.deleteArma(Formulario.leerIdArma(scan));
				Visor.mostrarArmas(ArmaModelo.selectAllArmas());
				Visor.deleteCompletado();
				ArmaModelo.cerrar();
			break;
			case Menu.UPDATE_ARMA :
				ArmaModelo.conectar();
				Visor.mensajeUpdate();
				Visor.mostrarArmas(ArmaModelo.selectAllArmas());
				ArmaModelo.updateArma(Formulario.leerIdArma(scan), Formulario.leerArma(scan));
				Visor.mostrarArmas(ArmaModelo.selectAllArmas());
				Visor.updateCompletado();
				ArmaModelo.cerrar();					
			break;
			case Menu.READ_ARMA :
				ArmaModelo.conectar();
				Visor.mensajeSelectAll();
				Visor.mostrarArmas(ArmaModelo.selectAllArmas());
				ArmaModelo.cerrar();
			break;
			default:
				break;
			}
		} while(opcion!=0);
	}	
}
