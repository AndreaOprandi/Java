package Cap1_3;
import java.util.*;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E3_29 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager  out = new ConsoleOutputManager();
		
		Random rn = new Random();
		
		int somma=0;
		
		for(int i=0;i<20;i++){
			if(i==0)
				somma=rn.nextInt();
			else
				somma+=rn.nextInt();
		}
		out.println(somma);
	}
}
