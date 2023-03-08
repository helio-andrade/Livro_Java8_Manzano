package capitulo4;

public class Exerc04Ex3b_while {

    public static void main(String[] args) {
        int soma = 0;
        int i = 1;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("A soma dos 100 primeiros números inteiros é: " + soma);
    }
}
