package net.guiatech.livro.java;

public class CalculadoraFinanceira {
	
	// Calcular termo composto
	public static double calcularTermoComposto(double taxaDeJuros, double valorFuturo, double valorPresente) {
		double termoComposto = Math.log(valorFuturo / valorPresente) / Math.log(1 + taxaDeJuros);
		return termoComposto;
	}
	
	// Calcular valor futuro
	public static double calcularValorFuturo(double pagamento, double taxaDeJuros, double numeroDePeriodos, float tipo) {
		double valorFuturo = pagamento * ((Math.pow(1 + taxaDeJuros, numeroDePeriodos) - 1) / taxaDeJuros);
		
		if (tipo == 1)
			valorFuturo = valorFuturo * (1 + taxaDeJuros);
		
		return valorFuturo;
	}
	
	// Calcular pagamento
	public static double calcularPagamento(double valorPresente, double taxaDeJuros, double numeroDePeriodos, float tipo) {
		double pagamento = valorPresente * taxaDeJuros / (1 - Math.pow((1 + taxaDeJuros), (numeroDePeriodos * -1)));
		
		if (tipo == 1)
			pagamento = pagamento / (1 + taxaDeJuros);
		
		return pagamento;
	}
	
	// Calcular valor presente
	public static double calcularValorPresente(double pagamento, double taxaDeJuros, double numeroDePeriodos, float tipo) {
		double valorPresente = pagamento * ((1 - Math.pow((1 + taxaDeJuros), (numeroDePeriodos * -1))) / taxaDeJuros);
		
		return valorPresente;
	}
	
	// Calcular taxa de juros
	public static double calcularTaxaDeJuros(double valorFuturo, double valorPresente, double numeroDePeriodos, float periodo) {
		double taxaDeJuros = (Math.pow((valorFuturo / valorPresente), (1 / numeroDePeriodos)) - 1);
		
		if (periodo == 1)
			taxaDeJuros = Math.pow(1 + taxaDeJuros, 12) - 1;
		
		return (taxaDeJuros * 100);
	}
	
	// Calcular número de períodos
	public static double calcularNumeroDePeriodos(double pagamento, double taxaDeJuros, double valorFuturo) {
		double numeroDePeriodos = Math.log(1 + (valorFuturo * taxaDeJuros / pagamento)) / Math.log(1 + taxaDeJuros);
		
		return Math.abs(numeroDePeriodos);		
	}
}
