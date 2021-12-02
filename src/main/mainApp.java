package main;

import java.util.Scanner;

public class mainApp {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("CALCULADORA");
		System.out.print("Introduce un numero: ");
		int numero1 = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce otro numero: ");
		int numero2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("\n¿Que operacion quieres hacer?");
		System.out.println("  1. Suma");
		System.out.println("  2. Resta");
		System.out.print("Opcion: ");
		int opcion = Integer.parseInt(sc.nextLine());
		int resultado = 0;
		switch (opcion) {
		
		case 1:
			resultado = numero1 + numero2;
			System.out.println("SUMA: " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println("RESTA: " + resultado);
		}
		
	}

}
