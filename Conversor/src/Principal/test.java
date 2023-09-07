package Principal;

import Conversor.Convertir;
import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args) {
		
		Convertir moneda = new Convertir();
		String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije tu moenda", "Currencies", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"MXN", "ARS", "EUR","USD","GBP","JPY"}, 
    			"Seleccion")).toString();
		moneda.asd(opcion);
	}
}
