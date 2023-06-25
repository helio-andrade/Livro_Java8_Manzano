package capitulo5;

public class TabelaExemplo_v2 {
    public static void main(String[] args) {
        String[][] dados = {
            { "Maria de Oliveira", "29", "Rua Y, 456", "maria@email.com" },
            { "João da Silva", "35", "Rua X, 123", "joao@email.com" },
            { "Pedro Alves", "41", "Rua Z, 789", "pedro@email.com" }
        };

        // Imprimir linha de delimitadores superior
        printLinhaDelimitadores(dados[0].length);

        // Imprimir cabeçalhos
        printValoresFormatados("| %-17s ", dados[0]);

        // Imprimir linha de delimitadores entre cabeçalhos e dados
        printLinhaDelimitadores(dados[0].length);

        // Imprimir linhas de dados
        for (int i = 1; i < dados.length; i++) {
            printValoresFormatados("| %-17s ", dados[i]);
        }

        // Imprimir linha de delimitadores inferior
        printLinhaDelimitadores(dados[0].length);
    }

    private static void printLinhaDelimitadores(int numColunas) {
        for (int i = 0; i < numColunas; i++) {
            System.out.print("+-------------------");
        }
        System.out.println("+");
    }

    private static void printValoresFormatados(String formato, String[] valores) {
        for (String valor : valores) {
            System.out.printf(formato, valor);
        }
        System.out.println("|");
    }
}
