package Cap4;
import java.math.*;
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class E4_7 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
	
		String equazione;
		int a,b,c;
		double delta,sol1,sol2;
		char segnoA,segnoB,segnoC;
		
		a=48;  //0
		b=48;  //0
		c=48;  //0
		segnoA=43; //+
		segnoB=43; //+
		segnoC=43; //+
		delta = 0.0;
		
		equazione = in.readLine("Scrivere l'equazione in questo formato:\n+ax+bx+c \n"
				+ "anche in caso di coefficienti mancanti(=0), \nspecificare in ogni caso il segno,"
				+ "\n non inserire l'esponente, verrà aggiunto in automatico: ");
		for(int i=0;i<equazione.length();i++){
			switch(i){
			case 0:	
					segnoA = equazione.charAt(i);
			case 1:
					a = equazione.charAt(i);
					break;
			case 3:	
				segnoB = equazione.charAt(i);
			case 4:
					b = equazione.charAt(i);
					break;
			case 6:	
				segnoC = equazione.charAt(i);
			case 7:
					c = equazione.charAt(i);
					break;
			default:
					break;
			}
		}
		
		for(int i=48, j=0;i<58;i++,j++){
				if(a==i)
					a=j;
				if(b==i)
					b=j;
				if(c==i)
					c=j;
				
		}
		
		if(segnoA==45)
				a=-a;
		if(segnoB==45)
			b=-b;
		if(segnoC==45)
			c=-c;
	
		delta=(Math.pow(b, 2))-(4*a*c);   //delta = b^2-4ac
		
		out.print("Equazione inserita: ");
		out.print("("+a+")x^2+"+"("+b+")x+"+"("+c+")");
		
		out.println("\n\nValore calcolato del DELTA: ");
		out.println("                                                " + delta);
		out.println("Soluzioni: ");
		if(delta>0){
			//X1,2=(-b+-RADQ(delta))/2a)
			sol1=(-(b)+Math.sqrt(delta))/(2*a);
			sol2=(-(b)-Math.sqrt(delta))/(2*a);
			out.println("X1=" +sol1);
			out.println("X2= " +sol2);	
		}
			else if(delta==0){
			sol1=-b*(2*a);
			out.println("X1,2= " +sol1);
		}
			else
				out.println("Nessuna soluzione");
		}
}
