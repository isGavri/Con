package Conversor;

import javax.swing.JOptionPane;

public class Convertir {
	
	public void asd(String op) {
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elije moneda a convertir", "Conversion currency", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"MXN", "ARS", "EUR","USD","GBP","JPY"}, 
				"Seleccion")).toString();
		
		String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                        
		
		switch(op) {
		case "ARS": 
			switch(opcion) {
			case "ARS" : ARS.PesoARS(Double.parseDouble(input));
			break;
			case "MXN" : ARS.PesoMxn(Double.parseDouble(input));
			break;
			case "USD" : ARS.Dolar(Double.parseDouble(input));
			break;
			case "EUR" : ARS.Euro(Double.parseDouble(input));
			break;
			case "GBP" : ARS.Libra(Double.parseDouble(input));
			break;
			case "JPY" : ARS.Yen(Double.parseDouble(input));
			break;
			};
			break;
		case "MXN": 
			switch(opcion) {
			case "ARS" : MXN.PesoARS(Double.parseDouble(input));
			break;
			case "MXN" : MXN.PesoMxn(Double.parseDouble(input));
			break;
			case "USD" : MXN.Dolar(Double.parseDouble(input));
			break;
			case "EUR" : MXN.Euro(Double.parseDouble(input));
			break;
			case "GBP" : MXN.Libra(Double.parseDouble(input));
			break;
			case "JPY" : MXN.Yen(Double.parseDouble(input));
			};
			break;
		case "EUR": 
			switch(opcion) {
			case "ARS" : EUR.PesoARS(Double.parseDouble(input));
			break;
			case "MXN" : EUR.PesoMxn(Double.parseDouble(input));
			break;
			case "USD" : EUR.Dolar(Double.parseDouble(input));
			break;
			case "EUR" : EUR.Euro(Double.parseDouble(input));
			break;
			case "GBP" : EUR.Libra(Double.parseDouble(input));
			break;
			case "JPY" : EUR.Yen(Double.parseDouble(input));
			};
			break;
		case "USD": 
			switch(opcion) {
			case "ARS" : USD.PesoARS(Double.parseDouble(input));
			break;
			case "MXN" : USD.PesoMxn(Double.parseDouble(input));
			break;
			case "USD" : USD.Dolar(Double.parseDouble(input));
			break;
			case "EUR" : USD.Euro(Double.parseDouble(input));
			break;
			case "GBP" : USD.Libra(Double.parseDouble(input));
			break;
			case "JPY" : USD.Yen(Double.parseDouble(input));
			};
			break;
		case "GBP": 
			switch(opcion) {
			case "ARS" : GBP.PesoARS(Double.parseDouble(input));
			break;
			case "MXN" : GBP.PesoMxn(Double.parseDouble(input));
			break;
			case "USD" : GBP.Dolar(Double.parseDouble(input));
			break;
			case "EUR" : GBP.Euro(Double.parseDouble(input));
			break;
			case "GBP" : GBP.Libra(Double.parseDouble(input));
			break;
			case "JPY" : GBP.Yen(Double.parseDouble(input));
			break;
			};
			break;
		case "YEN": 
			switch(opcion) {
			case "ARS" : JPY.PesoARS(Double.parseDouble(input));
			break;
			case "MXN" : JPY.PesoMxn(Double.parseDouble(input));
			break;
			case "USD" : JPY.Dolar(Double.parseDouble(input));
			break;
			case "EUR" : JPY.Euro(Double.parseDouble(input));
			break;
			case "GBP" : JPY.Libra(Double.parseDouble(input));
			break;
			case "JPY" : JPY.Yen(Double.parseDouble(input));
			break;
			}
		}

	}
	}
