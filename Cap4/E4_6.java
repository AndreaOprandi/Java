package Cap4;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E4_6 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String input;
		String linea="--------------------";
		int conta;
		
		conta=0;
		input=in.readLine("Stringa: ");
		
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)>96&& input.charAt(i)<123)
				conta++;
		}
		out.println(input.toUpperCase());
		out.println(linea.substring(0, input.length()));
		out.println(conta);
		
	}
}
