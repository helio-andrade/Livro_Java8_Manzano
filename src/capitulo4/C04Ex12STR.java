package capitulo4;
import java.util.Scanner;

public class C04Ex12STR {

	public static void main(String[] args) {
		String mes;
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Entre um valor referente a um MES: ");
		mes = s.nextLine();
		
		System.out.println();
		
		switch (mes) {
			case  "um": System.out.println("Janeiro"); 		break;
			case  "dois": System.out.println("Fevereiro"); 	break;
			case  "tres": System.out.println("Março"); 		break;
			case  "qautro": System.out.println("Abril"); 	break;
			case  "cinco": System.out.println("Maio"); 		break;
			case  "seis": System.out.println("Junho"); 		break;
			case  "sete": System.out.println("Julho"); 		break;
			case  "oito": System.out.println("Agosto"); 	break;
			case  "nove": System.out.println("Setembro"); 	break;
			case  "dez": System.out.println("Outubro"); 	break;
			case  "onze": System.out.println("Novembro"); 	break;
			case  "doze": System.out.println("Dezembro"); 	break;
			default: System.out.println("Mês inválido!");	break;
		}
	}

}
