package Cap1_3;
import prog.io.*;
import prog.utili.Frazione;

public class E3_1 {
	public static void main(String[] args) {
		Frazione f1;
		Frazione f2;
		int a=0,b=1,c=0,d=1;
		
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		a = in.readInt("inserisci il numeratore della prima frazione: ");
		do{
			b = in.readInt("inserisci il denominatore della prima frazione(diverso da 0): ");
			if(b != 0 )
				break;
		}while(true);
		
		f1 = new Frazione(a,b);
		
		c = in.readInt("inserisci il numeratore della seconda frazione: ");
		do{
			d = in.readInt("inserisci il denominatore della seconda frazione(diverso da 0): ");
			if(d != 0 )
				break;
		}while(true);
		
		f2 = new Frazione(c,d);
		
		out.println("Prima frazione inserita: "+f1);
		out.println("Seconda frazione inserita: " +f2);
		
		if(f1.isMinore(f2))
			out.println(f1 + "<" + f2);
		else if(f1.isMaggiore(f2))
			out.println(f1 + ">" + f2);
		else if(f1.equals(f2))
			out.println(f1 + "="+f2);
	}
}
