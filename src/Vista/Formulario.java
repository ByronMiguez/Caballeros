package Vista;

import java.util.Scanner;

import Modelo.Arma;
import Modelo.Escudo;

public class Formulario {

	public static Arma leerArma(Scanner scan) {
		
		Arma arma = new Arma();
		
		System.out.println("Introduce el tipo de arma");
		arma.setTipo(scan.nextLine());
		
		System.out.println("Introduce el valor del daño");
		arma.setDanio(Integer.parseInt(scan.nextLine()));
		
		return arma;	
	}
	//vale para leer cualquier id
	public static int leerId(Scanner scan) {

		System.out.println("Introduce el numero id de la fila que quieres eliminar");
		int id= Integer.parseInt(scan.nextLine());
		
		return id;
	}

	public static Escudo leerEscudo(Scanner scan) {
		
		Escudo escudo = new Escudo();
		
		System.out.println("Introduce el tipo de escudo");
		escudo.setTipo(scan.nextLine());
		
		System.out.println("Introduce el valor de la defensa");
		escudo.setDefensa(Integer.parseInt(scan.nextLine()));
		
		return escudo;
	}
	
}


