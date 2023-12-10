package capitulo7;

import java.util.ArrayList;
import java.util.List;

public class C07Ex06v2 {

	public static void main(String[] args) {

		List<C07Ex06Livro> livros = new ArrayList<>();
		livros.add(new C07Ex06Livro("A Ilha do Tesouro"));
		livros.add(new C07Ex06Livro("20.000 Léguas Submarinas"));

		livros.forEach(livro -> System.out.println(livro.getNome()));
	}
}
