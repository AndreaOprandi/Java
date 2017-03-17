package Cap4;
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E4_15 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int n,min,max;
		Integer nI,maxI,minI;
		boolean first;
		
		/* inizializzazione iniziale */
		first=true;
		maxI = null;
		minI = null;
		min = 0;
		max = 0;
		
		/*
		 *  Incorporati i due "metodi"
		 */
		do {
			n=in.readInt("Numero: ");
			nI=n;
			//se il valore è 0 esco
			if(n==0)
				break;
			//se è il primo valore inizializzo tutto con quel valore
			if(first){
				max=n;
				min=n;
				maxI=nI;
				minI=nI;
				first=false;
			}
			//se non è il primo comincio con le verifiche
			else{
				//verifico il massimo e il minimo di interi
				if(max<n)
					max=n;
				if(min>n)
					min=n;
				
				//verifico il massimo e il minimo tra Oggetti
				if(maxI.compareTo(nI) < 0)
					maxI=nI;
				if(minI.compareTo(nI) > 0)
					minI=nI;
			}	
		}while(true);
		
		//se è stato inserito almeno un valore
		if(!first){
			out.println("Max: " + max);
			out.println("Min: " + min);
			
			out.println("MaxI: " + maxI);
			out.println("MinI: " + minI);
		}
		else
			out.println("Nessun valore utile inserito.");
	}
}
