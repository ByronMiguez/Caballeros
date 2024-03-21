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
						LuchaModelo.conectar();
						Visor.bienvenidaLucha();
						do {
							
							idCaballero1 = Formulario.leerIdCaballero(scan);
							idCaballero2 = Formulario.leerIdCaballero(scan);
							
						}while(idCaballero1==idCaballero2);
						Caballero resultado = new Caballero();
						resultado = LuchaModelo.calcularGanador(CaballeroModelo.getUnCaballero(idCaballero1), CaballeroModelo.getUnCaballero(idCaballero2));
						Visor.mensajeResultado(resultado);
						CaballeroModelo.cerrar();
						LuchaModelo.cerrar();
					break;

				case Menu.MOSTRAR_LUCHAS:
						CaballeroModelo.conectar();
						LuchaModelo.conectar();
						Visor.mostrarLuchas(LuchaModelo.selectAllLuchas());
						CaballeroModelo.cerrar();
						LuchaModelo.cerrar();
				break;
				default:
					break;
			}	
		} while(opcion!=0);
	}
}
	
	


