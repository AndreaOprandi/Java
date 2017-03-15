package Cap1_3;
import prog.utili.*;
import prog.io.*;

public class E3_5 {
public static void main(String[] args) {
	int n;
	
	ConsoleInputManager in = new ConsoleInputManager();
	ConsoleOutputManager out = new ConsoleOutputManager();
	
	Intero num;
	String nume;
	n = in.readInt("Inserisci un intero: ");
	
	num= new Intero(n);
	nume = num.toString();
	if((n/2) == nume.length() ) 
		out.println("La lunghezza della parola " + num + " è "
				+   nume.length()  + ", uguale alla meta' di " + n);
	else
		out.println("La lunghezza della parola " + num + " è "
				+   nume.length()  + ", mentre la meta' di " + n + " e'  " + n/2);
}
}
