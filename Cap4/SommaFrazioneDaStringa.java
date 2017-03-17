package Cap4;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class SommaFrazioneDaStringa {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		Frazione fr;
		Frazione sum;
		
		// Stringa di input e classe involucro Character
		String input;
		Character c;
		
		// Dichiarazione variabili
		boolean correct;  //utilizzata per verificare la correttezza del formato
		boolean end;	//utilizzata per la fine della stringa
		int i,j;      //variabili contatore
		int num;   //numeratore
		int den;	//denominatore
		
		// Inizializzazione
		input = "<spazio>3/2<spazio>+<spazio>4/3<spazio>=";
		correct = false;
		end = false;
		j = 0;
		num = 0;
		den  = 0;
		sum = new Frazione(0);
		i = 0;
				
		/* Ciclo la stringa di input
		 * Formato ipotizzato:
		 * <frazione> si intende ad esempio 4/3
		 * 
		 * <spazio><frazione><spazio>+<spazio><frazione><spazio>=
		 */
		
		do{
			// Interazione con l'utente per un corretto inserimento della stringa
			if(!correct){ 
				out.println("Attenzione agli spazi e al formato: ");
				out.println(input );
				input = in.readLine("\nInserire: ");
			}
			// Setto a true la variabile correct per verificare il formato in seguito 
			correct = true;
			
			c = input.charAt(j);
			
			// Verifico la posizione da verificare nel formato specificato
			if(i==0)
				if(!(c == ' '))
						correct = false;		
			if(i==1)
				if(c.isDigit(c))
						num = c.getNumericValue(c);
				else
						correct = false;
			if(i==2)
				if(!(c == '/'))
						correct = false;
			if(i==3)
				if(c.isDigit(c))
						den = c.getNumericValue(c);
				else
						correct = false;
			if(i==4)
				if(!(c == ' '))
						correct = false;		
				else{
						fr = new Frazione(num,den);
						sum =sum.piu(fr);
				}
			if(i==5)
				if(!(c == '+') && !(c == '='))
					correct = false;
				else{
					if(c== '=')
						end = true;
				}
			
			/* Incremento di 1 la variabile che determina la posizione
			 * da verificare durante il ciclo, se la i contiene il valore 6,
			 * attraverso l'operatore % verrà risettata a 0, 
			 * cioè si ricomincia la trasformazione nel ciclo se la variabile 
			 * end non è settata a true
			 */
			
			i=(++i) % 6;
			j++;
		}while(j<input.length() && !end);
		out.println(sum);
	}
}
