package com.esercitazione.sei;

import javax.swing.JOptionPane;

public class Esercizio2MesiAnno {

	public static void main(String[] args) {
		
		//INPUT DA TASTIERA
		String input = JOptionPane.showInputDialog("Inserire il Nome di un Mese");
		
		//CONVERSIONE IN CARATTERI MAIUSCOLI
		String inputMaiuscolo = input.toUpperCase();
		
		//VERIFICO I MESI DI 30 GIORNI
		if( inputMaiuscolo.equals("NOVEMBRE")
			|| inputMaiuscolo.equals("APRILE")
			|| inputMaiuscolo.equals("GIUGNO")
			|| inputMaiuscolo.equals("SETTEMBRE")) {
			
			System.out.println("30 Giorni");
		}
		//VERIFICO IL MESE DI FEBBRAIO
		else if (inputMaiuscolo.equals("FEBBRAIO")){
			
			System.out.println("28 Giorni");
		}
		//VERIFICO I MESI DI 31 GIORNI
		else if(inputMaiuscolo.equals("GENNAIO")
				|| inputMaiuscolo.equals("MARZO")
				|| inputMaiuscolo.equals("MAGGIO")
				|| inputMaiuscolo.equals("LUGLIO")
				|| inputMaiuscolo.equals("AGOSTO")
				|| inputMaiuscolo.equals("OTTOBRE")
				|| inputMaiuscolo.equals("DICEMBRE")
				)
		
		{
			System.out.println("31 Giorni");
		}
		

	}

}
