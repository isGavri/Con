package Conversor;

import javax.swing.JOptionPane;

public class ARS {
	
	public static void Dolar(double ars) {	
		double resultado = ars * 0.0029;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " dolares");
	}
	public static void Euro(double ars) {
		double resultado = ars * 0.0027;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " euros");
	}
	public static void Libra(double ars) {
		double resultado = ars * 0.0023;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " libras");
	}
	public static void Yen(double ars) {
		double resultado = ars * 0.42;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " yenes");
	}
	public static void PesoMxn(double ars) {
		double resultado = ars * 0.049;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos mexicanos");
	}
	public static void PesoARS(double ars) {
		double resultado = ars;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos argentinos");
	}
	

}
