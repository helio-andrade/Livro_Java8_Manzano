public class TabelaExemplo {
    public static void main(String[] args) {
        String[] campos = { "Nome", "Idade", "Cidade" };
        String[][] dados = {
            { "João", "25", "São Paulo" },
            { "Maria", "30", "Rio de Janeiro" },
            { "Pedro", "35", "Belo Horizonte" }
        };

        // Imprimir cabeçalho
        for (String campo : campos) {
            System.out.printf("%-15s", campo);
        }
        System.out.println();

        // Imprimir linhas de dados
        for (String[] linha : dados) {
            for (String valor : linha) {
                System.out.printf("%-15s", valor);
            }
            System.out.println();
        }
    }
}
