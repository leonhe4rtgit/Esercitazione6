package com.esercitazione.sei;

import javax.swing.JOptionPane;

public class Esercizio1 {

	public static void main(String[] args) {

		// LEGGO N INPUT DA TASTIERA
		String input = JOptionPane.showInputDialog("Inserire il Valore della Quota");

		// VERIFICARE CHE LA STRINGA DI INPUT NON SIA VUOTA
		if (!input.equals("")) {

			// CONVERSIONE DELLA STRINGA IN INTERO
			int quota = Integer.parseInt(input);

			// IN CASO DI QUOTA NEGATIVA
			if (quota < 0) {

				System.out.println("ERRORE!");
				
			// IN CASO DI QUOTA MAGGIORE O UGUALE A 0 E MINORE DI 300
			} else if (quota >= 0 && quota < 300) {

				System.out.println("PIANURA");

			// IN CASO DI QUOTA MINORE DI 700 E MAGGIORE O UGUALE A 300
			} else if (quota < 700 && quota >= 300) {

				System.out.println("COLLINA");
				
			// IN CASO DI QUOTA MAGGIORE O UGUALE A 700
			} else if (quota >= 700) {

				System.out.println("MONTAGNA");
			}

		}

	}

}
