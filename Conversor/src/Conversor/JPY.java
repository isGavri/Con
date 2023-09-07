package Conversor;

import javax.swing.JOptionPane;

public class JPY {
	
	public static void Dolar(double ars) {	
		double resultado = ars * 0.0068;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " dolares");
	}
	public static void Euro(double ars) {
		double resultado = ars * 0.0063;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " euros");
	}
	public static void Libra(double ars) {
		double resultado = ars * 0.0054;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " libras");
	}
	public static void Yen(double ars) {
		double resultado = ars;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " yenes");
	}
	public static void PesoMxn(double ars) {
		double resultado = ars * 0.12;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos mexicanos");
	}
	public static void PesoARS(double ars) {
		double resultado = ars * 2.38;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos argentinos");
	}
	
}
