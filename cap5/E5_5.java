package cap5;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class E5_5 {
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
		
		int temp;
		for(int i=0;i<(MAX-1);i++){
			for(int j=i+1;j<MAX;j++){
				if(tabella[i]>tabella[j]){
					temp=tabella[i];
					tabella[i]=tabella[j];
					tabella[j]=temp;
				}
			}
		}
		for(int i=0;i<MAX;i++){
			if(tabella[i]!=0)
			out.print(tabella[i]+" ");
		}
	}
}
