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
		
		double Area;					//valore area rettangolo
		double x,y;						//coordinate inserite dall'utente
		double random_PosX;	//posizione del punto generata asse x 
		double random_PosY;	//posizione del punto generata asse y
		
		int puntiTot;    //punti totali generati
		int puntiSotto; //punti totali sotto la funzione
		
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
		
		// Calcolo area
		Area = (y-x)*Math.log(y);
		
		// Informazioni a video
		out.println("Area: " + Area);
		out.println("Altezza massima: " + Math.log(y));
		out.println("Il procedimento potrebbe impiegare qualche minuto... ");
		
		// Generazione dei punti 
		for(int  i=0;i<500000000;i++){
			/* Genero valore su asse X e verifico che 
			 * sia nel range x e y (inseriti
			 *  dall'utente)
			*/
			do{		
				random_PosX=rn.nextDouble()*y;
				if(random_PosX>=x)
					break;
			}while(true);
			// Fine generazione e controllo X
			
			// Genero valore su asse Y del punto 
			random_PosY = rn.nextDouble() * Math.log(y);
			//Fine generazione e controllo Y
			
			// Verifico se il punto sta sotto la funzione
			if(random_PosY < Math.log(random_PosX))   
				puntiSotto++;
			// Fine verifica
			
			// Informo lo stato di avanzamento all'utente
			if((puntiTot % 10000000)==0)
				out.println("Calcolati " + puntiTot + " numeri, attendere...");
				
			// Incremento i numero dei punti generati di 1
			puntiTot++;
		}
		
		// Stampo i risultati ottenuti
		out.println("--------------------------------------------------------");
		out.println("Punti sotto la funzione: " + puntiSotto);
		
		out.println("Integrale = " + (puntiSotto*Area)/puntiTot);
		}
}
