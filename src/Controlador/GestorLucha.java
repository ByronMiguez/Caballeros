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
						//Visor ->mensaje para la bienvenida
						
						//mostrar caballeros disponibles 
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						
						//formulario leer id caballero 1
						int idCaballero1 = Formulario.leerIdCaballero(scan);
						
						//formulario leer id caballero 2
						int idCaballero2 = Formulario.leerIdCaballero(scan);
						
						//getCaballero1
						CaballeroModelo.getUnCaballero(idCaballero1);
						
						//getCaballero2
						CaballeroModelo.getUnCaballero(idCaballero2);
						
						//realizar la lucha
						LuchaModelo.aumentarValores(LuchaModelo.calcularGanador(CaballeroModelo.getUnCaballero(idCaballero1), CaballeroModelo.getUnCaballero(idCaballero2)));
						
						//Visor ->mostrar el resultado de la lucha en pantalla
						
						//guardar el resultado de la lucha en la BBDD gestorBBDD

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
	
	


