package capitulo5;

public class C05Ex01 {

    public static void main(String[] args) {
        // Número para cálculos
        double numero = 4.75;

        // Funções trigonométricas
        double valorSeno = Math.sin(numero); // Calcula o seno do número
        double valorCosseno = Math.cos(numero); // Calcula o cosseno do número
        double valorTangente = Math.tan(numero); // Calcula a tangente do número

        // Funções trigonométricas inversas
        double valorArcCos = Math.acos(valorCosseno); // Calcula o arco cosseno do valor do cosseno
        double valorArcSin = Math.asin(valorSeno); // Calcula o arco seno do valor do seno
        double valorArcTan = Math.atan(valorTangente); // Calcula o arco tangente do valor da tangente

        // Funções exponenciais e logarítmicas
        double valorExponencial = Math.exp(numero); // Calcula a exponencial do número
        double valorLogaritmo = Math.log(numero); // Calcula o logaritmo natural do número
        double valorPotencia = Math.pow(numero, 2); // Calcula a potência do número elevado ao quadrado

        // Funções de arredondamento
        double valorMais = Math.ceil(numero); // Arredonda para cima
        double valorMenos = Math.floor(numero); // Arredonda para baixo
        double valorArredondado = Math.round(numero); // Arredonda para o número inteiro mais próximo
        double valorArredondadoRint = Math.rint(numero); // Arredonda para o número inteiro mais próximo seguindo regras de arredondamento
        long valorArredondadoLong = Math.round(numero); // Arredonda para o número inteiro mais próximo e converte para long
        int valorAbsoluto = Math.abs(-10); // Retorna o valor absoluto (positivo) do número

        // Funções de mínimo e máximo
        double valorMinimo = Math.min(10, 20); // Retorna o menor valor entre dois números
        double valorMaximo = Math.max(10, 20); // Retorna o maior valor entre dois números

        // Funções de raiz quadrada e cúbica
        double valorRaizQuadrada = Math.sqrt(numero); // Calcula a raiz quadrada do número
        double valorRaizCubica = Math.cbrt(numero); // Calcula a raiz cúbica do número

        // Constantes
        double pi = Math.PI; // Valor de π (pi)
        double euler = Math.E; // Valor de e (número de Euler)

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
        System.out.println("pi = " + pi); // Valor de π (pi)
        System.out.println("euler = " + euler); // Valor de e (número de Euler)
    }
}

