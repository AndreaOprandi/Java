package Cap1_3;
/*
 * Considerate la classe Importo.
 * Scrivete un'applicazione che legga i prezzi dei prodotti acquistati e la percentuale di sconto,
 * e comunichi il prezzo totale da pagare, avendo applicato lo sconto al prodotto più costoso.
 */


import prog.io.*;
import prog.utili.*;

public class E3_26 {
	public static void main(String[] args) {
			ConsoleInputManager in =new ConsoleInputManager();
			ConsoleOutputManager out = new ConsoleOutputManager();
			
			Importo cifra,totale,max,sconto,totales;
			boolean ex,primo;
			int euro,cent,scontop;
			
			totale = new Importo(0); //azzero totale
			max = new Importo(0);
			
			ex=true;
			primo=true;
			do{
					euro = in.readInt("Prezzo: euro? ");
					cent = in.readInt("              cent? ");
					cifra = new Importo(euro,cent);
					
					if(primo){
						totale = cifra;
						max = cifra;
						primo = false;
					}else{
						totale = totale.piu(cifra);
						if(max.isMinore(cifra))
							max = cifra;
					}
					ex = in.readSiNo("Altri prodotti? ");
			}while(ex);
			
			scontop = in.readInt("Sconto? ");
			sconto = max.diviso(100).per(scontop); 
			
			out.println("TOTALE EURO " + totale);
		   out.println("SCONTO "+ scontop+"% su "+ max +": EURO " + sconto);
		   totales = totale.meno(sconto);
		   out.println("TOTALE SCONTATO: EURO "+ totales + "(Lire " 
				   +totale.toLire()+")");
	}
}
