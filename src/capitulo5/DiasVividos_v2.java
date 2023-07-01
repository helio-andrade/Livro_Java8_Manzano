package capitulo5;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DiasVividos_v2 {
    public static void main(String[] args) {
        // Solicita ao usuário que insira a data de nascimento
        String dataNascimentoStr = JOptionPane.showInputDialog(null,
                "Digite a data de nascimento (Ex: 01-12-1991):");

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
            JOptionPane.showMessageDialog(null, "Você já viveu " + diasVividos + " dias.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data de nascimento inválida. Certifique-se de usar o formato dd-MM-yyyy.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
