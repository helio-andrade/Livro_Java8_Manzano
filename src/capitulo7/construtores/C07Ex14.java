package capitulo7.construtores;

public class C07Ex14 {
	public static void main(String[] args) {
		class Sala {
			private int quantidade;
			
			public Sala(int quantidade) {
				this.quantidade = quantidade;
			}
			
			public int pegarQuantidade() {
				return quantidade;
			}
			
			protected void finalize() {}
		}
		
		Sala sala = new Sala(10);
		
		System.out.println("\nQtde. em sala: " + sala.pegarQuantidade());
	}
}
