package Cap1_3;
import java.io.Console;

import prog.io.*;

public class E3_3 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String prima,seconda;
		
		prima = in.readLine("Inserisci la prima parola: ");
		seconda = in.readLine("Inserisci la seconda parola: ");
		
		if(prima.compareTo(seconda)==0)
			out.println("Le due stringhe sono uguali");
		else {
			out.println("Ordine alfabetico: ");
			if((prima.compareTo(seconda))<0)
				out.println(prima + "\n" + seconda);
			else
				out.println(seconda + "\n" + prima);
				
			
			out.println("Ordine di lunghezza: ");
			
			if(prima.length() == seconda.length())
				out.println("Le due stringhe hanno la stessa lunghezza");
			else{
				if(prima.length() < seconda.length())
					out.println(prima + "\n" + seconda);
				else
					out.println(seconda + "\n" + prima);
			}
		}
	}
}

