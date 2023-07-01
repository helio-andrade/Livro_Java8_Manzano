package capitulo5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a data de nascimento
        System.out.print("Digite a data de nascimento (Ex: 01-12-1991): ");
        String dataNascimentoStr = scanner.nextLine();

        // Define o formato da data
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // Converte a data de nascimento para um objeto LocalDate
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatoData);

            // Obtém a data atual
            LocalDate dataAtual = LocalDate.now();

            // Calcula a diferença em dias entre as datas
            long diasVividos = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

            // Exibe o resultado
            System.out.println("Você já viveu " + diasVividos + " dias.");

        } catch (Exception e) {
            System.out.println("Data de nascimento inválida. Certifique-se de usar o formato dd-MM-yyyy.");
        }

        // Fecha o objeto Scanner
        scanner.close();
    }
}
