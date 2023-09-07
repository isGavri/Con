package Conversor;

import javax.swing.JOptionPane;

public class USD {

	public static void Dolar(double ars) {	
		double resultado = ars;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " dolares");
	}
	public static void Euro(double ars) {
		double resultado = ars * 0.94;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " euros");
	}
	public static void Libra(double ars) {
		double resultado = ars * 0.80;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " libras");
	}
	public static void Yen(double ars) {
		double resultado = ars * 147.38;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " yenes");
	}
	public static void PesoMxn(double ars) {
		double resultado = ars * 17.49;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos mexicanos");
	}
	public static void PesoARS(double ars) {
		double resultado = ars * 350.01;
		JOptionPane.showMessageDialog(null, "$" +resultado+ " pesos argentinos");
	}
	
}
