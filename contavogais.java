//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class contavogais{
	public static void main(String[]args){
	
	Scanner entrada =new Scanner(System.in);
	System.out.println("Bem vinda ao Programa Conta vogais");
	System.out.println("Insira a frase");
	String frase=entrada.nextLine();
	int a=0,e=0,y=0,o=0,u=0;

	for(int i=0;i< frase.length();i++){	
		char c=frase.charAt(i);
		if(c=='a'){
				a=a+1;
			}
			else if(c=='e'){
					e=e+1;
				}else if(c=='i'){
					i=i+1;
					}else if(c=='o'){
						o=i+1;
						}else if(c=='u'){
							u=i+1;
						}
		}
	System.out.println(" Vogais a= "+a+", e="+e+", i= "+y+", o= "+o+", u= "+u);
	}
	
	}  
  