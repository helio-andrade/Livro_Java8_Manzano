package capitulo5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class C05Ex37 {

	public static void main(String[] args) {
		LocalDateTime data1;
		LocalDateTime data2;
		
		int dia1, mes1, ano1, hora1, minuto1;
		int dia2, mes2, ano2, hora2, minuto2;
		
		double valorHora, fracaoHora, valorTotal;
		
		String edata1, ehora1;
		String edata2, ehora2;
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		// Exibe o cabeçalho do programa
		System.out.println("\n*** Estacionamento 24 HORAS ***\n\n");		
		
		// Solicita a data de entrada ao usuário
		System.out.println("Data de Entrada [dd/mm/aaaa]: ");
		edata1 = input.nextLine();
		
		// Solicita a hora de entrada ao usuário
		System.out.println("Hora de Entrada [hh:mm]: ");
		ehora1 = input.nextLine();
		
		// Solicita a data de saída ao usuário
		System.out.println("Data de Saída [dd/mm/aaaa]: ");
		edata2 = input.nextLine();
		
		// Solicita a hora de saída ao usuário
		System.out.println("Hora de Saída [hh:mm]: ");
		ehora2 = input.nextLine();
		
		// Solicita o valor da hora de estacionamento ao usuário
		System.out.println("Valor da Hora [R$]: ");
		valorHora = input.nextDouble();
		
		// Converte os valores de data e hora de entrada em objetos LocalDateTime
		dia1 = Integer.parseInt(edata1.substring(0, 2));
		mes1 = Integer.parseInt(edata1.substring(3, 5)) -1;
		ano1 = Integer.parseInt(edata1.substring(6, 10));
		hora1 = Integer.parseInt(ehora1.substring(0, 2));
		minuto1 = Integer.parseInt(ehora1.substring(3, 5));
		data1 = LocalDateTime.of(ano1, mes1, dia1, hora1, minuto1);
		
		// Converte os valores de data e hora de saída em objetos LocalDateTime
		dia2 = Integer.parseInt(edata2.substring(0, 2));
		mes2 = Integer.parseInt(edata2.substring(3, 5)) - 1;
		ano2 = Integer.parseInt(edata2.substring(6, 10));
		hora2 = Integer.parseInt(ehora2.substring(0, 2));
		minuto2 = Integer.parseInt(ehora2.substring(3, 5));
		data2 = LocalDateTime.of(ano2, mes2, dia2, hora2, minuto2);
		
		// Calcula a fração da hora com base no valor da hora de estacionamento
		fracaoHora = valorHora / 60;
		
		// Calcula o valor total a ser pago pelo estacionamento
		if (data1.compareTo(data2) > 0)
			valorTotal = ChronoUnit.SECONDS.between(data2, data1) / 60 * fracaoHora;
		else
			valorTotal = ChronoUnit.SECONDS.between(data1, data2) / 60 * fracaoHora;
		
		// Formata o valor total com duas casas decimais
		df.applyPattern("0.00");
		// Exibe o valor total a ser pago pelo estacionamento
		System.out.println("Valor a ser pago: R$ " + df.format(valorTotal));
		
		// Fecha o Scanner para liberar recursos
		input.close();

	}

}
