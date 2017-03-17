package Cap4;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E4_23 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String input;
		//Character c;
		int c,conta;
		input = in.readLine("Stringa: ");
		
		c=0;
		//maiuscole
		for(char a=65;a<91;a++){
			conta=0;
			for(int i=0;i<input.length();i++){
				c = input.charAt(i);
					if(c==a)
						conta++;
			}
			if(conta!=0)
					out.println(a +": " +  conta);
		}
		//minuscole
		for(char a=97;a<123;a++){
			conta=0;
			for(int i=0;i<input.length();i++){
				c = input.charAt(i);
					if(c==a)
						conta++;
			}
			if(conta!=0)
				out.println(a +": " +  conta);
		}
	}
}
