import java.util.Scanner;

/**
 Programa exemplo para cálculo de tabuado de um valor numérico qualquer
 fornecido a partir do teclado para operação em modo console.
*/

/*
  Programa ........: Tabuada (C04Ex24.java)
  Autor(es) .......: Augusto Manzano & roberto Affonso
  Data ............: 10/06/2010
  Versão ..........: 1.2
  Revisão .........: 25/07/2010
 */

public class C04Ex24 {

	public static void main(String[] args) {
		int n, i, r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nPrograma: TABUADA");
		System.out.println("\nEntre um valor inteiro para cálculo: ");
		n = sc.nextInt();
		
		/**
		 * 	O trecho de código seguinte é responsável pela apresentação
		 * da tabuada de um valor numérico qualquer.
		 */
		
		for (i = 1; i <= 10; i++) {
			// Cálculo da tabuada propriamente dito
			r = n * i;
			
			// Apresnetação da tabuada no formato: n x i = r
			System.out.printf("%3d x %2d = %3d \n", n, i, r);
		}

	}

}
