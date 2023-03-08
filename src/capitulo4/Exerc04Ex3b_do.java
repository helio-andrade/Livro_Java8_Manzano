package capitulo4;

public class Exerc04Ex3b_do {

    public static void main(String[] args) {
        int soma = 0;
        int i = 1;
        do {
            soma += i;
            i++;
        } while (i <= 100);
        System.out.println("A soma dos 100 primeiros números inteiros é: " + soma);
    }
}
