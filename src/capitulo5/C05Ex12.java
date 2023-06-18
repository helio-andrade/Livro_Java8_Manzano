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
		str = Character.toString((char) ascii);
		
		System.out.println(ascii + " corresponde ao caractere " + str);
	}
}
