package Controlador;

import java.util.Scanner;

import Modelo.CaballeroModelo;
import Modelo.LuchaModelo;
import Vista.Formulario;
import Vista.Menu;
import Vista.Visor;

public class GestorLucha {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
	
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.menuLucha();
			
			System.out.println("Ingrese su opcion");
			
			opcion= Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
				case Menu.LUCHA_ELIGIENDO:
						LuchaModelo.conectar();
						//mostrar caballeros disponibles 
						Formulario.leerCaballeros();
						LuchaModelo.cerrar();
					break;
				case Menu.LUCHA_RANDOM:
						LuchaModelo.conectar();
						LuchaModelo.cerrar();
						break;
				default:
					break;
			}
		
		} while(opcion!=0);
		  System.out.println("ADIOS");
	      scan.close();
	}
}
	
	


