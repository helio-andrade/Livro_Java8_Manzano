package capitulo5;

import java.util.Scanner;
import java.io.*;

public class C05Ex12 {
	public static void main(String[] args) {
		int ascii;
		String str;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um código ASCII: ");
		ascii = s.nextInt();
		
		//str = new Character(char(ascii)).toString();
		
		/*
		 *  A classe Character possui um método estático toString(char) 
		 *  que pode ser usado diretamente para converter o caractere 
		 *  em uma string, sem a necessidade de criar um objeto Character 
		 *  e chamá-lo.
		 *   
		 * */
		
		str = Character.toString((char) ascii);
		
		System.out.println(ascii + " corresponde ao caractere " + str);
	}
}
