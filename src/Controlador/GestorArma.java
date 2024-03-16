package Controlador;

import java.util.Scanner;

import Modelo.Arma;
import Modelo.ArmaModelo;
import Vista.Formulario;
import Vista.Menu;

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
				ArmaModelo.insertArma(Formulario.leerArma(scan));
				ArmaModelo.cerrar();
			break;
			case Menu.DELETE_ARMA :
				ArmaModelo.conectar();
				ArmaModelo.deleteArma(Formulario.leerIdArma(scan));
				ArmaModelo.cerrar();
			break;
			case Menu.UPDATE_ARMA :
					
			break;
			case Menu.READ_ARMA :
				
			break;
			default:
				break;
			}
		} while(opcion!=0);
		
	}	
}
