package capitulo4;

import javax.swing.JOptionPane;

public class Harmonica {
 
	public static void main(String[] args) {
		double harmonica=1.0;
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Digite um valor para n:"));
		
		for (int i = 2; i <= n; i++) {
			harmonica = harmonica + 1.0/(double)(n);
		}
		JOptionPane.showMessageDialog(null, 
				"Harmonica(n) = " + harmonica);
	}
 
}
