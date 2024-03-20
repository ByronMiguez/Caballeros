package Controlador;

import java.util.Scanner;

import Modelo.Caballero;
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
		int idCaballero1;
		int idCaballero2;
		
		do {
			Menu.menuLucha();
			
			System.out.println("Ingrese su opcion");
			
			opcion= Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
				case Menu.LUCHA_ELIGIENDO:
						CaballeroModelo.conectar();
						
						Visor.bienvenidaLucha();
						Visor.mostrarCaballeros(CaballeroModelo.selectAllCaballeros());
						
						idCaballero1 = Formulario.leerIdCaballero(scan);
						do {
							idCaballero2 = Formulario.leerIdCaballero(scan);
							
						}while(idCaballero2==idCaballero1);
						
						Caballero ganador = new Caballero();
						ganador = LuchaModelo.calcularGanador(CaballeroModelo.getUnCaballero(idCaballero1), CaballeroModelo.getUnCaballero(idCaballero2));
						Visor.mensajeVictoria(ganador);
						
						CaballeroModelo.cerrar();
					break;
				case Menu.MOSTRAR_LUCHAS:
						LuchaModelo.conectar();
						Visor.mostrarLuchas(LuchaModelo.selectAllLuchas());
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
	
	


