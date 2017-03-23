package cap5;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E5_6 {
	public static void main(String[] args) {
		
		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String[] a= {"cane","gatto","elefante"};
		
		for(String s:a){
			out.println("Stringa: "+s);
			s=in.readLine("Nuova stringa? ");
			out.println("E' stata inserita la stringa "+s);
		}
			
		out.println("Contenuto dell'array: ");
		for(String s:a)
			out.println(s);
	}

}
