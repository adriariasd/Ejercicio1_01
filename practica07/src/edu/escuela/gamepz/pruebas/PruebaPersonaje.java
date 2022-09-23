package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*; 
public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Almendra");
		Personaje per02 = new Personaje("Ricardo");
		Personaje per03 = new Personaje("Bianca");
		Personaje per04 = new Personaje("Leonel");
		Personaje per05 = new Personaje("Hector");

		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());

		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;

		int n = ((int)(Math.random()*100));
		per07.setEdad(n);
		n = ((int)(Math.random()*100));
		per09.setEdad(n);

		per06.setNombre("Francisco Xavier Zepeda Flores");
		per08.setNombre("Dayana");
		per10.setNombre("Axel Fabian Eduardo David");

		System.out.println("---");
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());

	}
} 