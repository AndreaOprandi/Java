package Cap1_3;
/*
 * Scrivete un'applicazione che legga un prezzo espresso in euro
 * (euro e centisimi di euro) e comunichi:
 * 
 * 	°  il prezzo letto scritto prima in cifre e poi in lettere(nel formato che si utilizza
 * 		 per gli assegni: ad esempio 12,05 si scrive "dodici/05");
 * 	°  l'equivalente in lire scritto in cifre e in lettere.
 * 
 * L'applicazione deve poi leggere una percentuale di sconto(come numero intero) da
 * applicare al prezzo e deve poi comunicare:
 * 
 * 	°  lo sconto in euro;
 * 	°  il prezzo scontato in euro.
 * 
 * Infine l'applicazione deve leggere un importo pagato espresso in euro e comunicare il
 * debito o il resto rispetto al prezzo scontato ( utilizzare le classi Importo e Intero del 
 * package prog.utili).
 * 
 * pg. 118
 */

import prog.io.*;
import prog.utili.*;

public class E3_27 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		Importo cifra,sconto,pagato,resto;
		Intero er;
		int euro, cent, scontop,ep,cp;
		
		ep = 0;
		cp=0;
		
		out.println("Inserire il prezzo: ");
		euro = in.readInt("---  euro? ");
		cent = in.readInt("---  cenesimit? ");
		
		cifra = new Importo(euro,cent);
		er = new Intero(cifra.getEuro());
		
		out.println("Prezzo:   EURO " +cifra + "  (" + er.toString() + "/" + cifra.getCent()+ ")");
		er = new Intero(cifra.toLire());
		out.println("Prezzo:   Lire: "+cifra.toLire() + "  ("+ er.toString() +")");
	
		scontop = in.readInt("Percentuale di sconto? ");
		sconto = cifra.diviso(100).per(scontop);
		cifra = cifra.meno(sconto);
		out.println("Sconto:		EURO   " + sconto);
		out.println("Prezzo scontato:	EURO   " + cifra);
	
		out.println("Inserire l'importo pagato:");
		ep = in.readInt("--- euro? ");
		cp = in.readInt("--- centesimi? ");
		
		pagato = new Importo(ep,cp);
		out.println("Importo pagato: EURO  " + pagato);
		
		resto = pagato.meno(cifra);
		out.println("Resto: EURO " + resto);
	}
}
