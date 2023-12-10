package capitulo7;

public class C07Ex06 {
	public static void main(String[] args) {
		
		class Livro {
			String nome;
		}
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		
		livro1.nome = "A Ilha do Tesouro";
		livro2.nome = "20.000 Léguas Submarinas";
		
		System.out.println("\nLivro #1: " + livro1.nome +
						   "\nLivro #2: " + livro2.nome + "\n");
		
		//livro1 = null;
		
		System.out.println("\nLivro #1: " + livro1.nome +
				   		   "\nLivro #2: " + livro2.nome + "\n");
	}
}
