package capitulo6;

import java.text.DecimalFormat;

import net.guiatech.livro.java.FinanMax;

public class C06Ex06 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0");
		
		double i = 0.10 / 12;
		double fv = 20000;
		double pv = 10000;
		double r = FinanMax.cterm(i, fv, pv) / 12;
		
		System.out.println("MEDIA DE "
							+ df.format(r)
							+ " anos");
	}
}
