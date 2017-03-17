package Cap4;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E4_16 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String input;
		Character c;
		int i;
		boolean find;
		
		find=false;
		i=0;
		
		do{
			if(find)
				out.println("Errore inserimeto, ammesse solo cifre");
			find=false;
			input = in.readLine("Stringa: ");
			while( input!=null && i<input.length() && find!=true){
					c = input.charAt(i);
					if(!c.isDigit(c.charValue()) && c.charValue()!=' ')
						find=true;

					i++;
			}
			if(!find)
				break;
		}while(true);
		
		out.println("Stringa verificata");
	}
}
