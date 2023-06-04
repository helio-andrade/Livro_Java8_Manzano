package capitulo5;

public class C05Ex01 {

    public static void main(String[] args) {
        // Número para cálculos
        double numero = 4.75;

        // Funções trigonométricas
        double valorSeno = Math.sin(numero);
        double valorCosseno = Math.cos(numero);
        double valorTangente = Math.tan(numero);

        // Funções trigonométricas inversas
        double valorArcCos = Math.acos(valorCosseno);
        double valorArcSin = Math.asin(valorSeno);
        double valorArcTan = Math.atan(valorTangente);

        // Funções exponenciais e logarítmicas
        double valorExponencial = Math.exp(numero);
        double valorLogaritmo = Math.log(numero);
        double valorPotencia = Math.pow(numero, 2);

        // Funções de arredondamento
        double valorMais = Math.ceil(numero);
        double valorMenos = Math.floor(numero);
        double valorArredondado = Math.round(numero);
        double valorArredondadoRint = Math.rint(numero);
        long valorArredondadoLong = Math.round(numero);
        int valorAbsoluto = Math.abs(-10);

        // Funções de mínimo e máximo
        double valorMinimo = Math.min(10, 20);
        double valorMaximo = Math.max(10, 20);

        // Funções de raiz quadrada e cúbica
        double valorRaizQuadrada = Math.sqrt(numero);
        double valorRaizCubica = Math.cbrt(numero);

        // Constantes
        double pi = Math.PI;
        double euler = Math.E;

        // Exibição dos resultados
        System.out.println("sin(" + numero + ") = " + valorSeno);
        System.out.println("cos(" + numero + ") = " + valorCosseno);
        System.out.println("tan(" + numero + ") = " + valorTangente);
        System.out.println("acos(cos(" + numero + ")) = " + valorArcCos);
        System.out.println("asin(sin(" + numero + ")) = " + valorArcSin);
        System.out.println("atan(tan(" + numero + ")) = " + valorArcTan);
        System.out.println("exp(" + numero + ") = " + valorExponencial);
        System.out.println("log(" + numero + ") = " + valorLogaritmo);
        System.out.println(numero + " ^ 2 = " + valorPotencia);
        System.out.println("ceil(" + numero + ") = " + valorMais);
        System.out.println("floor(" + numero + ") = " + valorMenos);
        System.out.println("round(" + numero + ") = " + valorArredondado);
        System.out.println("rint(" + numero + ") = " + valorArredondadoRint);
        System.out.println("round(" + numero + ") = " + valorArredondadoLong);
        System.out.println("abs(-10) = " + valorAbsoluto);
        System.out.println("min(10, 20) = " + valorMinimo);
        System.out.println("max(10, 20) = " + valorMaximo);
        System.out.println("sqrt(" + numero + ") = " + valorRaizQuadrada);
        System.out.println("cbrt(" + numero + ") = " + valorRaizCubica);
        System.out.println("pi = " + pi);
        System.out.println("euler = " + euler);
    }
}
