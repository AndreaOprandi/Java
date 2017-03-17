package Cap4;

/*Questo esercizio comprende il controllo richiesto dall'esercizio 4.20,
 * se viene inserita una data futura alla data odierna ritorna i giorni mancanti
 * a quella data
 */
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Data;

public class E4_19 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		Data dt,dtG;
		int g,m,a,diff;
		
		diff=0;
		
		dtG = new Data();
		out.println("Inserisci la tua data di nascita: ");
		g = in.readInt("Giorno? ");
		m = in.readInt("Mese? ");
		a = in.readInt("Anno? ");
		
		dt = new Data(g,m,a);
		out.println("Data odierna: "+ dtG.getGiornoDellaSettimana() + " "
				+ dtG.getGiorno() + " " + dtG.getMeseDellAnno() + dtG.getAnno());
		out.println("Data di nascita: " + dt.getGiornoDellaSettimana() +" "
				+ dt.getGiorno()	+" "+ dt.getMeseDellAnno() +" "+ dt.getAnno());
		diff=dt.quantoManca(dtG);
		if(diff<0)
			out.println("Mancano ancora: " + (-diff) + "giorni");
		if(diff==0)
			out.println("Le due date sono coincidenti.");
		if(diff>0)
			out.println("Differenza rispetto a oggi: "+ dt.quantoManca(dtG)+ " giorni");
	}
}
