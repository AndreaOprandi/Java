package Cap4;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.text.html.MinimalHTMLWriter;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E4_8 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		double Area,random_PosX,x,y,integr,random_PosY;
		int puntiTot,puntiSotto;
		boolean esci;
		
		Random rn = new Random();
		
		//inizializzazione variabili
		esci = false;
		puntiTot = 0;
		puntiSotto = 0;
		 
		
		//interfacciamento con utente
		do{
				x = in.readDouble("X: ");
				y = in.readDouble("Y: ");
				esci=(x>1)&&(y>1)&&(x<=y)?true:false;
				if(!esci)
					out.println("X e Y maggiori o uguali di 1 \n e X minore o uguale di Y");
		}while(!esci);
		
		
		Area = (y-x)*Math.log(y);
		
		out.println("Area: " + Area);
		out.println("Altezza massima: " + Math.log(y));
		
		out.println("Il procedimento potrebbe impiegare qualche minuto... ");
		for(int  i=0;i<500000000;i++){
			do{		
				random_PosX=rn.nextDouble()*y;
				if(random_PosX>=x)
					break;
			}while(true);
			
			random_PosY = rn.nextDouble() * Math.log(y);
			
			/*
			 * Verifico se il punto sta sotto la funzione
			 */
			
			if(random_PosY < Math.log(random_PosX))   
				puntiSotto++;
			
			if((puntiTot % 10000000)==0)
				out.println("Calcolati " + puntiTot + " numeri, attendere...");
				
			//stampo punto generato
			//out.println("Punto: X= " + random_PosX + " " + "Y= " + random_PosY);
			puntiTot++;
		}
		
		
		out.println("--------------------------------------------------------");
		out.println("Punti sotto la funzione: " + puntiSotto);
		
		out.println("Integrale = " + (puntiSotto*Area)/puntiTot);
		}
}
