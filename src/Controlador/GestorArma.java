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
		Arma arma = new Arma();
		
		do {
			Menu.menuArma();
			
			opcion= Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
			case Menu.INSERT_ARMA:
				ArmaModelo.conectar();
				arma = Formulario.leerArma(scan);
				ArmaModelo.insertArma(arma);
				ArmaModelo.cerrar();
			break;
			case Menu.DELETE_ARMA :
					
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
