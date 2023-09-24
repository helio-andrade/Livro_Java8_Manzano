package capitulo4;
import java.util.Scanner;

public class Exerc04Ex1a {
    public static void main(String[] args) {
        float tempo, velocidade, distancia, litrosUsados;
        Scanner input = new Scanner(System.in);

        System.out.print("Tempo gasto (em horas): ");
        tempo = input.nextFloat();

        System.out.print("Velocidade média (em Km/h): ");
        velocidade = input.nextFloat();

        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.printf("Velocidade média ......: %.2f Km/h\n", velocidade);
        System.out.printf("Tempo gasto ...........: %.2f h\n", tempo);
        System.out.printf("Distância percorrida ..: %.2f Km\n", distancia);
        System.out.printf("Combustível gasto .....: %.2f litro(s)\n", litrosUsados);

        input.nextLine(); // limpa o buffer do teclado
        System.out.println("\nTecle ENTER para sair...");
        input.nextLine(); // aguarda o ENTER
        
        input.close();
    }
}
