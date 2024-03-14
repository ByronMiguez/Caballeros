package Controlador;import java.util.Scanner;

import Vista.Menu;

public class GestorMain {

	public static void main(String[] args) {
			run();
		}

	private static void run() {
		
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.menuGeneral();
			
			opcion= Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
			case Menu.MENU_ARMA :
					Menu.menuArma();
			break;
			case Menu.MENU_ESCUDERO :
					//menuescudero
			break;
			case Menu.MENU_CABALLERO :
					//menucaballero
			break;
			case Menu.MENU_CABALLO :
					//menucaballo
			break;
			case Menu.MENU_ESCUDO :
					//menuescudo
			break;
			case Menu.MENU_LUCHA :
					//menulucha
			break;
			
			default:
				break;
			}
		
		} while(opcion!=0);
		
	}
}
