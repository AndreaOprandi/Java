package Cap1_3;
/*
 * Scrivere un applicazione in modo che richieda all'utente quanti numeri
 * dovranno essere generati e un numero x. L'applicazione dovrà 
 * generare numeri non negativi minori di x.
 * 
 * Modificarla poi in modo che visualizzi i numeri in lettere e la somma in
 * lettere attraverso la classe Intero.
 */
import java.util.Random;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Intero;

public class E3_30 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		Random rn = new Random();
		Intero inte,sommaI;
		
		int x, n,somma;
		
		n=in.readInt("Numeri generati: ");
		x=in.readInt("Numero: ");
		
		somma=0;
		
		for(int i=0;i<n;i++){
			inte = new Intero(rn.nextInt(x));
			if(i==0)
				somma=inte.intValue();
			else
				somma+=inte.intValue();
			
			out.println(inte.toString());
		}
		sommaI= new Intero(somma);
		out.println("Somma: " + sommaI.toString());
	}
}
