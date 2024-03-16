package Vista;

import java.util.Scanner;

import Modelo.Arma;

public class Formulario {

	public static Arma leerArma(Scanner scan) {
		
		Arma arma = new Arma();
		
		System.out.println("Introduce el tipo de arma");
		arma.setTipo(scan.nextLine());
		
		System.out.println("Introduce el valor del daño");
		arma.setDanio(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el número id de arma");
		arma.setIdArma(Integer.parseInt(scan.nextLine()));
		
		return arma;	
	}

	public static int leerIdArma(Scanner scan) {

		System.out.println("Introduce el numero id del arma que quieres eliminar");
		int idArma= Integer.parseInt(scan.nextLine());
		
		return idArma;
	}
}


