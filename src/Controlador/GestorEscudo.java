package Controlador;

import java.util.Scanner;

import Modelo.EscudoModelo;
import Vista.Formulario;
import Vista.Menu;
import Vista.Visor;

public class GestorEscudo {

	public static void main(String[] args) {
			run();
		}
		
		public static void run() {
			
			Scanner scan = new Scanner(System.in);
			int opcion;
			
			do {
				Menu.menuEscudo();
				
				opcion= Integer.parseInt(scan.nextLine());
				
				switch (opcion) {
				
				case Menu.INSERT_ESCUDO:
					EscudoModelo.conectar();
					Visor.mensajeInsert();
					Visor.mostrarEscudos(EscudoModelo.selectAllEscudos());
					EscudoModelo.insertEscudo(Formulario.leerEscudo(scan));
					Visor.mostrarEscudos(EscudoModelo.selectAllEscudos());
					EscudoModelo.cerrar();
				break;
				case Menu.DELETE_ESCUDO :
					EscudoModelo.conectar();
					Visor.mensajeDelete();
					Visor.mostrarEscudos(EscudoModelo.selectAllEscudos());
					EscudoModelo.deleteEscudo(Formulario.leerIdEscudo(scan));
					Visor.mostrarEscudos(EscudoModelo.selectAllEscudos());
					EscudoModelo.cerrar();
				break;
				case Menu.UPDATE_ESCUDO :
					EscudoModelo.conectar();
					Visor.mensajeUpdate();
					Visor.mostrarEscudos(EscudoModelo.selectAllEscudos());
					EscudoModelo.updateEscudo(Formulario.leerIdEscudo(scan), Formulario.leerEscudo(scan));
					Visor.mostrarEscudos(EscudoModelo.selectAllEscudos());
					EscudoModelo.cerrar();					
				break;
				case Menu.READ_ESCUDO :
					EscudoModelo.conectar();
					Visor.mensajeSelectAll();
					Visor.mostrarEscudos(EscudoModelo.selectAllEscudos());
					EscudoModelo.cerrar();
				break;
				default:
					break;
				}
			} while(opcion!=0);
		}	

}
