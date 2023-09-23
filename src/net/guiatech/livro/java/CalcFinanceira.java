package net.guiatech.livro.java;

public class CalcFinanceira {
	
	// Calcula o termo composto
	public static double termoComp(double j, double vf, double vp) {
		return Math.log(vf / vp) / Math.log(1 + j);
	}
	
	// Calcula o valor futuro
	public static double valFut(double pmt, double j, double n, float tipo) {
		double vf = pmt * ((Math.pow(1 + j, n) - 1) / j);
		
		if (tipo == 1)
			vf = vf * (1 + j);
		
		return vf;
	}
	
	// Calcula o pagamento
	public static double pagamento(double vp, double j, double n, float tipo) {
		double pmt = vp * j / (1 - Math.pow((1 + j), (n * -1)));
		
		if (tipo == 1)
			pmt = pmt / (1 + j);
		
		return pmt;
	}
	
	// Calcula o valor presente
	public static double valPresente(double pmt, double j, double n, float tipo) {
		double vp = pmt * ((1 - Math.pow((1 + j), (n * -1))) / j);
		
		return vp;
	}
	
	// Calcula a taxa de juros
	public static double taxaJuros(double vf, double vp, double n, float periodo) {
		double j = (Math.pow((vf / vp), (1 / n)) - 1);
		
		if (periodo == 1)
			j = Math.pow(1 + j, 12) - 1;
		
		return (j * 100);
	}
	
	// Calcula o número de períodos
	public static double numPeriodos(double pmt, double j, double vf) {
		double n = Math.log(1 + (vf * j / pmt)) / Math.log(1 + j);
		
		return Math.abs(n);		
	}
}
