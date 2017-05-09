package cap5;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class E5_7 {
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		final int MAX= in.readInt("Quante frazioni vuoi inserire?");
		if(MAX!=0){
			Frazione[] frazioni=new Frazione[MAX];
			Frazione somma= new Frazione(0), media;
			
			for(int pos=0;pos<MAX;pos++){
				out.println("Lettura della frazione "+(pos+1));
				int num= in.readInt("Numeratore?");
				int den= in.readInt("Denominatore?");
				frazioni[pos]=new Frazione(num, den);
				somma= somma.piu(frazioni[pos]);
			}
			
			media= somma.diviso(new Frazione(MAX));
			Frazione piuVicina=null, distanzaPiuVicina=null, distanzaCorrente;
			
		  /*for(int pos=0; pos<frazioni.length;pos++){
				if(frazioni[pos].isMinore(media))
					distanzaCorrente=media.meno(frazioni[pos]);
				else
					distanzaCorrente=frazioni[pos].meno(media);
				
				if(distanzaPiuVicina == null || distanzaCorrente.isMinore(distanzaPiuVicina)){
					piuVicina=frazioni[pos];
					distanzaPiuVicina=distanzaCorrente;
				}
			}*/
			for(Frazione f:frazioni){
				if(f.isMinore(media))
					distanzaCorrente=media.meno(f);
			else
					distanzaCorrente=f.meno(media);
				
				if(distanzaPiuVicina == null || distanzaCorrente.isMinore(distanzaPiuVicina)){
					piuVicina=f;
					distanzaPiuVicina=distanzaCorrente;
				}
			}
			
			out.println("La media è: "+media.toString());
			out.println("La frazione più vicina alla media è: "+piuVicina);
			out.println("La sua distanza dalla media è: "+distanzaPiuVicina);
		}
	}
}
