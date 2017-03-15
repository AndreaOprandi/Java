package Cap1_3;
import prog.io.*;
import prog.utili.*;

public class E3_21 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		Frazione f;
		int n,num,den,conta;
		
		n=in.readInt("Numero: ");
		num = 1;
		den=1;
		f = new Frazione(num, den);
		out.print(f);
		do{
			den++;
			f = new Frazione(num, den);
			out.print("+" + f);
		}while(den<n);
		out.print("\n\n ---------------- \n\n");
		conta=0;
		n=in.readInt("Numero: ");
		num = 1;
		den=1;
		f = new Frazione(num, den);
		out.print(f);
		den++;
		do{
			f=new Frazione(num,den);
			den=den*den;
			out.print("+" + f);
			conta++;
		}while(conta<n);
	}
}
