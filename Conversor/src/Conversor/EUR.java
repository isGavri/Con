package Conversor;

import javax.swing.JOptionPane;

public class EUR {
	
	public static void Dolar(double ars) {	
		double resultado = ars * 1.07;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " dolares");
	}
	public static void Euro(double ars) {
		double resultado = ars;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " euros");
	}
	public static void Libra(double ars) {
		double resultado = ars * 0.86;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " libras");
	}
	public static void Yen(double ars) {
		double resultado = ars * 157.58;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " yenes");
	}
	public static void PesoMxn(double ars) {
		double resultado = ars * 18.68;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos mexicanos");
	}
	public static void PesoARS(double ars) {
		double resultado = ars * 374.45;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos argentinos");
	}
	
}
