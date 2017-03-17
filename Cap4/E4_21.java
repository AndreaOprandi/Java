package Cap4;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E4_21 {
	public static void main(String[] args) {
					ConsoleOutputManager out = new ConsoleOutputManager();
					ConsoleInputManager in = new ConsoleInputManager();
						
					char c;
					
					c = in.readChar("Lettera: ");
					
					switch(c){
						case 'A':
						case 'C':
							out.println("AAA");
						case 'D':
						case 'W':
							out.println("EEE");
						default:
							out.println("ddd");
						case 'H':
							break;
						case 'J':
							out.println("kkk");
							break;
						case 'G':
						case 'P':
							out.println("e");
						}
	}
}
