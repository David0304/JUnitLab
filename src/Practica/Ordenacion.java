package Practica;

/**
 * PARA QUE Ordenacion.java DE EL 100% EN EL TEST DEBES
 * INTRODUCIR CORRECTAMENTE LAS 6 FORMAS QUE TIENE EL PROGRAMA,
 * POR EJEMPLO, PRIMERAMENTE (num1 = 3, num2 = 2, num3 = 1),
 * EN SEGUNDO LUGAR (num1 = 2, num2 = 3, num3 = 1),
 * EN TERCER LUGAR (num1 = 1, num2 = 2, num3 = 3),
 * EN EL CUARTO TEST (num1 = 3, num2 = 1, num3 = 2),
 * EN EL PENÚLTIMO TEST (num1 = 1, num2 = 3, num3 = 2),
 * Y POR ÚLTIMO (num1 = 2, num2 = 1, num3 = 3).
 */

import java.util.Scanner;

public class Ordenacion 
{
	public Ordenacion()
	{
	}
	public static void ordenar3()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num1 = entrada.nextInt();
		System.out.println("Escribe el segundo número: ");
		int num2 = entrada.nextInt();
		System.out.println("Escribe el tercer número: ");
		int num3 = entrada.nextInt();
		
		String resultado = "";
		
		if (num1 > num2 && num2 > num3)
			resultado = num1 + ">" + num2 + ">" + num3;
		
		else if (num2 > num1 && num1 > num3)
			resultado = num2 + ">" + num1 + ">" + num3;
		
		else if (num3 > num1 && num1 > num2)
			resultado = num3 + ">" + num1 + ">" + num2;
		
		else if (num1 > num3 && num3 > num2)
			resultado = num1 + ">" + num3 + ">" + num2;
		
		else if (num2 > num3 && num3 > num1)
			resultado = num2 + ">" + num3 + ">" + num1;
		
		else if(num3 > num2 && num2 > num1)
			resultado = num3 + ">" + num2 + ">" + num1;
		
		System.out.println(resultado);
	}
	
}
