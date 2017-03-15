package Cap1_3;
import prog.io.*;

public class E3_2 {
public static void main(String[] args) {
	ConsoleInputManager in = new ConsoleInputManager();
	ConsoleOutputManager out = new ConsoleOutputManager();
	
	int len, conta;
	String nome, cognome;
	char a[];
	
	nome= in.readLine("Inserisci il tuo nome: ");
	cognome = in.readLine("Inserisci il tuo cognome: ");
	if(nome.length() >= cognome.length())
		len=nome.length() + 4;
	else
		len=cognome.length() + 4;
	
	a=new char[len];
	
	conta=0;
	do{
		if (conta==0){
			for(int i = 0; i<len; i++){
				a[i]='*';
				out.print(a);
			}
		}else if(conta==1){
			for(int i=0;i<len;i++){
					if(i==0) out.print(a[i]);
					else if(i>0 && i<len-1)
						out.print("");
					else out.println(a[i]);
			}
			//else
			
		}
	}while(conta<7);
	
	
	
	
}
}
