package Cap1_3;
import java.util.Random;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E3_32 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		Random rn = new Random();
		
		int n,testa,croce;
		double testaP, croceP;
		boolean lancio;
		
		n=in.readInt("Numero lanci: ");
		
		testa=0;
		croce=0;
		
		for(int i=1;i<=n;i++){
			lancio=rn.nextBoolean();    //1 test 0 croce
			if(lancio==true)
				testa++;
			else 
				croce++;
				
			testaP=(testa/(double)i)*100;
			croceP=(croce/(double)i)*100;
			
			out.println("Testa: "+testaP);
			out.println("Croce: "+croceP);
		}
	}
}
