package capitulo7.polimorfismo;

class Pai{
	
	protected void executa() {
		System.out.println("Ação na classe-pai");
	}
	
}

class Filho extends Pai{
	
	protected void executa() {
		System.out.println("Ação na classe-filho");
	}
	
}

public class C07Ex17 {
	public static void main(String[] args) {
		
		Pai pai = new Pai();
		Filho filho = new Filho();
		
		pai.executa();
		filho.executa();
		
		pai = filho;
		pai.executa();
	}
}
