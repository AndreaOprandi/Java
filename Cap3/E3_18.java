package Cap1_3;
/*Ordinamento lessicografico di stringhe (MIN e MAX)*/
import prog.io.*;
import prog.utili.*;

public class E3_18 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String str, min, max;
		boolean ex,primo;
		
		ex=true;
		primo=true;
		max="";
		min="";
		do{
			str =in.readLine("Inserisci una stringa: ");
			
			if(primo){
				max=str;
			    min=str;
			    primo=false;
			}
			else{
				if(str.compareTo(max)>0)
					max=str;
				
				if(str.compareTo(min)<0)
					min=str;
			}
			ex=in.readSiNo("Continui?S o n");
		}while(ex);
		
		out.println("Min: "+min);
		out.println("Max: "+max);
	}
}
