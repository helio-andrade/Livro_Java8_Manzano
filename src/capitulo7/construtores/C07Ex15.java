package capitulo7.construtores;

public class C07Ex15 {
    public static void main(String[] args) {
        class Sala {
            private int quantidade;

            public Sala(int x) {
                quantidade = x;
            }

            public int pegarQuantidade() {
                return quantidade;
            }

            protected void finalize() {}
        }

        Sala sala = new Sala(10);

        System.out.println("Qtde. em sala = " + sala.pegarQuantidade());
    }
}
