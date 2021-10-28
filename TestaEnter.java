//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TestaEnter{
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		String palavra=" ";
		
		do{
			System.out.println("clique enter para terminar");
			System.out.println("Insira uma palavra");
			palavra=entrada.nextLine();
			
			
			
		}while(palavra.isEmpty()==false);
		
		System.out.println("Adeus");
		}
		
	}
	