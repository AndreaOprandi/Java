package Cap1_3;
import prog.io.*;
import prog.utili.*;

public class E3_16 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int num, den;
		boolean ex,first;
		Frazione min = new Frazione(0);
		Frazione max = new Frazione(0);
		Frazione f;
		
		num = 0;
		den = 1;
		ex=true;
		first = true;
		 do{
			 num=in.readInt("Inserisci il numeratore: ");
			 if(num!=0)         // se il valore del numeratore è diverso da 0 chiedo anche il denominatore
				 den=in.readInt("Inserisci il denominatore: ");
			 
			 f= new Frazione(num, den);
			 
			 if(first){
				 max=f;
			 	min=f;
			 	first=false;
			 }
			 else{
				 if(f.isMaggiore(max))
			 		max=f;
			 	if(f.isMinore(min))
			 	   min=f;
			 }
			 	
			 ex = in.readSiNo("Vuoi continuare? S , n");
		 }while(ex);
		 
		 out.println("Frazione maggiore: "+max.toString());
		 out.println("Frazione minore: "+min.toString());
	}
}
