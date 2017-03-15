package Cap1_3;
import prog.io.*;
import prog.utili.Intero;


public class E3_15 {
	public static void main(String[] args) {
			ConsoleOutputManager out = new ConsoleOutputManager();
			ConsoleInputManager in = new ConsoleInputManager();
			
			int inf, sup;
			String num;
			Intero nume;
			
			inf = in.readInt("Estremo inferiore: ");
			sup = in.readInt("Estremo superiore: ");
			
			for(int i = inf+1; i < sup; i++){
				nume=new Intero(i);
				num=nume.toString();
				if(num.length() == i/2 )
					out.println(i);
			}
	}
}
