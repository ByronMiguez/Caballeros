package Vista;

import java.util.Scanner;

import Modelo.Arma;
import Modelo.Caballero;
import Modelo.Caballo;
import Modelo.Escudero;
import Modelo.Escudo;

public class Formulario {

	public static Scanner scan = new Scanner (System.in);
	
	public static Arma leerArma(Scanner scan) {
		
		Arma arma = new Arma();
		
		System.out.println("Introduce el tipo de arma");
		arma.setTipo(scan.nextLine());
		
		System.out.println("Introduce el valor del daño");
		arma.setDanio(Integer.parseInt(scan.nextLine()));
		
		return arma;	
	}

	public static Escudo leerEscudo(Scanner scan) {
		
		Escudo escudo = new Escudo();
		
		System.out.println("Introduce el tipo de escudo");
		escudo.setTipo(scan.nextLine());
		
		System.out.println("Introduce el valor de la defensa");
		escudo.setDefensa(Integer.parseInt(scan.nextLine()));
		
		return escudo;
	}
	
	public static Escudero leerEscudero(Scanner scan) {
		
		Escudero escudero = new Escudero();

		
		System.out.println("Introduce un nombre de escudero");
		escudero.setNombre(scan.nextLine());
		
		System.out.println("Introduce la experiencia del escudero");
		escudero.setExperiencia(Integer.parseInt(scan.nextLine()));
		
		return escudero;
	}
	public static Caballero leerCaballero(Scanner scan) {
		
		Caballero caballero = new Caballero();
	
		System.out.println("Introduce un nombre de caballero");
		caballero.setNombre(scan.nextLine());
		
		System.out.println("Introduce la experiencia del caballero");
		caballero.setExperiencia(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el daño del caballero");
		caballero.setDanioCaballero(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce la velocidad del caballero");
		caballero.setVelocidadCaballero(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el arma del caballero");
		caballero.getArma().setIdArma(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el escudo del caballero");
		caballero.getEscudo().setIdEscudo(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el caballo del caballero");
		caballero.getCaballo().setIdCaballo(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el escudero del caballero");
		caballero.getEscudero().setIdEscudero(Integer.parseInt(scan.nextLine()));
		
		return caballero;
	}
	public static Caballo leerCaballo(Scanner scan) {
		Caballo caballo = new Caballo();
		
		System.out.println("Introduce un nombre de caballo");
		caballo.setNombre(scan.nextLine());
		
		System.out.println("Introduce la velocidad del caballo");
		caballo.setVelocidad(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce la resistencia del caballo");
		caballo.setResistencia(Integer.parseInt(scan.nextLine()));
		
		
		return caballo;
	}
	
	//vale para leer cualquier id
	public static int leerId(Scanner scan) {

		System.out.println("Introduce el numero id de la fila que quieres eliminar");
		int id= Integer.parseInt(scan.nextLine());
		
		return id;
	}
}


