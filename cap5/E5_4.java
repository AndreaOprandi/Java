package cap5;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E5_4 {
	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int MAX=10;
		int[] tabella=new int[MAX];
		
		int pos=0;
		int x=in.readInt("Inserire un intero: ");
		while(x!=0){
			tabella[pos]=x;
			pos++;
			x=in.readInt("Inserire un intero:");
			if(pos==MAX){
				MAX=2*MAX;
				int[] temp= new int[MAX];
				for(int j=0;j<pos;j++){
					temp[j]=tabella[j];
				}
				tabella=temp;
			}
		}
		for(int i=0;i<pos;i++)
			out.print(tabella[i]+" ");
	}
}
