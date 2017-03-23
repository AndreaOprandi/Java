package cap5;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E5_2 {
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int numInteri = in.readInt("Inserisci numero di interi da leggere:");
		int[] vett= new int[numInteri];
		for(int i=0; i<numInteri;i++){
			vett[i]=in.readInt("Inserire "+(i+1)+"-esimo intero:");
		}
		
		int temp;
		for(int i=0;i<(numInteri-1);i++){
			for(int j=i+1;j<numInteri;j++){
				if(vett[i]>vett[j]){
					temp=vett[i];
					vett[i]=vett[j];
					vett[j]=temp;
				}
			}
		}
		for(int i=0;i<numInteri;i++)
			out.print(vett[i]+" ");
	}
}
