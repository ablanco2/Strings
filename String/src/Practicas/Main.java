package Practicas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cad1;
		String cad2;
		System.out.print("Ingrese la primer cadena:");
		cad1 = teclado.nextLine();
		System.out.print("Ingrese la segunda cadena:");
		cad2 = teclado.nextLine();
		if (cad1.equals(cad2) == true) {
			System.out.println(cad1 + " es exactamente igual a " + cad2);
		} else {
			System.out.println(cad1 + " no es exactamente igual a " + cad2);
		}
		if (cad1.equalsIgnoreCase(cad2) == true) {
			System.out.println(cad1 + " es igual a: " + cad2 + ", sin tener en cuenta may�sculas/min�sculas");
		} else {
			System.out.println(cad1 + " no es igual a: " + cad2 + ", sin tener en cuenta may�sculas/min�sculas");
		}
		if (cad1.compareTo(cad2) == 0) {
			System.out.println(cad1 + " es exactamente igual a: " + cad2);
		} else {
			if (cad1.compareTo(cad2) > 0) {
				System.out.println(cad1 + " es mayor alfab�ticamente que: " + cad2);
			} else {
				System.out.println(cad2 + " es mayor alfab�ticamente que: " + cad1);
			}
		}
		char carac1 = cad1.charAt(0);
		System.out.println("El primer caracter de: " + cad1 + " es: " + carac1);
		int largo = cad1.length();
		System.out.println("El largo del String: " + cad1 + " es: " + largo);
		String cad3 = cad1.substring(0, 3);
		System.out.println("Los primeros tres caracteres de: " + cad1 + " son: " + cad3);
		int posi = cad1.indexOf(cad2);
		if (posi == -1) {
			System.out.println(cad2 + ", no est� contenido en: " + cad1);
		} else {
			System.out.println(cad2 + ", est� contenido en: " + cad1 + ", a partir de la posici�n: " + posi);
		}
		System.out.println(cad1 + ", convertido a may�sculas es: " + cad1.toUpperCase());
		System.out.println(cad1 + ", convertido a min�sculas es: " + cad1.toLowerCase());
	}

}

