package Cap1_3;
import prog.io.*;
import prog.utili.*;

public class E3_17 {
	static ConsoleOutputManager out = new ConsoleOutputManager();
	static ConsoleInputManager in = new ConsoleInputManager();
	
	
	public static void main(String[] args) {
		
		Frazione f,tot;
		int exp,num, den;
		
		num=0;
		den=1;
		exp=1;
		
		num=in.readInt("Numeratore: ");
		if(num!=0)
			den=in.readInt("Denominatore: ");
		
		f = new Frazione(num,den);
		tot=new Frazione(0);
		
		exp=in.readInt("Esponente: ");
		if(exp == 0)
			out.println("0");
		else {
				if(exp > 0){
					   tot = f;
					   tot = fra(f,exp,tot);
				   }
				   else{
					   f =new Frazione(den,num);
					   tot=f;
					   tot = fra(f, -exp,tot);
				   }
				
				out.println(tot);
		}
	}
	
	public static Frazione fra(Frazione a,int giro,Frazione tot){		
			if(giro==1){
				return tot;
			}
			else{
				tot=tot.per(a);
				return fra(a,giro-1,tot);
			}
		}
}
