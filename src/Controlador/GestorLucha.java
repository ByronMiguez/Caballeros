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
						CaballeroModelo.conectar();
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						int idCaballero1 = Formulario.leerIdCaballero(scan);
						int idCaballero2 = Formulario.leerIdCaballero(scan);
						CaballeroModelo.getUnCaballero(idCaballero1);
						CaballeroModelo.getUnCaballero(idCaballero2);									
						LuchaModelo.aumentarValores(LuchaModelo.calcularGanador(CaballeroModelo.getUnCaballero(idCaballero1), CaballeroModelo.getUnCaballero(idCaballero2)));
						CaballeroModelo.cerrar();
				break;
				case Menu.MOSTRAR_LUCHAS:
						LuchaModelo.conectar();
						LuchaModelo.cerrar();
				break;
				default:
					break;
			}	
		} while(opcion!=0);
	}
}
	
	


