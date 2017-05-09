package cap5;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E5_1 {

	public static void main(String[] args) {
		
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String s=in.readLine("Inserisci stringa da analizzare: ");
		final int max = 26;
		int[] lettere= new int[max];
		for(int i=0; i<max;i++){
			lettere[i]=0;
		}
		
		for(int i=0; i<s.length();i++){
			char c=s.charAt(i);
			if(c-'a'>=0 && c-'a'<26)
			lettere[c-'a']++;
		}
		
		for(int i=0;i<max;i++){
			char c=(char) ('a'+i);
			
			if(lettere[i]>0)
			out.println("Numero di lettere \""+c+"\" nella sequenza è: "+lettere[i]);
		}
	}
}
