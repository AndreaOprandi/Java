package cap5;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class E5_3 {
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int numFrazioni = in.readInt("Inserisci numero di frazioni da leggere:");
		Frazione[] frazioni= new Frazione[numFrazioni];
		for(int i=0; i<numFrazioni;i++){
			out.println("Inserire "+(i+1)+"-esima frazione:");
			int num = in.readInt("Numeratore?: ");
			int den = in.readInt("Denominatore?: ");
			frazioni[i]= new Frazione(num, den);
		}
		
		Frazione temp;
		for(int i=0;i<(numFrazioni-1);i++){
			for(int j=i+1;j<numFrazioni;j++){
				if(frazioni[i].isMaggiore(frazioni[j])){
					temp=frazioni[i];
					frazioni[i]=frazioni[j];
					frazioni[j]=temp;
				}
			}
		}
		for(int i=0;i<numFrazioni;i++)
			out.print(frazioni[i]+" ");
	}
}
