package Cap1_3;
/*
 * Costruite un programma che legga una sequenza di prezzi espressi in lire e 
 * visualizzi la somma e la media dei corrispondenti prezzi in euro.
 * La fine della sequenza viene indicata mediante l'inserimento da parte
 * dell'utente del numero 0 (che non fa parte della sequenza) al posto del prezzo
 */

import prog.io.*;
import prog.utili.*;

public class E3_28 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int conta;
		Importo lire,somma,media;
		boolean primo;
		
		somma=new Importo(0);
		
		primo=true;
		conta=0;
		do{
			lire = new Importo(in.readInt("Lire: "));
			

		    somma = primo ? lire : somma.piu(lire) ;
		    primo=false;
		   
			if(lire.toString().charAt(0)=='0')
				break;
			conta++;
		}while(true);
		media = somma.diviso(conta);
		 
		
		somma = somma.diviso((int) somma.toLIRE);
		media = media.diviso((int) media.toLIRE);
		
		out.println("Somma " + somma);
		out.println("Media " + media);
	}
}
