package Controlador;import java.time.LocalDateTime;
import java.util.Scanner;

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
					GestorArma.run();
			break;
			case Menu.MENU_ESCUDERO :
					GestorEscudero.run();
			break;
			case Menu.MENU_CABALLERO :
					GestorCaballero.run();
			break;
			case Menu.MENU_CABALLO :
					GestorCaballo.run();
					
			break;
			case Menu.MENU_ESCUDO :
					GestorEscudo.run();			
			break;
			case Menu.MENU_LUCHA :
					GestorLucha.run();
			break;
			
			default:
				break;
			}
		
		} while(opcion!=0);{
			System.out.println("ADIOS");
	        scan.close();
		}
		
	}
}
