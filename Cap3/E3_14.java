package Cap1_3;
import prog.io.*;
import java.lang.*;
import prog.utili.*;

public class E3_14 {
	public static void main(String[] args) {
		long num,conta;
		boolean div,esci;
		
		long inizio;
		long fine;
		long  time;
		long ini,f,p;
		//algoritmo
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		ini=System.currentTimeMillis();
		num=0;
		do{
					num += 1;
					//num = in.readLong("Inserisci un numero: ");
					div=false;
					//inizio = System.currentTimeMillis();

					if(num==1 || num==2|| num==3|| num==5|| num==7|| num==11) //Numeri primi
						out.println(num+" Si");    
					else{
/*						//versione for
						for(int i=2; i<num; i++){
							if(num%i==0) div=true;
						}
						if(div) 
							out.println("No");
						else 
							out.println("Si");
						fine = System.currentTimeMillis();
						time=(fine-inizio)/1000;
						System.out.println(time + " sec");

						//versione do/while lunga
						div=false;
						inizio = System.currentTimeMillis();
						esci=false;
						conta=2;
						do{
							if(num%conta==0){
								div=true;
								esci=true;
							}
							conta++;
							if(conta==num) esci=true;
						}while(!esci);
						if(div) 
							out.println(num + "No");
						else 
							out.println(num + "Si");
						fine = System.currentTimeMillis();
						time=fine-inizio;
						System.out.println(time + " Millisec");
*/
						//versione do/while corta
						div=false;
						inizio = System.currentTimeMillis();
						esci=false;
						conta=2;
						
								int i=0;
								do{
									if(num%conta==0){
										div=true;
										break;
									}
									conta++;
								}while(conta<=Math.sqrt(num));
							
							if(!div) 
								out.println(num + "Si");
							
							fine = System.currentTimeMillis();
							time=fine-inizio;
							//System.out.println(time + " Millisec");

					}//end else
					
					//boolean continua=in.readSiNo("Vuoi continuare? S,n");
					//if(!continua) break;
		}while(num < 10000000);
		f=System.currentTimeMillis();
		p=f-ini;
		out.println("Millisecondi impiegati " + p);
		
	}
}