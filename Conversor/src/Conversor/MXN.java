package Conversor;

import javax.swing.JOptionPane;

public class MXN {
	
	public static void Dolar(double ars) {	
		double resultado = ars * 0.057;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " dolares");
	}
	public static void Euro(double ars) {
		double resultado = ars * 0.053;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " euros");
	}
	public static void Libra(double ars) {
		double resultado = ars * 0.046;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " libras");
	}
	public static void Yen(double ars) {
		double resultado = ars * 8.43;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " yenes");
	}
	public static void PesoMxn(double ars) {
		double resultado = ars;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos mexicanos");
	}
	public static void PesoARS(double ars) {
		double resultado = ars * 20.02;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos argentinos");
	}
	
}
