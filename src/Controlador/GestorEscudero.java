package Controlador;

import java.util.Scanner;

import Modelo.Escudero;
import Modelo.EscuderoModelo;
import Modelo.EscudoModelo;
import Vista.Formulario;
import Vista.Menu;
import Vista.Visor;

public class GestorEscudero {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.menuEscudero();
			
			System.out.println("Ingrese su opcion");
			
			opcion= Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
				case Menu.INSERT_ESCUDERO:
						EscuderoModelo.conectar();
						Visor.mensajeInsert();
						Visor.mostrarEscuderos(EscuderoModelo.selectAllEscuderos());
						EscuderoModelo.insertEscudero(Formulario.leerEscudero(scan));
						Visor.mostrarEscuderos(EscuderoModelo.selectAllEscuderos());
						EscuderoModelo.cerrar();
					break;
				case Menu.DELETE_ESCUDERO:
						EscuderoModelo.conectar();
						Visor.mensajeDelete();
						Visor.mostrarEscuderos(EscuderoModelo.selectAllEscuderos());
						EscuderoModelo.deleteEscudero(Formulario.leerIdEscudero(scan));
						Visor.mostrarEscuderos(EscuderoModelo.selectAllEscuderos());
						EscuderoModelo.cerrar();
						break;
				case Menu.UPDATE_ESCUDERO:
						EscuderoModelo.conectar();
						Visor.mensajeUpdate();
						Visor.mostrarEscuderos(EscuderoModelo.selectAllEscuderos());
						EscuderoModelo.updateEscudero(Formulario.leerIdEscudero(scan), Formulario.leerEscudero(scan));
						Visor.mostrarEscuderos(EscuderoModelo.selectAllEscuderos());
						EscuderoModelo.cerrar();
					break;
				case Menu.READ_ESCUDERO:
						EscuderoModelo.conectar();
						Visor.mensajeSelectAll();
						Visor.mostrarEscuderos(EscuderoModelo.selectAllEscuderos());
						EscudoModelo.cerrar();
					break;
				default:
					break;
			}
		
		} while(opcion!=0);
		}
	}
