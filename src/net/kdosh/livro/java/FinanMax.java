package net.kdosh.livro.java;

public class FinanMax {
	
	// Método: cterm()	
	public static double cterm(double i, double fv, double pv) {
		double cterm = Math.log(fv / pv) / Math.log(1 + i);
		return (cterm);
	}
	
	// Método: fv()
	public static double fv(double pmt, double i, double n, float tipo) {
		double fv = pmt * ((Math.pow(1 + i, n) - 1) / i);
		
		if (tipo == 1)
			fv = fv * (1 + i);
		
		return(fv);
	}
	
	// Método: pmt()
	public static double pmt(double pv, double i, double n, float tipo) {
		double pmt = pv * i / (1 - Math.pow((1 + i), (n * -1)));
		
		if (tipo == 1)
			pmt = pmt / (1 + i);
		return (pmt);
	}
	
	// Método: pv()
	public static double pv(double pmt, double i, double n, float tipo) {
		double pv = pmt * ((1 - Math.pow((1 + i), (n * -1))) / i);
		
		return pv;
	}
	
	// Método: rate()
	public static double rate(double fv, double pv, double n, float periodo) {
		double rate = (Math.pow((fv / pv), (1 / n)) - 1);
		
		if (periodo == 1)
			rate = Math.pow(1 + rate, 12) - 1;
		
		return(rate * 100);
	}
	
	// Método: term()
	public static double term(double pmt, double i, double fv) {
		double term = Math.log(1 + (fv * i / pmt)) / Math.log(1 + i);
		
		return(Math.abs(term));		
	}
}
