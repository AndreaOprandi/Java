package Cap4;

import prog.io.*;

public class E4_5 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String a,b;
		int aC,bC,am,aM,conta,lT;
		char len;
		
		a=in.readLine("Inserisci una stringa: ");
		b=in.readLine("Inserisci una stringa: ");
		
		aC=a.length();
		bC=b.length();
		len = aC>bC? 'a' : 'b';
		lT = aC+bC;
		conta=0;
		for(int i =0; i<aC;i++){
			if(a.charAt(i)=='A' || a.charAt(i)=='a')
				conta++;
		}
		
		out.println("Numero totale della prima stringa(a):  " + aC);
		out.println("Numero totale della seconda stringa(b):  " + bC);
		out.println("Numero totale delle stringhe:  " + lT);
		out.println("Stringa più lunga:  "  + len + " " + b);
		out.println("Numero complessivo di lettere 'A' e 'a' in (a):  " + conta);
		
	}
}
