package Cap1_3;
import prog.io.*;
import prog.utili.*;

public class E3_6 {
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		Importo i;
		Importo i1;
		int decidi,euro, cent,lire;
		double somma, media, differenza;
		
		boolean scelta=false; //se vale false programma in euro
		
		decidi=in.readInt("Vuoi lavorare in lire o euro? 1 lire 0 euro: ");
		if(decidi==1)
			scelta=true;
		else
			scelta=false;
			
		if(scelta==false){
			euro = in.readInt("Inserisci il primo importo, parte in euro: ");
			cent = in.readInt("Inserisci il primo importo, parte in centesimi: ");
			i = new Importo(euro,cent);
			
			euro = in.readInt("Inserisci il secondo importo, parte in euro: ");
			cent = in.readInt("Inserisci il secondo importo, parte in centesimi: ");
			i1 = new Importo(euro,cent);
		}
		else{
			lire = in.readInt("Inserisci il primo importo in Lire: ");
			i=new Importo(lire);
			i=i.fromLire(lire);
		
			lire = in.readInt("Inserisci il secondo importo in Lire: ");
			i1=new Importo(lire);
			i1=i1.fromLire(lire);
		}
		out.println("La somma dei due importi: "+i.piu(i1));
		out.println("La media dei due importi: "+i.piu(i1).diviso(2));
		
		if(i.isMaggiore(i1))
			out.println("La differenza tra i due importi e': " + i.meno(i1));
		else
			out.println("La differenza tra i due importi e': " + i1.meno(i));
	}
}
