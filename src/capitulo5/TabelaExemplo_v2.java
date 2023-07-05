package capitulo5;

public class TabelaExemplo_v2 {
    public static void main(String[] args) {
        String[][] dados = {
            { "Nome", "Idade", "Endereço", "E-mail" },
            { "Maria de Oliveira", "29", "Rua Y, 456", "maria@email.com" },
            { "João da Silva", "35", "Rua X, 123", "joao@email.com" },
            { "Pedro Alves", "41", "Rua Z, 789", "pedro@email.com" }
        };

        imprimirTabela(dados);
    }

    private static void imprimirTabela(String[][] dados) {
        int numColunas = dados[0].length;
        int[] largurasColunas = calcularLargurasColunas(dados);

        imprimirLinhaDelimitadores(numColunas, largurasColunas);

        for (String[] linha : dados) {
            imprimirValoresFormatados(linha, largurasColunas);

            imprimirLinhaDelimitadores(numColunas, largurasColunas);
        }
    }

    private static int[] calcularLargurasColunas(String[][] dados) {
        int numColunas = dados[0].length;
        int[] largurasColunas = new int[numColunas];

        for (String[] linha : dados) {
            for (int i = 0; i < numColunas; i++) {
                int larguraValor = linha[i].length();
                largurasColunas[i] = Math.max(largurasColunas[i], larguraValor);
            }
        }

        return largurasColunas;
    }

    private static void imprimirLinhaDelimitadores(int numColunas, int[] largurasColunas) {
        for (int largura : largurasColunas) {
            System.out.print("+");
            imprimirCaractere('-', largura + 2);
        }
        System.out.println("+");
    }

    private static void imprimirValoresFormatados(String[] valores, int[] largurasColunas) {
        for (int i = 0; i < valores.length; i++) {
            String formato = "| %" + largurasColunas[i] + "s ";
            System.out.printf(formato, valores[i]);
        }
        System.out.println("|");
    }

    private static void imprimirCaractere(char caractere, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print(caractere);
        }
    }
}
