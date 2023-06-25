package capitulo5;

import org.apache.commons.*;
import org.apache.commons.text.TextTableColumn;

public class TabelaExemplo_v3 {
    public static void main(String[] args) {
        // Cria uma instância da TextTable
        TextTable table = new TextTable();

        // Define as colunas da tabela
        TextTableColumn nomeColumn = new TextTableColumn("Nome");
        TextTableColumn idadeColumn = new TextTableColumn("Idade");
        TextTableColumn enderecoColumn = new TextTableColumn("Endereço");
        TextTableColumn emailColumn = new TextTableColumn("E-mail");

        // Adiciona as colunas à tabela
        table.addColumns(nomeColumn, idadeColumn, enderecoColumn, emailColumn);

        // Adiciona os dados à tabela
        table.addRow("Maria de Oliveira", "29", "Rua Y, 456", "maria@email.com");
        table.addRow("João da Silva", "35", "Rua X, 123", "joao@email.com");
        table.addRow("Pedro Alves", "41", "Rua Z, 789", "pedro@email.com");

        // Exibe a tabela formatada
        System.out.println(table.render());
    }
}

